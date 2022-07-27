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
public class Footer {
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idFoot; 
   
  @NotNull
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String apellidoFoot;
  
   @NotNull
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String nombreFoot;
  
   @NotNull
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String ciudadFoot;

    @NotNull
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String paisFoot;    
    
    
}
