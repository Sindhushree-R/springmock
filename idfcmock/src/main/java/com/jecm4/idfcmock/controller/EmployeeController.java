package com.jecm4.idfcmock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jecm4.idfcmock.dao.EmployeeDao;
import com.jecm4.idfcmock.dto.EmployeeDto;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeDao dao;

	@PostMapping("/empinsert")
	public void insert(@RequestBody EmployeeDto dto) {
		dao.insert(dto);
	}

	@DeleteMapping("/empremove")
	public String delete(@RequestBody EmployeeDto dto) {
		int id = dto.getEmp_id();
		String msg = dao.remove(id);
		return msg;
	}

	@GetMapping("/empfetch")
	public EmployeeDto fetch(@RequestBody EmployeeDto dto) {
		EmployeeDto edto = dao.fetch(dto);
		return edto;
	}
}
