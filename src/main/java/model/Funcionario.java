/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Valmir Aguiar
 */
public class Funcionario {
    private String nome;
    private double salarioBase;
    private double distanciaDoTrabalho;
    private Bonus bonus;
    
    public Funcionario(String nome, double salarioBase, double distanciaDoTrabalho) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.distanciaDoTrabalho = distanciaDoTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getDistanciaDoTrabalho() {
        return distanciaDoTrabalho;
    }

    public void setDistanciaDoTrabalho(double distanciaDoTrabalho) {
        this.distanciaDoTrabalho = distanciaDoTrabalho;
    }
    
    public Bonus getBonus() {
        return bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }
}
