package com.rp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rp.dao.Traineedao;
import com.rp.entity.Trainee;

@Service
@Transactional
public class TraineeServiceImpl  implements TraineeService{
	
	@Autowired
	Traineedao dao;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		return dao.addTrainee(trainee);
	}

	@Override
	public Trainee updateTrainee(Trainee Trainee) {
		
		return dao.updateTrainee(Trainee);
	}

	@Override
	public String deleteTrainee(int trId) {
		
		return dao.deleteTrainee(trId);
	}

	@Override
	public Trainee getTrainee(int trId) {
	
		return dao.getTrainee(trId);
	}

	@Override
	public List<Trainee> getAllTrainees() {
		
		return dao.getAllTrainees();
	}

}
