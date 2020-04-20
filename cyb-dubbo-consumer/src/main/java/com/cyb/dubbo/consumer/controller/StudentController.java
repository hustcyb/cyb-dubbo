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

import com.cyb.dubbo.api.service.StudentService;
import com.cyb.dubbo.api.service.dto.StudentDTO;
import com.cyb.dubbo.api.service.query.StudentQuery;

@RequestMapping("students")
@RestController
public class StudentController {
	
	@Reference
	private StudentService studentService;

	@GetMapping
	public List<StudentDTO> listByQuery(StudentQuery query) {
		return studentService.listByQuery(query);
	}
	
	@GetMapping("{id:\\d+}")
	public StudentDTO getById(@PathVariable Integer id) {
		return studentService.getById(id);
	}
	
	@GetMapping("{ids:\\d*,[\\d,]*}")
	public List<StudentDTO> listByIds(@PathVariable Collection<Integer> ids) {
		return studentService.listByIds(ids);
	}
	
	@PostMapping
	public Integer save(@RequestBody StudentDTO student) {
		return studentService.save(student);
	}
	
	@PutMapping
	public void update(@RequestBody StudentDTO student) {
		studentService.update(student);
	}
}
