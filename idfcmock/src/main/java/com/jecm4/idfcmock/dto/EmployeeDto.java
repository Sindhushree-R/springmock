package com.jecm4.idfcmock.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class EmployeeDto {
	@Id
	private int emp_id;
	private String emp_name;
	private String emp_emailid;
	private long emp_phno;

}
