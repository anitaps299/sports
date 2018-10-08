package com.cursojava2018.atsistemas.anapastor.sports.service;


import java.util.Optional;

import com.cursojava2018.atsistemas.anapastor.sports.model.Club;

public interface ClubService {

	/**
	 * Crea un Club en la BD
	 * @param club Representa los datos del Club a crear
	 * @return Club creado
	 */
	Club create(Club club);

	Optional<Club> findById(Integer idClub);

}
