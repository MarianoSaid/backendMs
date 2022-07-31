// spring.datasource.url=localhost/8080 
 // spring.datasource.username=root
 // spring.datasource.password= */


package com.portfolio.mjs.Controller;

import com.portfolio.mjs.Entity.Footer;
import com.portfolio.mjs.Interface.IFooterService;
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
@CrossOrigin(origins = "https://appfrontms.web.app")
public class FooterController {
     //Controlador llama a la interfaz del servicio, quien llama al servicio
    @Autowired IFooterService ifooterService;
     
    @GetMapping("/footer/traer")  
        public List<Footer> getFooter(){
            return ifooterService.getFooter();
    }
        
    @PostMapping("/footer/crear")
        public String createFooter (@RequestBody Footer footer){
            ifooterService.saveFooter(footer);
            return "El footer fue creado correctamente";
    }
    
    @DeleteMapping("/footer/borrar/{id}")
        public String deleteFooter (@PathVariable Long id){
            ifooterService.deleteFooter(id);
            return "El footer fue eliminado correctamente";
    }        
    
    //URL:PUERTO/footer/editar/1/apellidoFoot&nombreFoot&...
    @PutMapping("/footer/editar/{id}")    
        public Footer footer (@PathVariable Long id,
                                        @RequestParam("apellidoFoot") String nuevoApellidoFoot,
                                        @RequestParam("nombreFoot") String nuevoNombreFoot,
                                        @RequestParam("ciudadFoot") String nuevoCiudadFoot,
                                        @RequestParam("paisFoot") String nuevoPaisFoot){
            Footer footer = ifooterService.findFooter(id);
            footer.setApellidoFoot(nuevoApellidoFoot);
            footer.setNombreFoot(nuevoNombreFoot);
            footer.setCiudadFoot(nuevoCiudadFoot);
            footer.setPaisFoot(nuevoPaisFoot);
                     
            ifooterService.saveFooter(footer);
            return footer;
        }
        
        @GetMapping("/footer/traer/perfil")
        public Footer findFooter(){
            return  ifooterService.findFooter((long)1);
        }
}
