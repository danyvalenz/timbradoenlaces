package com.example.Timbrado_Enlaces.service;

import java.util.List;

public interface ICRUD<E> {

    List<E> findAll();

    E findById(Integer id);

    E save(E e);

    E update(E e, Integer id);

    boolean deleteById(Integer id);

}
