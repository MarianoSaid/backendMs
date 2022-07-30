package com.portfolio.mjs.Controller;

import com.portfolio.mjs.Dto.dtoEducacion;
import com.portfolio.mjs.Entity.Educacion;
import com.portfolio.mjs.Security.Controller.Mensaje;
import com.portfolio.mjs.Service.ImpEducacionService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    @Autowired 
    ImpEducacionService impeducacionService;
    //Controlador llama a la impl servicio (diferente a persona que llamaba al a interfaz del servicio)

    @GetMapping("/lista")  
        public ResponseEntity<List<Educacion>> list(){
            List<Educacion> list = impeducacionService.list();
                return new ResponseEntity(list, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
        public ResponseEntity<?>  delete(@PathVariable("id") int id){
        //Validamos si existe el ID
            if(!impeducacionService.existsById(id)){
                 return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
         }   
        impeducacionService.delete(id);
                return new ResponseEntity(new Mensaje("Educación eliminada"), HttpStatus.OK);
    } 
    
    @PostMapping("/create")
        public ResponseEntity<?> create(@RequestBody dtoEducacion dtoeducacion){
            if(StringUtils.isBlank(dtoeducacion.getTituloEdu())){
                return new ResponseEntity(new Mensaje("El nombre es obligatorio"),HttpStatus.BAD_REQUEST);
            }
            if (impeducacionService.existsByTituloEdu(dtoeducacion.getTituloEdu())){
                return new ResponseEntity(new Mensaje("Esa educacion existe"), HttpStatus.BAD_REQUEST); 
            }
            Educacion educacion = new Educacion (dtoeducacion.getTituloEdu(),dtoeducacion.getStartEdu(),dtoeducacion.getEndEdu(),dtoeducacion.getScoreEdu(),dtoeducacion.getDesEdu());
            impeducacionService.save(educacion);
            
            return new ResponseEntity (new Mensaje("Educacion agregada"), HttpStatus.OK);
        }    
    @GetMapping("/detail/{id}")
        public ResponseEntity<Educacion> getById(@PathVariable("id") int id){
            if(!impeducacionService.existsById(id)){
                return new ResponseEntity(new Mensaje("no existe el ID"), HttpStatus.BAD_REQUEST);
            }
            
            Educacion educacion = impeducacionService.getOne(id).get();
            return new ResponseEntity(educacion, HttpStatus.OK);
        }        
    @PutMapping("/update/{id}")        
        public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoEducacion dtoeducacion){
        //Validamos si existe el ID
            if(!impeducacionService.existsById(id)){
                 return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
            }//Compara nombre de educaciones
            if(!impeducacionService.existsByTituloEdu(dtoeducacion.getTituloEdu()) && impeducacionService.getByTituloEdu(dtoeducacion.getTituloEdu()).get().getIdEdu() != id){
                return new ResponseEntity(new Mensaje("Esa educación ya existe"), HttpStatus.BAD_REQUEST);
            }//No puede estar vacio
            if(StringUtils.isBlank(dtoeducacion.getTituloEdu())){
                 return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        
        Educacion educacion = impeducacionService.getOne(id).get();
        educacion.setTituloEdu(dtoeducacion.getTituloEdu());
        educacion.setStartEdu(dtoeducacion.getStartEdu());
        educacion.setEndEdu(dtoeducacion.getEndEdu());
        educacion.setScoreEdu(dtoeducacion.getScoreEdu());
        educacion.setDesEdu(dtoeducacion.getDesEdu());
               
        impeducacionService.save(educacion);
        return new ResponseEntity(new Mensaje("Educación actualizada"), HttpStatus.OK);
    }
   
    //@GetMapping("/educaciones/traer/perfil")
       // public Educacion findEducacion(){
         //   return  ieducacionService.findEducacion((long)1);
        //}
}



        
        
