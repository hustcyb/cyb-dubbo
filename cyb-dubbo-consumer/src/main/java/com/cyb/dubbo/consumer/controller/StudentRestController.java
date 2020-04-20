package com.cyb.dubbo.consumer.controller;

import java.util.Collection;
import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyb.dubbo.api.rest.service.StudentRestService;
import com.cyb.dubbo.api.service.dto.StudentDTO;
import com.cyb.dubbo.api.service.query.StudentIdsQuery;
import com.cyb.dubbo.api.service.query.StudentQuery;

@RequestMapping("rest/students")
@RestController
public class StudentRestController {

	@Reference(protocol = "rest")
	private StudentRestService studentRestService;

	@GetMapping
	public List<StudentDTO> listByQuery(StudentQuery query) {
		return studentRestService.listByQuery(query);
	}
	
	@GetMapping("{id:\\d+}")
	public StudentDTO getById(@PathVariable Integer id) {
		return studentRestService.getById(id);
	}
	
	@GetMapping("{ids:\\d*,[\\d,]*}")
	public List<StudentDTO> listByIds(@PathVariable Collection<Integer> ids) {
		StudentIdsQuery query = new StudentIdsQuery(ids);
		return studentRestService.listByIds(query);
	}
	
	@PostMapping
	public Integer save(@RequestBody StudentDTO student) {
		return studentRestService.save(student);
	}
	
	@PutMapping
	public void update(@RequestBody StudentDTO student) {
		studentRestService.update(student);
	}
}
