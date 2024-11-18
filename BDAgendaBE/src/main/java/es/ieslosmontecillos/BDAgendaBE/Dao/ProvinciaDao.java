package es.ieslosmontecillos.BDAgendaBE.Dao;

import es.ieslosmontecillos.BDAgendaBE.entity.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinciaDao extends JpaRepository<Provincia, Long> {

}