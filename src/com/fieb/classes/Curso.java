package com.fieb.classes;

public class Curso {

    private Long id;
    private String nome;
    private String descricao;
    private String duracao;

    /* Método Construtor*/

    /*
    Este método é acionado toda vez que criamos um objeto a partir da classe, o método construtor pode ou não
    receber parâmetros, entretando ele não retorna nenhum tipo de dado. Na verdade o retorno é o próprio objeto criado.
    Quando um construtor não recebe parâmetros ele é chamado de "construtor padrão", toda classe criada já vem com o construtor
    padrão de "fábrica".
    Caso você crie outros construtores, a classe perde o construtor padrão, devendo ser recriado a critério.

    O objetivo principal do construtor com parâmetros é quando surge a exigência de criar objetos já com algumas características
    obrigatórias.

    Como identificar um construtor ?

    R: ELE TEM O MESMO NOME DA CLASSE

     */

   // Vamos imaginar a seguinte situação: Só é permitido a criação de curso se o mesmo vier com o nome e a descrição

    public Curso(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Recriando o construtor padrão

    public Curso() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
