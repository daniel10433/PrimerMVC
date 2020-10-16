/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvc.Controlador;

import com.mycompany.mvc.Modelo.Calculadora;
import com.mycompany.mvc.Vista.Vista1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Daniel Perez
 */
public class Controlador implements ActionListener {

    private Vista1 vista;
    private Calculadora modelo;

    /**
     * Constructor que inicia las diferentes acciones
     *
     * @param vista
     * @param modelo
     */
    public Controlador(Vista1 vista, Calculadora modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.jCoperacion.addActionListener(this);
    }

    /**
     * metodo que inicia la vista
     */
    public void iniciar() {

        vista.setTitle("MVC Calculadora");
        vista.setLocationRelativeTo(null);

    }

    /**
     * Evento que se ejecuta al selecionar una operacion
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (vista.jCoperacion.getSelectedItem().toString().equals("Sumar")) {
            modelo.setNumero1(Integer.parseInt(vista.TN1.getText()));
            modelo.setNumero2(Integer.parseInt(vista.TN2.getText()));
            modelo.sumar();
            vista.jTresultado.setText(String.valueOf(modelo.getResultado()));
        }
        if (vista.jCoperacion.getSelectedItem().toString().equals("Restar")) {
            modelo.setNumero1(Integer.parseInt(vista.TN1.getText()));
            modelo.setNumero2(Integer.parseInt(vista.TN2.getText()));
            modelo.restar();
            vista.jTresultado.setText(String.valueOf(modelo.getResultado()));
        }
        if (vista.jCoperacion.getSelectedItem().toString().equals("Multiplicar")) {
            modelo.setNumero1(Integer.parseInt(vista.TN1.getText()));
            modelo.setNumero2(Integer.parseInt(vista.TN2.getText()));
            modelo.multiplicar();
            vista.jTresultado.setText(String.valueOf(modelo.getResultado()));
        }
        if (vista.jCoperacion.getSelectedItem().toString().equals("Dividir")) {
            modelo.setNumero1(Integer.parseInt(vista.TN1.getText()));
            modelo.setNumero2(Integer.parseInt(vista.TN2.getText()));
            modelo.dividir();
            vista.jTresultado.setText(String.valueOf(modelo.getResultado()));
        }

    }

}
