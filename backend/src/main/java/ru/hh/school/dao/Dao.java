package ru.hh.school.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

  Optional<T> get(int id);
  List<T> getAll();
  void save();
  void update(T t);
  void delete(T t);
}
