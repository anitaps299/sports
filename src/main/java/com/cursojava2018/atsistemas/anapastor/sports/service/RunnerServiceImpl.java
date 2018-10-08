package com.cursojava2018.atsistemas.anapastor.sports.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cursojava2018.atsistemas.anapastor.sports.dao.RunnerDAO;
import com.cursojava2018.atsistemas.anapastor.sports.model.Club;
import com.cursojava2018.atsistemas.anapastor.sports.model.Runner;

@Service
public class RunnerServiceImpl implements RunnerService{

	@Autowired
	RunnerDAO runnerDao;
	@Autowired
	ClubService clubService;
	
	@Override
	public List<Runner> findAllByClub(Pageable pagination, Integer idClub) {
		final Optional<Club> club = clubService.findById(idClub);
		return runnerDao.findByClub(club, pagination).getContent();
	}

	@Override
	public Runner create(Runner runner, Integer idClub) {
		final Optional<Club> club = clubService.findById(idClub);
		runner.setClub(club.get());
		club.get().addRunner(runner);
		return runnerDao.save(runner);
	}

	@Override
	public Optional<Runner> findById(Integer idRunner) {
		return runnerDao.findById(idRunner);
	}

	@Override
	public void update(Integer idClub, Runner runner) {
		final Optional<Club> club = clubService.findById(idClub);
		runner.setClub(club.get());
		runnerDao.saveAndFlush(runner);
		
	}

	@Override
	public void delete(Integer idRunner, Integer idClub) {
		final Optional<Club> club = clubService.findById(idClub);
		final Optional<Runner> runner = findById(idRunner);
		club.get().removeRunner(runner.get());
		runnerDao.deleteById(idRunner);
	}

	

}
