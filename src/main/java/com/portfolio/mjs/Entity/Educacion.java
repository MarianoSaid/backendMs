 package com.portfolio.mjs.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Educacion {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idEdu; 
   
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
      
   @NotNull
   @Size(min = 1, max = 250, message = "No cumple con la longitud")
   private String desEdu;

   //constructores
    public Educacion() {
    }
   
    public Educacion(String tituloEdu, String startEdu, String endEdu, String scoreEdu, String desEdu) {
        this.tituloEdu = tituloEdu;
        this.startEdu = startEdu;
        this.endEdu = endEdu;
        this.scoreEdu = scoreEdu;
        this.desEdu = desEdu;
    }
   
   //Getters y setters

    public int getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(int idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public String getStartEdu() {
        return startEdu;
    }

    public void setStartEdu(String startEdu) {
        this.startEdu = startEdu;
    }

    public String getEndEdu() {
        return endEdu;
    }

    public void setEndEdu(String endEdu) {
        this.endEdu = endEdu;
    }

    public String getScoreEdu() {
        return scoreEdu;
    }

    public void setScoreEdu(String scoreEdu) {
        this.scoreEdu = scoreEdu;
    }

    public String getDesEdu() {
        return desEdu;
    }

    public void setDesEdu(String desEdu) {
        this.desEdu = desEdu;
    }
    
    
}
