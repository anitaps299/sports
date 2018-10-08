package com.cursojava2018.atsistemas.anapastor.sports.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Club {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idClub;
	
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "club")
	private List<Runner> runners = new ArrayList<>();
	
	public void addRunner(Runner runner) {
		if(!runners.contains(runner)) {
			runners.add(runner);
		}
	}
	
	public void removeRunner(Runner runner) {
		runners.remove(runner);
	}
	
	
}
