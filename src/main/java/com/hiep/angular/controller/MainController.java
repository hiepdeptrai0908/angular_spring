package com.hiep.angular.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiep.angular.entity.AngularEntity;
import com.hiep.angular.mapper.AngularMapper;
import com.hiep.angular.model.AngularModel;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("angular")
@Slf4j
@CrossOrigin
public class MainController {

	@Autowired
	private AngularMapper angularMapper;

	@GetMapping
	public List<AngularEntity> getData() {
		List<AngularEntity> datas = new ArrayList<AngularEntity>();

		datas = angularMapper.getData();

		return datas;
	}

	@GetMapping("/{id}")
	public List<AngularEntity> getDataById(@PathVariable int id) {
		log.info("getID:{}", id);
		return angularMapper.getDataById(id);
	}
	
	@PostMapping("add")
	public List<AngularEntity> addData(@RequestBody AngularModel angularModel) {
		log.info("add:{}", angularModel);

		angularMapper.addData(angularModel);

		List<AngularEntity> datas = new ArrayList<AngularEntity>();
		datas = angularMapper.getData();

		return datas;
	}

	@PostMapping("delete/{id}")
	public List<AngularEntity> deleteDataById(@PathVariable int id, String result) {
		log.info("delete:{}", id);
		angularMapper.deleteDataById(id);
		List<AngularEntity> datas = new ArrayList<AngularEntity>();
		datas = angularMapper.getData();

		return datas;
	}
	
	@PostMapping("edit")
	public List<AngularEntity> editData(@RequestBody AngularModel angularModel) {
		
		log.info("edit:{}", angularModel);

		angularMapper.updateData(angularModel);

		List<AngularEntity> datas = new ArrayList<AngularEntity>();
		datas = angularMapper.getData();

		return datas;
	}
}
