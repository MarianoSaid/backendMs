package com.portfolio.mjs.Controller;

import com.portfolio.mjs.Entity.Proyectos;
import com.portfolio.mjs.Interface.IProyectosService;
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
@CrossOrigin(origins = "https://appfrontms.web.app/")
public class ProyectosController {
    @Autowired IProyectosService iproyectosService;
    
    @GetMapping ("proyectos/traer")
    public List<Proyectos> getProyectos(){
       return iproyectosService.getProyectos();
    }  
    
    @PostMapping("proyectos/crear")
    public String createProyectos(@RequestBody Proyectos proyectos){
       iproyectosService.saveProyectos(proyectos);
        return "El proyecto fue creado correctamente";
    }
    
    @DeleteMapping("proyectos/borrar/{id}")
       public String deletePersona(@PathVariable Long id){
       iproyectosService.deleteProyectos(id);
       return "El proyecto fue eliminado correctamente";
    }
    //URL:PUERTO/proyectos/editar/5/tituloEdu&startEdu&endEdu&...     
    @PutMapping("proyectos/editar/{id}")  
        public Proyectos editProyectos(@PathVariable Long id,
                                       @RequestParam("nombreProyecto") String nuevoNombreProyecto,   
                                       @RequestParam("desProyecto") String nuevoDesProyecto,
                                       @RequestParam("anioProyecto") String nuevoAnioProyecto,
                                       @RequestParam("imagenProyecto")String nuevoImagenProyecto){
        Proyectos proyectos = iproyectosService.findProyectos(id);
        proyectos.setNombreProyecto(nuevoNombreProyecto);
        proyectos.setDesProyecto(nuevoDesProyecto);
        proyectos.setAnioProyecto(nuevoAnioProyecto);
        proyectos.setImagenProyecto(nuevoImagenProyecto);
                       
        iproyectosService.saveProyectos(proyectos);
        return proyectos;
        }
        
     @GetMapping("/proyectos/traer/perfil")
        public Proyectos findEducacion(){
            return  iproyectosService.findProyectos((long)1);
        }
}
