package ru.hh.school.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VacancyDto {
  private int id;
  private String name;
  private AreaDto area;
  private SalaryDto salary;
  @JsonProperty("published_at")
  private String createdAt;
  private EmployerBriefDto employer;


}
