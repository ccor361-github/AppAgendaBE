package es.ieslosmontecillos.BDAgendaBE.Services;

import es.ieslosmontecillos.BDAgendaBE.Dao.ProvinciaDao;
import es.ieslosmontecillos.BDAgendaBE.entity.Provincia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProvinciaServiceImplement implements ProvinciaService {
    @Autowired
    private ProvinciaDao provinciaDao;
    @Override
    public List<Provincia> findAll() {
        return (List<Provincia>) provinciaDao.findAll();
    }
    @Override
    public Provincia save(Provincia provincia) {
        return provinciaDao.save(provincia);
    }
    @Override
    public Provincia findById(Long id) {
        return provinciaDao.findById(id).orElse(null);
    }
    @Override
    public void delete(Provincia provincia) {
        provinciaDao.delete(provincia);
    }
}