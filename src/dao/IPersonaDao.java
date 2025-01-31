package dao;

import java.util.List;

import entidades.Persona;

public interface IPersonaDao {
    public boolean insert(Persona persona);

    public boolean update(Persona persona);

    public boolean delete(Persona persona);

    public List<Persona> listar();

    public boolean ExistePersona(Persona persona);
}
