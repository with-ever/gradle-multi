package com.withever.web.post.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.withever.model.Post;
import com.withever.web.post.service.PostService;

/**
 * @author FIC04901
 *
 */
@Controller
@RequestMapping(value="/post")
public class PostController {
	@Autowired
	private PostService postService;
	
	
	@RequestMapping(value="/save",  method=RequestMethod.GET)
	public String savePost() throws Exception {
		Post post = new Post();
		post.setBoardTypeCode("0000001");
		post.setTitle("저장테스트1");
		post.setContent("저장저장");
		post.setRegId("jsg");
		postService.save(post);
		return "NewFile";		
	}
	 @RequestMapping("/test")
	    public ModelAndView mav() throws Exception{
	        ModelAndView mav = new ModelAndView("main");
	        
	        List<Post> list = postService.postList();
	        
	        mav.addObject("list", list);
	        
	        return mav;
	    }


}
