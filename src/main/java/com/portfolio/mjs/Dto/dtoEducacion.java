package com.portfolio.mjs.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
    @NotBlank
    private String tituloEdu;
    @NotBlank
    private String startEdu;
    @NotBlank
    private String endEdu;
    @NotBlank
    private String scoreEdu;
    @NotBlank
    private String desEdu;

  //Constructor
    public dtoEducacion() {
    }

    public dtoEducacion(String tituloEdu, String startEdu, String endEdu, String scoreEdu, String desEdu) {
        this.tituloEdu = tituloEdu;
        this.startEdu = startEdu;
        this.endEdu = endEdu;
        this.scoreEdu = scoreEdu;
        this.desEdu = desEdu;
    }
    
    //Getters y Setters
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