package ru.hh.school.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class SalaryDto {
  private int to;
  private int from;
  private String currency;
  private boolean gross;

  public int getTo() {
    return to;
  }

  public void setTo(int to) {
    this.to = to;
  }

  public int getFrom() {
    return from;
  }

  public void setFrom(int from) {
    this.from = from;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public boolean isGross() {
    return gross;
  }

  public void setGross(boolean gross) {
    this.gross = gross;
  }
}
