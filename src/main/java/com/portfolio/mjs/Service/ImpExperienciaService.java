package com.portfolio.mjs.Service;

import com.portfolio.mjs.Entity.Experiencia;
import com.portfolio.mjs.Repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpExperienciaService {
    @Autowired 
    IExperienciaRepository iexperienciaRepository; 
    
    public List<Experiencia> list() {
      return iexperienciaRepository.findAll();
    }
    
    public void save(Experiencia expe) {
      iexperienciaRepository.save(expe);
    }

    public void delete(int id) {
     iexperienciaRepository.deleteById(id);
    }

    public Optional <Experiencia> getOne(int id) {
     return iexperienciaRepository.findById(id);
    }
    
    public Optional<Experiencia> getByEmpresaExp(String empresaExp){
        return iexperienciaRepository.findByEmpresaExp(empresaExp);
    }
    
    public boolean existsById (int id){
        return iexperienciaRepository.existsById(id);
    }
    
    public boolean existsByEmpresaExp (String empresaExp){
       return iexperienciaRepository.existsByEmpresaExp(empresaExp);
    }
    
    
}
