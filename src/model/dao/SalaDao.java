package model.dao;

import java.util.List;
import model.Sala;

public interface SalaDao {
    
    void insert(Sala obj);
    void update(Sala obj);
    Sala findById(Integer id);
    List<Sala> findByAll();
    
}
