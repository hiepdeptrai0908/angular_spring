package com.hiep.angular.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hiep.angular.entity.AngularEntity;
import com.hiep.angular.model.AngularModel;

@Mapper
public interface AngularMapper {

	List<AngularEntity> getData();

	int addData(AngularModel angularModel);

	List<AngularEntity> getDataById(int id);

	int deleteDataById(int id);

	int updateData(AngularModel angularModel);
	
}
