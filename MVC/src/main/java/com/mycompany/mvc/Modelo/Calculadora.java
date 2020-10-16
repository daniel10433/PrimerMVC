/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvc.Modelo;

/**
 *
 * @author Daniel Perez
 */
public class Calculadora {

    //primer numero para realizar la operacion
    private int numero1;
    //segundo numero para realizar la operacion
    private int numero2;
    //resultado de la operacion
    private double resultado;

    /**
     * Metodo que realiza una sumar
     *
     * @return resultado
     */
    public double sumar() {
        this.resultado = this.numero1 + this.numero2;
        return this.resultado;
    }

    /**
     * Metodo que realiza una resta
     *
     * @return resultado
     */
    public double restar() {
        this.resultado = this.numero1 - this.numero2;
        return this.resultado;
    }

    /**
     * Metodo que realiza una multiplicacion
     *
     * @return resultado
     */
    public double multiplicar() {
        this.resultado = this.numero1 * this.numero2;
        return this.resultado;
    }

    /**
     * Metodo que realiza una divicion
     *
     * @return resultado
     */
    public double dividir() {
        this.resultado = this.numero1 / this.numero2;
        return this.resultado;
    }

    /**
     * Metodo que convierte la variable en publica con seguridad
     */
    public int getNumero1() {
        return numero1;
    }

    /**
     * Metodo que convierte la variable en publica con seguridad
     */
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    /**
     * Metodo que convierte la variable en publica con seguridad
     */
    public int getNumero2() {
        return numero2;
    }

    /**
     * Metodo que convierte la variable en publica con seguridad
     */
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    /**
     * Metodo que convierte la variable en publica con seguridad
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * Metodo que convierte la variable en publica con seguridad
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
