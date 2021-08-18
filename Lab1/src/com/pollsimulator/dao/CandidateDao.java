package com.pollsimulator.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.pollsimulator.model.Candidate;

public class CandidateDao {

	static List<Candidate> candidateList = new ArrayList<Candidate>();
	
	public static boolean register (Candidate c)
	{
		for(Candidate temp: candidateList)
		{
			if(temp.getId() == c.getId())
				return false;
		}
		candidateList.add(c);
		return true;
	}
	public static List<Candidate> getAllCandidates ()
	{
		return candidateList;
	}
	public static List<Candidate> showWinner()
	{
		List<Candidate> result = new ArrayList<Candidate>(2);
		Collections.sort(candidateList);
		result.add(candidateList.get(0));
		result.add(candidateList.get(1));
		return result;
	}
}
