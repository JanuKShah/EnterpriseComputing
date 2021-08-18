package com.pollsimulator.model;


public class Candidate implements Comparable<Candidate>{
	private long id;
	private String name;
	private int votes;
	public Candidate()
	{
		votes=0;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVotes() {
		return votes;
	}
	public void addVote()
	{
		votes+=1;
	}
	@Override
	public int compareTo(Candidate o) {
		return o.getVotes() - this.getVotes();
	}

	
}
