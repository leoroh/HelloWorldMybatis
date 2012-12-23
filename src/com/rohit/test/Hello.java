package com.rohit.test;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.apple.eawt.Application;
import com.mybatis.demo.bo.UserBO;
import com.mybatis.demo.vo.UserVO;

// Plain old Java Object it does not extend as class or implements 
// an interface

// The class registers its methods for the HTTP GET request using the @GET annotation. 
// Using the @Produces annotation, it defines that it can deliver several MIME types,
// text, XML and HTML. 

// The browser requests per default the HTML MIME type.

//Sets the path to base URL + /hello
@Path("/hello")
public class Hello {

  // This method is called if TEXT_PLAIN is request
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<UserVO> sayPlainTextHello() throws Exception {
	  UserBO bo = new UserBO();
		UserVO vo = new UserVO();

		vo.setAddress("Test");
		vo.setEmail("test@gmail.com");
		vo.setFullName("Full Name");
		vo.setMobile("12411515");

		System.out.println(bo.createUser(vo));
		System.out.println(bo.getUsers());

		
		return bo.getUsers();
  }



} 