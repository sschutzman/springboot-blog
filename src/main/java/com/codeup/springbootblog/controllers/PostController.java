package com.codeup.springbootblog.controllers;

import com.codeup.springbootblog.models.Post;
import com.codeup.springbootblog.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {
    private final PostService service;


    public PostController(PostService service) {
        this.service = service;
    }

    @RequestMapping("/posts")
    public String index(Model viewAndModel) {

        Iterable<Post> posts = service.findAll();
                viewAndModel.addAttribute("posts", posts);
        return "posts/index";
    }

       @RequestMapping("/posts/{id}")
        public String show(@PathVariable long id, Model viewAndModel) {
            Post post = service.findOne(id);
            viewAndModel.addAttribute("post",post);
            return "posts/show";
        }

        @RequestMapping("/posts/create")
        @ResponseBody
        public String showCreateForm(Model viewModel) {
        viewModel.addAttribute("post",new Post());
            return "posts/create";
        }

        @PostMapping("/posts/create")
        @ResponseBody
        public String createPost(@ModelAttribute Post post) {
        service.save(post);
            return "redirect:/posts";
        }

        @PostMapping("/posts/{id}/edit")
        @ResponseBody
        public String showEditForm(@PathVariable long id, Model viewAndModel){
            Post post = service.findOne(id);
            viewAndModel.addAttribute("post",post);
            return "posts/edit";
        }

        @PostMapping("/posts/{id}/edit")
        public String updatePost(@PathVariable long id, @ModelAttribute Post post){
            post.setId(id);
            service.save(post);
            return "redirect:/posts";
        }

        @PostMapping("/posts/{id}/delete")
        public String delete(@PathVariable long id){
            service.delete(id);
            return "redirect:/posts";
        }


    }
