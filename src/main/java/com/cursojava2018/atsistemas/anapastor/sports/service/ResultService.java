package com.cursojava2018.atsistemas.anapastor.sports.service;

import java.util.Optional;

import com.cursojava2018.atsistemas.anapastor.sports.model.Result;

public interface ResultService {

	Result create(Result result, Integer idTrial, Integer idRunner);

	Optional<Result> findById(Integer idResult);

}
