package com.portfolio.mjs.Controller;

import com.portfolio.mjs.Entity.HyS;
import com.portfolio.mjs.Interface.IHySService;
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
public class HySController {
    
//Controlador llama a la interfaz del servicio, quien llama al servicio
    @Autowired IHySService ihysService;
     
    @GetMapping("HyS/traer")  
        public List<HyS> getHyS(){
            return ihysService.getHyS();
    }
        
    @PostMapping("HyS/crear")
        public String createHyS (@RequestBody HyS hys){
            ihysService.saveHyS(hys);
            return "La habilidad fue creada correctamente";
    }
    
    @DeleteMapping("HyS/borrar/{id}")
        public String deleteHyS (@PathVariable Long id){
            ihysService.deleteHyS(id);
            return "La habilidad fue eliminada correctamente";
    }        
  
    //URL:PUERTO/HyS/editar/1/nombreSkill&percentSkill&...
    @PutMapping("HyS/editar/{id}")    
        public HyS hys (@PathVariable Long id,
                                        @RequestParam("nombreSkill") String nuevoNombreSkill,
                                        @RequestParam("percentSkill") int nuevoPercentSkill,
                                        @RequestParam("imagenSkill") String nuevoImagenSkill){
            HyS hys = ihysService.findHyS(id);
            hys.setNombreSkill(nuevoNombreSkill);
            hys.setPercentSkill(nuevoPercentSkill);
            hys.setImagenSkill(nuevoImagenSkill);
                        
            ihysService.saveHyS(hys);
            return hys;
        }
        
        @GetMapping("/HyS/traer/perfil")
        public HyS findHyS(){
            return  ihysService.findHyS((long)1);
        }
}
