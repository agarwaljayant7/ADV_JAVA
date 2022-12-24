package com.jayant.factory;

import com.jayant.dao.UserDao;
import com.jayant.dao.UserDaoImpl;

public class UserDaoFactory {

	private static UserDao userDao = null;
	static {
		userDao = new UserDaoImpl();
	}
	public static UserDao getUserDao() {
		return userDao;
	}
}
