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
public class Runners {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer idRunner;
	
	String name;
	Integer year;
}
