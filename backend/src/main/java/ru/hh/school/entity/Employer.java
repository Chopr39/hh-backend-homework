package ru.hh.school.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.text.SimpleDateFormat;

@Entity
@Table(name = "employer")
public class Employer {
  @Id
  int id;
  String name;
  SimpleDateFormat date_create;
  String description;
  int area_id;
  String comment;
  int views_count;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "vacancy_id")
  private Vacancy vacancy;

  public Employer() {
  }

  public Employer(int id, String name, SimpleDateFormat date_create, String description, int area_id, String comment, int views_count, Vacancy vacancy) {
    this.id = id;
    this.name = name;
    this.date_create = date_create;
    this.description = description;
    this.area_id = area_id;
    this.comment = comment;
    this.views_count = views_count;
    this.vacancy = vacancy;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getArea_id() {
    return area_id;
  }

  public void setArea_id(int area_id) {
    this.area_id = area_id;
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

  public Vacancy getVacancy() {
    return vacancy;
  }

  public void setVacancy(Vacancy vacancy) {
    this.vacancy = vacancy;
  }
}