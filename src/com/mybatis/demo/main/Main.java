package com.mybatis.demo.main;

import com.mybatis.demo.bo.UserBO;
import com.mybatis.demo.vo.UserVO;

public class Main {
	
	public static void main(String a[]) throws Exception {

		UserBO bo = new UserBO();
		UserVO vo = new UserVO();

		vo.setAddress("Test");
		vo.setEmail("test@gmail.com");
		vo.setFullName("Full Name");
		vo.setMobile("12411515");

		System.out.println(bo.createUser(vo));
		System.out.println(bo.getUsers());

		vo = bo.getUserById(2);
		vo.setAddress("Test Updated11 Address");
		vo.setEmail("testupdated@gmail.com");
		vo.setFullName("Full Name Test");
		vo.setMobile("1241151511");
		bo.updateUser(vo);

		vo = bo.getUserById(1);

		System.out.println(vo);

		//bo.deleteUser(vo);
	}
}
