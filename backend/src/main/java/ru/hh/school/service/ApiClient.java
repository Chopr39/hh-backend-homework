package ru.hh.school.service;

import ru.hh.school.dto.EmployerDto;
import ru.hh.school.dto.EmployersDto;
import ru.hh.school.dto.VacanciesDto;
import ru.hh.school.dto.VacancyDto;

import javax.inject.Singleton;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {
  private static final String API_URL = "https://api.hh.ru";
  private static final String HEADER = "User-Agent";
  private static final String HEADER_VALUE = "hh-school-homework (v.e.chuprov@gmail.com)";
  private Client client = ClientBuilder.newClient();

  public EmployersDto getEmployers(String query, int page, int perPage) {
    return client.target(API_URL)
        .path("employers")
        .queryParam("text", query)
        .queryParam("page", String.valueOf(page))
        .queryParam("per_page", String.valueOf(perPage))
        .request(MediaType.APPLICATION_JSON)
        .header(HEADER, HEADER_VALUE)
        .get(EmployersDto.class);
  }

  public EmployerDto getEmployer(int id) {
    return client.target(API_URL)
        .path("employers/" + id)
        .request(MediaType.APPLICATION_JSON)
        .header(HEADER, HEADER_VALUE)
        .get(EmployerDto.class);
  }

  public VacanciesDto getVacancies(String query, int page, int perPage) {
    return client.target(API_URL)
        .path("vacancies")
        .queryParam("text", query)
        .queryParam("page", String.valueOf(page))
        .queryParam("per_page", String.valueOf(perPage))
        .request(MediaType.APPLICATION_JSON)
        .header(HEADER, HEADER_VALUE)
        .get(VacanciesDto.class);
  }

  public VacancyDto getVacancy(int id) {
    return client.target(API_URL)
        .path("vacancies/" + id)
        .request(MediaType.APPLICATION_JSON)
        .header(HEADER, HEADER_VALUE)
        .get(VacancyDto.class);
  }
}
