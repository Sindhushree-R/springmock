package com.jecm4.idfcmock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jecm4.idfcmock.dto.EmployeeDto;

@Repository
public interface Urepository extends JpaRepository<EmployeeDto, Integer> {

}
