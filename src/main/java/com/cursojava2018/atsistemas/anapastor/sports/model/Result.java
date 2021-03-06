package com.cursojava2018.atsistemas.anapastor.sports.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Result {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idResult;
	
	private Integer seconds;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Runner runner;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Trial trial;
	
	
}
