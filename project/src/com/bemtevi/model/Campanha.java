package com.bemtevi.model;
import java.util.ArrayList;
import java.util.List;

public class Campanha implements Gerencimanento{
    /*
     * codigo da campanha(ID), nome da campanha, descrição, (com
     * identificação fiscal - boolean), meta de arrecadação, período de
     * "duração" e local de atuação
     */

     /*
      * Métodos: listarCampanhas, contribuir ?
      */

    private Contribuicao contribuicao;
    private int codigo; // ID da campanha
    private String nome;
    private String descricao;
    private boolean identificacaoFiscal; // Se possui identificação fiscal
    private double metaArrecadacao; // Meta de arrecadação em dinheiro
    private int duracao; // Duração da campanha (em dias)
    private String localAtuacao;

   
    public Campanha(Contribuicao contribuicao, int codigo, String nome, String descricao, boolean identificacaoFiscal,double metaArrecadacao, int duracao, String localAtuacao) {
        this.contribuicao = contribuicao;
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.identificacaoFiscal = identificacaoFiscal;
        this.metaArrecadacao = metaArrecadacao;
        this.duracao = duracao;
        this.localAtuacao = localAtuacao;
    }


    public Contribuicao getContribuicao() {
        return contribuicao;
    }

    public void setTipoContribuicao(Contribuicao contribuicao) {
        this.contribuicao = contribuicao;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public boolean getIdentificacaoFiscal() {
        return identificacaoFiscal;
    }

    public void setIdentificacaoFiscal(boolean identificacaoFiscal) {
        this.identificacaoFiscal = identificacaoFiscal;
    }

    public double getMetaArrecadacao() {
        return metaArrecadacao;
    }

    public void setMetaArrecadacao(double metaArrecadacao) {
        this.metaArrecadacao = metaArrecadacao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getLocalAtuacao() {
        return localAtuacao;
    }

    public void setLocalAtuacao(String localAtuacao) {
        this.localAtuacao = localAtuacao;
    }


    @Override
    public void cadastrar(List<Campanha> campanhas) {
        for (Campanha c : campanhas) {
            campanhas.add(c);        
        }
    }


    @Override
    public void listar(List<Campanha> campanhas) {
        if (campanhas.isEmpty()) {
            System.out.println("Nenhuma campanha cadastrada.");
        } else {
            System.out.println("Campanhas disponíveis:");
            for (Campanha campanha : campanhas) {
                System.out.println(campanha);
            }
        }
    }
}

