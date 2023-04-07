package com.jecm4.idfcmock.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jecm4.idfcmock.dto.EmployeeDto;
import com.jecm4.idfcmock.repository.Urepository;


@Component
public class EmployeeDao {

	@Autowired
	Urepository repository;

	public void insert(EmployeeDto dto) {
		repository.save(dto);
	}

	public String remove(int id) {
		repository.deleteById(id);
		return "data removed succesfully";	
	}
	public EmployeeDto fetch(EmployeeDto dto) {
		Optional<EmployeeDto> dto2=repository.findById(dto.getEmp_id());
		return dto2.get();
	}
}
