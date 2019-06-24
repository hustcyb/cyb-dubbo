package com.cyb.dubbo.consumer.controller;

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
import com.cyb.dubbo.api.service.query.StudentQuery;

@RequestMapping("rest/students")
@RestController
public class StudentRestController {

	@Reference(url = "rest://localhost:1080/cyb-dubbo-provider/")
	private StudentRestService studentRestService;

	@GetMapping
	public List<StudentDTO> listByQuery(StudentQuery query) {
		return studentRestService.listByQuery(query);
	}
	
	@GetMapping("{id}")
	public StudentDTO getById(@PathVariable Integer id) {
		return studentRestService.getById(id);
	}
	
	@PostMapping
	public Integer save(@RequestBody StudentDTO student) {
		return studentRestService.save(student);
	}
	
	@PutMapping
	public void update(StudentDTO student) {
		studentRestService.update(student);
	}
}
