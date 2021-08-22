package materias.dao;

import java.util.List;

public interface IDao <T> {
    // métodos básicos
    T guardar(T t);
    List<T> buscarTodos();
}
