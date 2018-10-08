package com.cursojava2018.atsistemas.anapastor.sports.mapper;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cursojava2018.atsistemas.anapastor.sports.dto.TrialDTO;
import com.cursojava2018.atsistemas.anapastor.sports.model.Trial;

@Component
public class TrialMapperImpl implements TrialMapper{

	@Override
	public Trial mapToModel(TrialDTO dto){
		final Trial trial = new Trial();
		trial.setName(dto.getName());
		trial.setIdTrial(dto.getId());
		
		DateFormat dFormat = new SimpleDateFormat("yyyy/MM/dd");
		java.util.Date date;
		try {
			date = (java.util.Date) dFormat.parse(dto.getDate());
			Timestamp timestamp = new Timestamp(date.getTime());
			trial.setDate(timestamp);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		return trial;	
	}

	@Override
	public TrialDTO mapToDto(Trial model) {
		return TrialDTO.builder().id(model.getIdTrial())
				.name(model.getName())
				.date(model.getDate().toString())
				.build();
	}



}
