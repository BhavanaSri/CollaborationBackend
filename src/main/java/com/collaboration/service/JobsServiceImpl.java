package com.collaboration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collaboration.dao.JobsDao;
import com.collaboration.model.JobDetails;

@Service("jobsService")
public class JobsServiceImpl implements JobsService {

	@Autowired
	JobsDao jobsDao;
	
	public boolean addJobs(JobDetails jobDetails) {
		
		return jobsDao.addJobs(jobDetails);
	}

	public boolean updateJobs(JobDetails jobDetails) {
		
		return jobsDao.updateJobs(jobDetails);
	}

	public boolean deleteJobs(JobDetails jobDetails) {
	
		return jobsDao.deleteJobs(jobDetails);
	}

	public JobDetails getJobs(int jobId) {
		
		return jobsDao.getJobDetail(jobId);
	}

	public List<JobDetails> getAllJobs() {
		
		return jobsDao.getAllJobDetails();
	}


	
}