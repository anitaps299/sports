package com.cursojava2018.atsistemas.anapastor.sports.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trial")
	private List<Result> results = new ArrayList<>();
	
	public void addResult(Result result) {
		if(!results.contains(result)) {
			results.add(result);
		}
	}
	
	public void removeResult(Result result) {
		results.remove(result);
	}
}
