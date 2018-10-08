package com.cursojava2018.atsistemas.anapastor.sports.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;

import com.cursojava2018.atsistemas.anapastor.sports.model.Runner;

public interface RunnerService {

	List<Runner> findAllByClub(Pageable pagination, Integer idClub);

	Runner create(Runner runner, Integer idClub);

	Optional<Runner> findById(Integer idRunner);

	void update(Integer idClub, Runner runner);

	void delete(Integer idRunner, Integer idClub);

}
