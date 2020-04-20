package com.cyb.dubbo.api.rest.service;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cyb.dubbo.api.service.dto.StudentDTO;
import com.cyb.dubbo.api.service.query.StudentIdsQuery;
import com.cyb.dubbo.api.service.query.StudentQuery;

@Path("students")
@Produces(MediaType.APPLICATION_JSON)
public interface StudentRestService {

	@GET
	List<StudentDTO> listByQuery(@BeanParam StudentQuery query);

	@GET
	@Path("{ids:\\d?,[\\d,]*}")
	List<StudentDTO> listByIds(@PathParam("ids") StudentIdsQuery query);

	@GET
	@Path("{id:\\d+}")
	StudentDTO getById(@PathParam("id") Integer id);

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	Integer save(StudentDTO student);

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	void update(StudentDTO student);
}
