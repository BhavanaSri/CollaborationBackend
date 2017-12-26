package com.collaboration.dao;

import java.util.List;

import com.collaboration.model.JobDetails;

public interface JobsDao {

	
	public boolean addJobs(JobDetails jobDetails);
	
	public boolean updateJobs(JobDetails jobDetails);
	
	public boolean deleteJobs(JobDetails jobDetails);
	
	public JobDetails getJobDetail(int jobId);
	
	public List<JobDetails> getAllJobDetails();
}
