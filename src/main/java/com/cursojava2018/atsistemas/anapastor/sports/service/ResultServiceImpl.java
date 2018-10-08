package com.cursojava2018.atsistemas.anapastor.sports.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava2018.atsistemas.anapastor.sports.dao.ResultDAO;
import com.cursojava2018.atsistemas.anapastor.sports.model.Result;
import com.cursojava2018.atsistemas.anapastor.sports.model.Runner;
import com.cursojava2018.atsistemas.anapastor.sports.model.Trial;

@Service
public class ResultServiceImpl implements ResultService{
	@Autowired
	TrialService trialService;
	@Autowired
	RunnerService runnerService;
	@Autowired
	ResultDAO resultDao;
	
	@Override
	public Result create(Result result, Integer idTrial, Integer idRunner) {
		final Optional<Trial> trial = trialService.findById(idTrial);
		result.setTrial(trial.get());
		trial.get().addResult(result);
		final Optional<Runner> runner = runnerService.findById(idRunner);
		runner.get().addResult(result);
		return resultDao.save(result);
	}

	@Override
	public Optional<Result> findById(Integer idResult) {
		return resultDao.findById(idResult);
	}

}
