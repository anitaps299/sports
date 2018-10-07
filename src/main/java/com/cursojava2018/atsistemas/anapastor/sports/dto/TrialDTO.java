package com.cursojava2018.atsistemas.anapastor.sports.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TrialDTO {
	Integer id;
	String name;
	String date; //Format: "yyyy/mm/dd"
}
