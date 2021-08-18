package com.pollsimulator.dao;

import java.util.HashSet;
import java.util.List;

import com.pollsimulator.model.Candidate;

public class StudentDao {
	static HashSet<Long> voters = new HashSet<>();
	
	public static boolean register(Long id) {
		if(voters.contains(id)) 
			return false;
		voters.add(id);
		return true;
	}
	
	public static boolean castVote(String name) {
		List<Candidate> al = CandidateDao.getAllCandidates();
		for(Candidate can:al) {
			if(can.getName().equals(name)) {
				can.addVote();
				return true;
			}
		}
		return false;
	}
}
