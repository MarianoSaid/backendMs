package com.portfolio.mjs.Service;

import com.portfolio.mjs.Entity.Educacion;
import com.portfolio.mjs.Repository.IEducacionRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpEducacionService {
    @Autowired 
    IEducacionRepository ieducacionRepository;
       
    public List<Educacion> list(){
       return ieducacionRepository.findAll();
    }
    
    public Optional <Educacion> getOne(int id) {
     return ieducacionRepository.findById(id);
    } 
    
    public Optional<Educacion> getByTituloEdu(String tituloEdu){
        return ieducacionRepository.findByTituloEdu(tituloEdu);
    }
    
    public void save(Educacion educacion) {
      ieducacionRepository.save(educacion);
    }
    
    public void delete(int id) {
     ieducacionRepository.deleteById(id);
    }
       
    public boolean existsById (int id){
        return ieducacionRepository.existsById(id);
    }
  
     public boolean existsByTituloEdu (String tituloEdu){
       return ieducacionRepository.existsByTituloEdu(tituloEdu);
    }
     
}
