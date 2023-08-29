package com.deadgrandead.config;

import com.deadgrandead.controller.PostController;
import com.deadgrandead.repository.PostRepository;
import com.deadgrandead.service.PostService;
import org.springframework.context.annotation.Bean;

public class JavaConfig {

    @Bean
    public PostController postController(PostService postService) {
        return new PostController(postService);
    }

    @Bean
    public PostService postService(PostRepository postRepository) {
        return new PostService(postRepository);
    }

    @Bean
    public PostRepository postRepository() {
        return new PostRepository();
    }
}
