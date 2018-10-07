package com.cursojava2018.atsistemas.anapastor.sports.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Point {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	Integer position;
	
	Integer points;

}
