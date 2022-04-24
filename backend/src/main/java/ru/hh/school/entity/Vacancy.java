package ru.hh.school.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Vacancy {
  @Id
  private int id;
  private String name;
  private SimpleDateFormat date_create;
  private int area_id;
  private int salary_from;
  private int salary_to;
  private String salary_currency;
  private SimpleDateFormat created_at;
  private int employer_id;
  private String comment;
  private int views_count;

  @OneToMany(mappedBy = "vacancy", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Employer> employers = new ArrayList<>();

  public Vacancy() {
  }

  public Vacancy(int id, String name, SimpleDateFormat date_create, int area_id, int salary_from, int salary_to, String salary_currency, SimpleDateFormat created_at, int employer_id, String comment, int views_count, List<Employer> employers) {
    this.id = id;
    this.name = name;
    this.date_create = date_create;
    this.area_id = area_id;
    this.salary_from = salary_from;
    this.salary_to = salary_to;
    this.salary_currency = salary_currency;
    this.created_at = created_at;
    this.employer_id = employer_id;
    this.comment = comment;
    this.views_count = views_count;
    this.employers = employers;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SimpleDateFormat getDate_create() {
    return date_create;
  }

  public void setDate_create(SimpleDateFormat date_create) {
    this.date_create = date_create;
  }

  public int getArea_id() {
    return area_id;
  }

  public void setArea_id(int area_id) {
    this.area_id = area_id;
  }

  public int getSalary_from() {
    return salary_from;
  }

  public void setSalary_from(int salary_from) {
    this.salary_from = salary_from;
  }

  public int getSalary_to() {
    return salary_to;
  }

  public void setSalary_to(int salary_to) {
    this.salary_to = salary_to;
  }

  public String getSalary_currency() {
    return salary_currency;
  }

  public void setSalary_currency(String salary_currency) {
    this.salary_currency = salary_currency;
  }

  public SimpleDateFormat getCreated_at() {
    return created_at;
  }

  public void setCreated_at(SimpleDateFormat created_at) {
    this.created_at = created_at;
  }

  public int getEmployer_id() {
    return employer_id;
  }

  public void setEmployer_id(int employer_id) {
    this.employer_id = employer_id;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public int getViews_count() {
    return views_count;
  }

  public void setViews_count(int views_count) {
    this.views_count = views_count;
  }

  public List<Employer> getEmployers() {
    return employers;
  }

  public void setEmployers(List<Employer> employers) {
    this.employers = employers;
  }
}