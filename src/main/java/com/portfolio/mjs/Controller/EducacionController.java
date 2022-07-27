package com.portfolio.mjs.Controller;

import com.portfolio.mjs.Entity.Educacion;
import com.portfolio.mjs.Interface.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    @Autowired IEducacionService ieducacionService;
    
    @GetMapping ("educaciones/traer")
    public List<Educacion> getEducacion(){
       return ieducacionService.getEducacion();
    }  
    
    @PostMapping("educaciones/crear")
    public String createEducacion(@RequestBody Educacion educacion){
       ieducacionService.saveEducacion(educacion);
        return "La educación fue creada correctamente";
    }
    
    @DeleteMapping("educaciones/borrar/{id}")
       public String deleteEducacion(@PathVariable Long id){
       ieducacionService.deleteEducacion(id);
       return "La educacion fue eliminada correctamente";
    }
    //URL:PUERTO/educaciones/editar/5/tituloEdu&startEdu&endEdu&...     
    @PutMapping("educaciones/editar/{id}")  
        public Educacion editEducacion(@PathVariable Long id,
                                       @RequestParam("tituloEdu") String nuevoTituloEdu,   
                                       @RequestParam("startEdu") String nuevoStartEdu,
                                       @RequestParam("endEdu") String nuevoEndEdu,
                                       @RequestParam("scoreEdu") String nuevoScoreEdu,
                                       @RequestParam("imagenEdu") String nuevoImagenEdu,
                                       @RequestParam("desEdu") String nuevoDesEdu){
        Educacion educacion = ieducacionService.findEducacion(id);
        educacion.setTituloEdu(nuevoTituloEdu);
        educacion.setStartEdu(nuevoStartEdu);
        educacion.setEndEdu(nuevoEndEdu);
        educacion.setScoreEdu(nuevoScoreEdu);
        educacion.setImagenEdu(nuevoImagenEdu);
        educacion.setDesEdu(nuevoDesEdu);
        
        ieducacionService.saveEducacion(educacion);
        return educacion;
        }
        
     @GetMapping("/educaciones/traer/perfil")
        public Educacion findEducacion(){
            return  ieducacionService.findEducacion((long)1);
        }
}



        
        
