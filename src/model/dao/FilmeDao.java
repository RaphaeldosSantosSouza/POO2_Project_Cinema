package model.dao;

import java.util.List;
import model.Filme;

public interface FilmeDao {
    
    void insert(Filme obj);
    void update(Filme obj);
    Filme findById(Integer id);
    List<Filme> findByAll();
    
}
