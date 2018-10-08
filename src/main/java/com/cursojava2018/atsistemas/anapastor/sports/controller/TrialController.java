package com.cursojava2018.atsistemas.anapastor.sports.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava2018.atsistemas.anapastor.sports.dto.TrialDTO;
import com.cursojava2018.atsistemas.anapastor.sports.mapper.TrialMapper;
import com.cursojava2018.atsistemas.anapastor.sports.model.Trial;
import com.cursojava2018.atsistemas.anapastor.sports.service.TrialService;

@RestController
@RequestMapping(value = "/trial")
public class TrialController {	
	@Autowired
	TrialMapper trialMapper;
	@Autowired
	TrialService trialService;
	
	@PostMapping
	public TrialDTO create(@RequestBody TrialDTO trialToCreate) {
		final Trial trial = trialMapper.mapToModel(trialToCreate);
		final Trial trialCreated = trialService.create(trial);
		return trialMapper.mapToDto(trialCreated);
	}

}
