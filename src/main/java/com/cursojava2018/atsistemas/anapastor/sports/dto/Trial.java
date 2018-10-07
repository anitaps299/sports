package com.cursojava2018.atsistemas.anapastor.sports.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Trial {
	Integer idPrueba;
	String name;
	String date; //Format: "yyyy/mm/dd"
}
