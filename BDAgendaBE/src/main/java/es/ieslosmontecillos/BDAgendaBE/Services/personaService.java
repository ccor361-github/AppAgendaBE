package es.ieslosmontecillos.BDAgendaBE.Services;

import es.ieslosmontecillos.BDAgendaBE.entity.Persona;
import java.util.List;

public interface personaService {
    public List<Persona> findAll();
    public Persona save(Persona persona);
    public Persona findById(Long id);
    public void delete(Persona persona);
}