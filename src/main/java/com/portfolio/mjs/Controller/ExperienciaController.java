package com.portfolio.mjs.Controller;

import com.portfolio.mjs.Dto.dtoExperiencia;
import com.portfolio.mjs.Entity.Experiencia;
import com.portfolio.mjs.Security.Controller.Mensaje;
import com.portfolio.mjs.Service.ImpExperienciaService;
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
@RequestMapping("/explab")
@CrossOrigin(origins = "https://appfrontms.web.app")
public class ExperienciaController {
    //Controlador llama a la impl servicio (diferente a persona que llamaba al a interfaz del servicio)
    @Autowired 
    ImpExperienciaService impexperienciaService;
     
    @GetMapping("/lista")  
        public ResponseEntity<List<Experiencia>> list(){
            List<Experiencia> list = impexperienciaService.list();
            return new ResponseEntity(list, HttpStatus.OK);
    }
        
    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") int id){
        if(!impexperienciaService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Experiencia experiencia = impexperienciaService.getOne(id).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }    
    
    @PostMapping("/create")
        public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoexp){
            if(StringUtils.isBlank(dtoexp.getEmpresaExp()))
                return new ResponseEntity(new Mensaje("El nombre es obligatorio"),HttpStatus.BAD_REQUEST);
            
            if(impexperienciaService.existsByEmpresaExp(dtoexp.getEmpresaExp()))
                return new ResponseEntity(new Mensaje("Esa experiencia existe"), HttpStatus.BAD_REQUEST); 
            
            Experiencia experiencia = new Experiencia(dtoexp.getEmpresaExp(), dtoexp.getPosicionExp(), dtoexp.getStartExp(), dtoexp.getEndExp(), dtoexp.getTiempoExp(), dtoexp.getModoExp(), dtoexp.getImagenExp(), dtoexp.getDesExp());
            impexperienciaService.save(experiencia);
            
            return new ResponseEntity (new Mensaje("Experiencia agregada"), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
        public ResponseEntity<?>  delete(@PathVariable("id") int id){
        //Validamos si existe el ID
        if(!impexperienciaService.existsById(id)){
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
         }   
        impexperienciaService.delete(id);
        return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);
    }   
        
    //URL:PUERTO/experiencias/editar/1/empresaExp&posicionExp&...
    @PutMapping("/update/{id}")        
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoExperiencia dtoexp){
        //Validamos si existe el ID
        if(!impexperienciaService.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de experiencias
        if(!impexperienciaService.existsByEmpresaExp(dtoexp.getEmpresaExp()) && impexperienciaService.getByEmpresaExp(dtoexp.getEmpresaExp()).get().getIdExp() != id)
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtoexp.getEmpresaExp()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Experiencia experiencia = impexperienciaService.getOne(id).get();
        experiencia.setEmpresaExp(dtoexp.getEmpresaExp());
        experiencia.setPosicionExp(dtoexp.getPosicionExp());
        experiencia.setStartExp(dtoexp.getStartExp());
        experiencia.setEndExp(dtoexp.getEndExp());
        experiencia.setTiempoExp(dtoexp.getTiempoExp());
        experiencia.setModoExp(dtoexp.getModoExp());
        experiencia.setImagenExp(dtoexp.getImagenExp());
        experiencia.setDesExp(dtoexp.getDesExp());     
        
        impexperienciaService.save(experiencia);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
    }
            
       // @GetMapping("/experiencias/traer/perfil")
        //public Experiencia findExperiencia(){
          //  return  iexperienciaService.findExperiencia((long)1);
        //}
}

 

