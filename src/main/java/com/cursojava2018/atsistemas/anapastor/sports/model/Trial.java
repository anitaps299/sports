package com.cursojava2018.atsistemas.anapastor.sports.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Trial {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer idTrial;
	
	String name;
	
	@Temporal(TemporalType.TIMESTAMP)
	Date date;
	
}
