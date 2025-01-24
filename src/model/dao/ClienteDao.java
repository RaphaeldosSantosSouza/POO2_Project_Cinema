package model.dao;

import java.util.List;
import model.Cliente;

public interface ClienteDao {
    
    void insert(Cliente obj);
    void update(Cliente obj);
    Cliente findById(Integer id);
    List<Cliente> findByAll();
    
}
