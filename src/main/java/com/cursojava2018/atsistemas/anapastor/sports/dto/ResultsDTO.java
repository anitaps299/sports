package com.cursojava2018.atsistemas.anapastor.sports.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultsDTO {

	Integer id;
	Integer idRunner;
	Integer seconds;
}
