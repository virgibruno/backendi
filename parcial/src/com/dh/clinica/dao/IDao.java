package com.dh.clinica.dao;

import java.util.List;

public interface IDao <T>{
    T guardar(T t);
    List<T> buscarTodos();
}
