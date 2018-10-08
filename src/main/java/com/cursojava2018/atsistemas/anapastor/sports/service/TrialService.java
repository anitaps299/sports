package com.cursojava2018.atsistemas.anapastor.sports.service;

import java.util.Optional;

import com.cursojava2018.atsistemas.anapastor.sports.model.Trial;

public interface TrialService {

	Trial create(Trial trial);

	Optional<Trial> findById(Integer idTrial);

}
