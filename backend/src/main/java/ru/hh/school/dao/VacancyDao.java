package ru.hh.school.dao;

import ru.hh.school.entity.Vacancy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VacancyDao implements Dao<Vacancy> {

  private List<Vacancy> list = new ArrayList<>();
  @Override
  public Optional<Vacancy> get(int id) {
    return Optional.empty();
  }

  @Override
  public List<Vacancy> getAll() {
    return null;
  }

  @Override
  public void save() {

  }

  @Override
  public void update(Vacancy vacancy) {

  }

  @Override
  public void delete(Vacancy vacancy) {

  }
}
