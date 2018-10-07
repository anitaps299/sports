package com.cursojava2018.atsistemas.anapastor.sports.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursojava2018.atsistemas.anapastor.sports.model.Point;

@Repository
public interface PointDAO extends JpaRepository<Point, Integer>{

}
