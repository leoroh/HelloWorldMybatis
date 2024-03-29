package com.mybatis.demo.bo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.demo.ConnectionFactory;
import com.mybatis.demo.dao.UserDAO;
import com.mybatis.demo.vo.UserVO;

public class UserBO {

	public List<UserVO> getUsers() throws Exception {
		SqlSession session = ConnectionFactory.getSession().openSession();
		UserDAO dao = session.getMapper(UserDAO.class);
		List<UserVO> users = dao.getAllUsers();
		session.close();
		return users;
	}

	public UserVO getUserById(long id) throws Exception {
		SqlSession session = ConnectionFactory.getSession().openSession();
		UserDAO dao = session.getMapper(UserDAO.class);
		UserVO user = dao.getUserById(id);
		session.close();
		return user;
	}

	public UserVO createUser(UserVO vo) throws Exception {
		SqlSession session = ConnectionFactory.getSession().openSession();
		UserDAO dao = session.getMapper(UserDAO.class);
		dao.doCreateUser(vo);
		session.commit();
		session.close();
		return vo;
	}

	public UserVO updateUser(UserVO vo) throws Exception {
		SqlSession session = ConnectionFactory.getSession().openSession();
		UserDAO dao = session.getMapper(UserDAO.class);
		dao.doUpdateUser(vo);
		session.commit();
		session.close();
		return vo;
	}

	public int deleteUser(UserVO vo) throws Exception {
		SqlSession session = ConnectionFactory.getSession().openSession();
		UserDAO dao = session.getMapper(UserDAO.class);
		int cnt = dao.doDeleteUser(vo);
		session.commit();
		session.close();
		return cnt;
	}
}