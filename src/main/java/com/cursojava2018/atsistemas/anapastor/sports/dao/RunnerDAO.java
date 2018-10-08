package com.cursojava2018.atsistemas.anapastor.sports.dao;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursojava2018.atsistemas.anapastor.sports.model.Club;
import com.cursojava2018.atsistemas.anapastor.sports.model.Runner;

@Repository
public interface RunnerDAO extends JpaRepository<Runner, Integer>{

	Page<Runner> findByClub(Optional<Club> club, Pageable pagination);

}
