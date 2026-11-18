package com.BlogAppliction.Controller;

import com.BlogAppliction.Model.Post;
import com.BlogAppliction.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/post")

public class PostController {

    @Autowired
    private PostService service;

    @GetMapping
    public List<Post>  getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public  Post getOne(@PathVariable Long id){
        return  service.getById(id);
    }

    @PostMapping
    public Post create(@RequestBody Post post){
      return service.create(post);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @PutMapping("/{id}")
    public Post update(@PathVariable Long id,@RequestBody Post post){
        return service.update(id,post);

    }
}
