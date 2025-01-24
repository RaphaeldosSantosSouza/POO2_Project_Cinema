package model.dao;

import model.dao.implementacion.AssentoDaoJDBC;
import model.dao.implementacion.ClienteDaoJDBC;
import model.dao.implementacion.FilmeDaoJDBC;
import model.dao.implementacion.IngressoDaoJDBC;
import model.dao.implementacion.SalaDaoJDBC;
import model.dao.implementacion.SessaoDaoJDBC;

//Injecao de dependencia sem insplicitar a implementacao
public class DaoFactory {
    
    public static SalaDao createSalaDao(){
        return new SalaDaoJDBC();
    }
    
    public static AssentoDao createAssentoDao(){
        return new AssentoDaoJDBC();
    }
    
    public static ClienteDao createClienteDao(){
        return new ClienteDaoJDBC();
    }
    
    public static FilmeDao createFilmeDao(){
        return new FilmeDaoJDBC();
    }
    
    public static IngressoDao createIngressoDao(){
        return new IngressoDaoJDBC();
    }
    
    public static SessaoDao createSessaoDao(){
        return new SessaoDaoJDBC();
    }
    
}
