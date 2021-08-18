package com.pollsimulator.service;

import java.util.List;

import com.pollsimulator.dao.CandidateDao;
import com.pollsimulator.model.Candidate;

public class CandidateService {

	public static boolean registerCandidate(Candidate c)
	{
		return CandidateDao.register(c);
	}
	
	public static List<Candidate> getAllCandidates()
	{
		return CandidateDao.getAllCandidates();
	}
	
	public static List<Candidate> showWinner()
	{
		return CandidateDao.showWinner();
	}
}
