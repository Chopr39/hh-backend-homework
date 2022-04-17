package ru.hh.school.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VacanciesDto {
  private List<VacancyDto> items;

  public List<VacancyDto> getItems() {
    return items;
  }

  public void setItems(List<VacancyDto> items) {
    this.items = items;
  }
}
