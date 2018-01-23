package com.codeup.springbootblog.services;
import com.codeup.springbootblog.daos.PostDao;
import com.codeup.springbootblog.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private PostDao dao;

    public PostService(PostDao dao){
        this.dao = dao;
    }

//    private void createPosts() {
//        save(new Post("Title A","body b"));
//        save(new Post("Title B","Body B"));
//        save(new Post("Title b","body c"));
//
//    }

    public void save(Post post) {
        dao.save(post);
    }

    public Iterable<Post> findAll() {
        return dao.findAll();
    }
    public Post findOne(long id){
        return dao.findOne(id);
    }

    public void delete(long id) {
      dao.delete(id);
    }

}
