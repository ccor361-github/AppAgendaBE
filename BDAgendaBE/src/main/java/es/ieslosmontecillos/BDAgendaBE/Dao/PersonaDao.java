package es.ieslosmontecillos.BDAgendaBE.Dao;

import es.ieslosmontecillos.BDAgendaBE.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDao extends JpaRepository<Persona, Long> {

}