package com.cursojava2018.atsistemas.anapastor.sports.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava2018.atsistemas.anapastor.sports.dao.ClubDAO;
import com.cursojava2018.atsistemas.anapastor.sports.model.Club;

@Service
public class ClubServiceImpl implements ClubService{

	@Autowired
	ClubDAO clubDao;
	
	@Override
	public Club create(Club club) {
		return clubDao.save(club);
	}

	@Override
	public Optional<Club> findById(Integer idClub) {
		return clubDao.findById(idClub);
	}

}
