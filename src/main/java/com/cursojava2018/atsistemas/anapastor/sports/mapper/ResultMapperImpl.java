package com.cursojava2018.atsistemas.anapastor.sports.mapper;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cursojava2018.atsistemas.anapastor.sports.dto.ResultDTO;
import com.cursojava2018.atsistemas.anapastor.sports.model.Club;
import com.cursojava2018.atsistemas.anapastor.sports.model.Result;
import com.cursojava2018.atsistemas.anapastor.sports.model.Runner;
import com.cursojava2018.atsistemas.anapastor.sports.service.RunnerService;

@Component
public class ResultMapperImpl implements ResultMapper{

	@Autowired
	RunnerService runnerService;
	
	@Override
	public Result mapToModel(ResultDTO dto) {
		final Optional<Runner> runner = runnerService.findById(dto.getIdRunner());
		final Result result = new Result();
		result.setIdResult(dto.getId());
		result.setRunner(runner.get());
		result.setSeconds(dto.getSeconds());
		return result;
	}

	@Override
	public ResultDTO mapToDto(Result model) {
		return ResultDTO.builder()
				.id(model.getIdResult())
				.idRunner(model.getRunner().getIdRunner())
				.seconds(model.getSeconds())
				.build();
	}


}
