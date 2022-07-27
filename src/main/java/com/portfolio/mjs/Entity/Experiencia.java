package com.portfolio.mjs.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Experiencia {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idExp; 
   
   @NotNull
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String empresaExp;
  
   @NotNull
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String posicionExp;
    
   @NotNull
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String startExp;
   
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String endExp;
   
   @NotNull
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String tiempoExp;
   
   @NotNull
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String modoExp;
   
   @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String imagenExp;
   
   @NotNull
   @Size(min = 1, max = 1000, message = "No cumple con la longitud")
   private String desExp;
  
   //Constructores
    public Experiencia() {
    }

    public Experiencia(String empresaExp, String posicionExp, String startExp, String endExp, String tiempoExp, String modoExp, String imagenExp, String desExp) {
        this.empresaExp = empresaExp;
        this.posicionExp = posicionExp;
        this.startExp = startExp;
        this.endExp = endExp;
        this.tiempoExp = tiempoExp;
        this.modoExp = modoExp;
        this.imagenExp = imagenExp;
        this.desExp = desExp;
    }
    //Getters y Setters

    public int getIdExp() {
        return idExp;
    }

    public void setIdExp(int idExp) {
        this.idExp = idExp;
    }

    public String getEmpresaExp() {
        return empresaExp;
    }

    public void setEmpresaExp(String empresaExp) {
        this.empresaExp = empresaExp;
    }

    public String getPosicionExp() {
        return posicionExp;
    }

    public void setPosicionExp(String posicionExp) {
        this.posicionExp = posicionExp;
    }

    public String getStartExp() {
        return startExp;
    }

    public void setStartExp(String startExp) {
        this.startExp = startExp;
    }

    public String getEndExp() {
        return endExp;
    }

    public void setEndExp(String endExp) {
        this.endExp = endExp;
    }

    public String getTiempoExp() {
        return tiempoExp;
    }

    public void setTiempoExp(String tiempoExp) {
        this.tiempoExp = tiempoExp;
    }

    public String getModoExp() {
        return modoExp;
    }

    public void setModoExp(String modoExp) {
        this.modoExp = modoExp;
    }

    public String getImagenExp() {
        return imagenExp;
    }

    public void setImagenExp(String imagenExp) {
        this.imagenExp = imagenExp;
    }

    public String getDesExp() {
        return desExp;
    }

    public void setDesExp(String desExp) {
        this.desExp = desExp;
    }
    
    
}
