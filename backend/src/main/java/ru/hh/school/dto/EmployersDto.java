package ru.hh.school.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployersDto {
  private List<EmployerBriefDto> items;

  public List<EmployerBriefDto> getItems() {
    return items;
  }

  public void setItems(List<EmployerBriefDto> items) {
    this.items = items;
  }
}
