package com.fieb.classes;

import java.time.LocalDate;

public class Matricula {

    private Long id;
    private String numeroMatricula;
    private LocalDate dataMatricula;
    private LocalDate dataTrancamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {

    numeroMatricula = numeroMatricula.toUpperCase();
    String primeiraLetra = numeroMatricula.substring(0, 1);
    System.out.println(primeiraLetra);
    if(primeiraLetra.equals("M")) {
        // split : "explode" uma determinada letra dentro de uma palavra e o resultado das partes é orgnanizado
        //         em um array do tipo vetor
        String [] arrayNumerico = numeroMatricula.split(primeiraLetra);

            int valorNumerico = Integer.parseInt(arrayNumerico[1]);
            if(valorNumerico > 10000){
                throw new RuntimeException( numeroMatricula + " não é uma matrícula válida");
              }
                this.numeroMatricula = numeroMatricula;
       } else {
           throw new RuntimeException( numeroMatricula + " não é uma matrícula válida");
       }
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public LocalDate getDataTrancamento() {
        return dataTrancamento;
    }

    public void setDataTrancamento(LocalDate dataTrancamento) {
        this.dataTrancamento = dataTrancamento;
    }
}
