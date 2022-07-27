package com.portfolio.mjs.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idProyecto; 
   
   @NotNull
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String nombreProyecto;
  
   @NotNull
   @Size(min = 1, max = 250, message = "No cumple con la longitud")
   private String desProyecto;
   
   @NotNull
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String anioProyecto;
      
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String imagenProyecto;
       
}
         