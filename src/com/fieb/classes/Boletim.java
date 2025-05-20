package com.fieb.classes;

public class Boletim {

    private Long id;
    private String numeroBoletim;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double nota5;
    private double nota6;
    private double media;

    // Setter´s e Getter´s

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroBoletim() {
        return numeroBoletim;
    }

    public void setNumeroBoletim(String numeroBoletim) {
        this.numeroBoletim = numeroBoletim;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if(nota1 < 0  || nota1 > 10){
            nota1 = 0;
        }
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if(nota2 < 0  || nota2 > 10){
            nota2 = 0;
        }
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {

        if(nota3 < 0  || nota3 > 10){
            nota3 = 0;
        }
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {

        if(nota4 < 0  || nota4 > 10){
            nota4 = 0;
        }
        this.nota4 = nota4;
    }

    public double getNota5() {
        return nota5;
    }

    public void setNota5(double nota5) {
        if(nota5 < 0  || nota5 > 10){
            nota5 = 0;
        }
        this.nota5 = nota5;
    }

    public double getNota6() {
        return nota6;
    }

    public void setNota6(double nota6) {
        if(nota6 < 0  || nota6 > 10){
            nota6 = 0;
        }
        this.nota6 = nota6;

    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {

        if(media < 0  || media > 10){
            media = 0;
        }
        this.media = nota1;
    }
}
