package com.cursojava2018.atsistemas.anapastor.sports.mapper;

import java.util.List;

public interface Mapper<M, DTO> {
	M mapToModel(DTO dto);
	
	DTO mapToDto(M model);
	
	List<DTO> mapToDTO(List<M> models);
}
