package com.withever.web.post.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	
	@RequestMapping(value="/save",  method=RequestMethod.POST)
	@ResponseBody
	public String savePost(HttpServletRequest request, Post post) throws Exception {
		postService.save(post);
		return "main";		
	}
	 @RequestMapping("/test")
	    public ModelAndView mav() throws Exception{
	        ModelAndView mav = new ModelAndView("main");
	        
	        List<Post> list = postService.postList();
	        
	        mav.addObject("list", list);
	        
	        return mav;
	    }


}
