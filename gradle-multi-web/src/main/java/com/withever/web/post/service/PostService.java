package com.withever.web.post.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.withever.model.Post;
import com.withever.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public Post save(Post data) {
		return postRepository.save(data);
	}
	
	public List<Post> postList(){
		
		return postRepository.findAll();
		
	}
}
