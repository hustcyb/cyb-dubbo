package com.cyb.dubbo.api.service;

import java.util.Collection;
import java.util.List;

import com.cyb.dubbo.api.service.dto.StudentDTO;
import com.cyb.dubbo.api.service.query.StudentQuery;

public interface StudentService {

	List<StudentDTO> listByQuery(StudentQuery query);
	
	List<StudentDTO> listByIds(Collection<Integer> ids);

	StudentDTO getById(Integer id);

	Integer save(StudentDTO student);

	void update(StudentDTO student);
}
