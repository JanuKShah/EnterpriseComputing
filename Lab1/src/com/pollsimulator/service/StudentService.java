package com.pollsimulator.service;

import com.pollsimulator.dao.StudentDao;

public class StudentService {
	public static boolean register(Long id) {
		return StudentDao.register(id);
	}
	
	public static boolean castVote(String name) {
		return StudentDao.castVote(name);
	}
}
