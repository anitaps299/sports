package com.cursojava2018.atsistemas.anapastor.sports.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cursojava2018.atsistemas.anapastor.sports.dto.RunnerDTO;
import com.cursojava2018.atsistemas.anapastor.sports.model.Runner;

@Component
public class RunnerMapperImpl implements RunnerMapper{

	
	
	@Override
	public Runner mapToModel(RunnerDTO dto) {
		final Runner runner = new Runner();
		runner.setIdRunner(dto.getId());
		runner.setName(dto.getName());
		runner.setYear(dto.getYear());
		return runner;
	}

	@Override
	public RunnerDTO mapToDto(Runner model) {
		return RunnerDTO.builder()
				.id(model.getIdRunner())
				.name(model.getName())
				.year(model.getYear())
				.build();
	}

	@Override
	public List<RunnerDTO> mapToDTO(List<Runner> models) {
		return models.parallelStream().map(this::mapToDto)
				.collect(Collectors.toList());
	}

}
