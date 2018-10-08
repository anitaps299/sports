package com.cursojava2018.atsistemas.anapastor.sports.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava2018.atsistemas.anapastor.sports.dto.RunnerDTO;
import com.cursojava2018.atsistemas.anapastor.sports.mapper.RunnerMapper;
import com.cursojava2018.atsistemas.anapastor.sports.model.Runner;
import com.cursojava2018.atsistemas.anapastor.sports.service.RunnerService;

@RestController
@RequestMapping(value = "/club/{idClub}/runner")
public class RunnerController {
	@Autowired
	RunnerService runnerService;
	@Autowired
	RunnerMapper runnerMapper;
	
	
	@GetMapping
	public List<RunnerDTO> findAll(
			@PathVariable Integer idClub,
			@RequestParam(defaultValue = "0", value = "page", required = false) Integer page,
			@RequestParam(defaultValue = "3", value = "size", required = false) Integer size){
		final List<Runner> runners = runnerService.findAllByClub(PageRequest.of(page, size), idClub);
		return runnerMapper.mapToDTO(runners);
	}
	
	@GetMapping("/{idRunner}")
	public RunnerDTO findById(@PathVariable Integer idClub, 
			@PathVariable Integer idRunner) {
		final Optional<Runner> runner = runnerService.findById(idRunner);
		return runnerMapper.mapToDto(runner.get());
	}
	
	@PostMapping
	public RunnerDTO create (@RequestBody RunnerDTO runnerToCreate,
			@PathVariable Integer idClub) {
		final Runner runner = runnerMapper.mapToModel(runnerToCreate);
		final Runner runnerCreated = runnerService.create(runner, idClub);
		return runnerMapper.mapToDto(runnerCreated);
	}
	
	@PutMapping("/{idRunner}")
	public void update(@RequestBody RunnerDTO runnerToUpdate,
			@PathVariable Integer idRunner,
			@PathVariable Integer idClub) {
		final Runner runner = runnerMapper.mapToModel(runnerToUpdate);
		runner.setIdRunner(idRunner);
		runnerService.update(idClub, runner);
	}
	
	@DeleteMapping("/{idRunner}")
	public void delete(@PathVariable Integer idRunner,
			@PathVariable Integer idClub) {
		runnerService.delete(idRunner, idClub);
	}
	
}
