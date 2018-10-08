package com.cursojava2018.atsistemas.anapastor.sports.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cursojava2018.atsistemas.anapastor.sports.dto.ClubDTO;
import com.cursojava2018.atsistemas.anapastor.sports.model.Club;
import com.cursojava2018.atsistemas.anapastor.sports.service.ClubService;

@Component
public class ClubMapperImpl implements ClubMapper{
	
	@Autowired
	ClubService clubService;

	@Override
	public Club mapToModel(ClubDTO dto) {
		final Club club = new Club();
		club.setName(dto.getName());
		club.setIdClub(dto.getId());
		return club;	
	}

	@Override
	public ClubDTO mapToDto(Club model) {
		return ClubDTO.builder().id(model.getIdClub()).
				name(model.getName()).build();
	}


}
