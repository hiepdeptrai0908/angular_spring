package com.hiep.angular.model;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class AngularModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String full_name;
	
	private String email;
	
	private String phone_number;
}
