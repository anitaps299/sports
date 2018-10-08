package com.cursojava2018.atsistemas.anapastor.sports.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava2018.atsistemas.anapastor.sports.dto.ResultDTO;
import com.cursojava2018.atsistemas.anapastor.sports.mapper.ResultMapper;
import com.cursojava2018.atsistemas.anapastor.sports.model.Result;
import com.cursojava2018.atsistemas.anapastor.sports.service.ResultService;

@RestController
@RequestMapping(value = "/trial/{idTrial}/result")
public class ResultController {
	
	@Autowired
	ResultMapper resultMapper;
	@Autowired
	ResultService resultService;
	
	@PostMapping
	public ResultDTO create(@RequestBody ResultDTO resultToCreate,
			@PathVariable Integer idTrial) {
		final Result result = resultMapper.mapToModel(resultToCreate);
		Integer idRunner = resultToCreate.getIdRunner();
		final Result resultCreated = resultService.create(result, idTrial, idRunner);
		return resultMapper.mapToDto(resultCreated);
	}
	
	@GetMapping("/{idResult}")
	public ResultDTO findById(@PathVariable Integer idResult, 
			@PathVariable Integer idTrial) {
		final Optional<Result> result = resultService.findById(idResult);
		return resultMapper.mapToDto(result.get());
	}

}
