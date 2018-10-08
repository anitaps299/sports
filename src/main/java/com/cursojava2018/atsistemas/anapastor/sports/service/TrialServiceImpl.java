package com.cursojava2018.atsistemas.anapastor.sports.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava2018.atsistemas.anapastor.sports.dao.TrialDAO;
import com.cursojava2018.atsistemas.anapastor.sports.model.Trial;

@Service
public class TrialServiceImpl implements TrialService{

	@Autowired
	TrialDAO trialDao;
	
	@Override
	public Trial create(Trial trial) {
		return trialDao.save(trial);
	}

}
