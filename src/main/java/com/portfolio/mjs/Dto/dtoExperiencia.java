package com.portfolio.mjs.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String empresaExp;
    @NotBlank
    private String posicionExp;
    @NotBlank
    private String startExp;
    @NotBlank
    private String endExp;
    @NotBlank
    private String tiempoExp;
    @NotBlank
    private String modoExp;
    @NotBlank
    private String imagenExp;
    @NotBlank
    private String desExp;
    
    //Constructor

    public dtoExperiencia() {
    }

    public dtoExperiencia(String empresaExp, String posicionExp, String startExp, String endExp, String tiempoExp, String modoExp, String imagenExp, String desExp) {
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
