package ru.hh.school.service;

import ru.hh.school.dto.EmployerDto;
import ru.hh.school.dto.VacanciesDto;
import ru.hh.school.dto.VacancyDto;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("vacancy")
public class VacancyService {
  @Inject
  private ApiClient client;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public VacanciesDto getVacancies(@QueryParam("query") String query,
                                   @QueryParam("page") int page,
                                   @QueryParam("per_page") int perPage) {
    return client.getVacancies(query, page, perPage);
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/{id}")
  public VacancyDto getVacancy(@PathParam("id") int id) {
    return client.getVacancy(id);
  }
}
