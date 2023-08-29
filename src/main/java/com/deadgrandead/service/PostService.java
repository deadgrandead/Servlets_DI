package com.deadgrandead.service;

import com.deadgrandead.exception.NotFoundException;
import com.deadgrandead.model.Post;
import com.deadgrandead.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostService {
    private final PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public List<Post> all() {
        return repository.all();
    }

    public Post getById(long id) {
        return repository.getById(id).orElseThrow(NotFoundException::new);
    }

    public Post save(Post post) {
        return repository.save(post);
    }

    public void removeById(long id) {
        repository.removeById(id);
    }
}
