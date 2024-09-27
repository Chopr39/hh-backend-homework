package ru.hh.school.dao;

import ru.hh.school.entity.Employer;

import java.util.List;
import java.util.Optional;

public class EmployerDao implements Dao<Employer> {
  @Override
  public Optional<Employer> get(int id) {
    return Optional.empty();
  }

  @Override
  public List<Employer> getAll() {
    return null;
  }

  @Override
  public void save() {

  }

  @Override
  public void update(Employer employer) {

  }

  @Override
  public void delete(Employer employer) {

  }
}
