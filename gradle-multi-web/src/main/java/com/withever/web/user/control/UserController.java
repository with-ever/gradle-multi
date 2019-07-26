package com.withever.web.user.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.withever.model.User;
import com.withever.web.user.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/save",  method=RequestMethod.GET)
	public String saveUser() throws Exception {
		User user = new User();
		user.setId("2222");
		user.setName("3333");
		return "NewFile";		
	}
	 @RequestMapping("/test")
	    public ModelAndView mav() throws Exception{
	        ModelAndView mav = new ModelAndView("NewFile");
	        
	        mav.addObject("key", "fruits");
	        
	        List<String> fruitList = new ArrayList<String>();
	        
	        fruitList.add("apple");
	        fruitList.add("orange");
	        fruitList.add("banana");
	         
	        mav.addObject("value", fruitList);
	        
	        return mav;
	    }


}
