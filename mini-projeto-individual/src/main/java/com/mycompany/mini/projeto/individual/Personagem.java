/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini.projeto.individual;

/**
 *
 * @author silvam
 */
public abstract class Personagem {

    protected String nome;
    protected Double chakra;
    protected Double ataque;
    protected Double defesa;

    public abstract String getNome();

    public abstract void setNome(String nome);

    public abstract Double getChakra();

    public abstract void setChakra(Double chakra);

    public abstract Double getAtaque();

    public abstract void setAtaque(Double ataque);

    public abstract Double getDefesa();

    public abstract void setDefesa(Double defesa);
}
