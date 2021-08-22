package dao;

import java.util.List;

public interface IDao<T> {
    T registrarNuevo(T t);
    T buscar(int id);
    List<T> buscarTodos();
    void eliminar(int id);
}
