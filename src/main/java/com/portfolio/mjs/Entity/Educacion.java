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
public class Educacion {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idEdu; 
   
   @NotNull
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String tituloEdu;
  
   @NotNull
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String startEdu;
   
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String endEdu;
   
   @NotNull
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String scoreEdu;
      
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String imagenEdu;
   
   @NotNull
   @Size(min = 1, max = 250, message = "No cumple con la longitud")
   private String desEdu;
   
   
}
