package model.dao;

import java.util.List;
import model.Assento;

public interface AssentoDao {
    
    void insert(Assento obj);
    void update(Assento obj);
    Assento findById(Integer id);
    List<Assento> findByAll();
    
}
