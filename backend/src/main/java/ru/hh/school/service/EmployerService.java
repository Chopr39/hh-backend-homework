package ru.hh.school.service;

import ru.hh.school.dto.EmployerDto;
import ru.hh.school.dto.EmployersDto;
import ru.hh.school.dto.VacanciesDto;

import javax.inject.Inject;
import javax.validation.constraints.Min;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("employer")
public class EmployerService {
  @Inject
  private ApiClient client;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public EmployersDto getEmployers(@QueryParam("query") String query,
                                   @QueryParam("page") int page,
                                   @QueryParam("per_page") int perPage) {
    return client.getEmployers(query, page, perPage);
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/{id}")
  public EmployerDto getEmployer(@PathParam("id") int id) {
    return client.getEmployer(id);
  }



}
