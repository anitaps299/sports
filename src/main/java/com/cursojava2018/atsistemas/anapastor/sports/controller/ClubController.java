package com.cursojava2018.atsistemas.anapastor.sports.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava2018.atsistemas.anapastor.sports.dto.ClubDTO;
import com.cursojava2018.atsistemas.anapastor.sports.mapper.ClubMapper;
import com.cursojava2018.atsistemas.anapastor.sports.model.Club;
import com.cursojava2018.atsistemas.anapastor.sports.service.ClubService;

@RestController
@RequestMapping(value="/club")
public class ClubController {
	
	@Autowired
	ClubMapper clubMapper;
	@Autowired
	ClubService clubService;
	
	@PostMapping
	public ClubDTO create(@RequestBody ClubDTO clubToCreate) {
		final Club club = clubMapper.mapToModel(clubToCreate);
		final Club clubCreated = clubService.create(club);
		return clubMapper.mapToDto(clubCreated);
	}

}
