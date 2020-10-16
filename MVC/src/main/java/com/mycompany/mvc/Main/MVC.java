/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvc.Main;

import com.mycompany.mvc.Controlador.Controlador;
import com.mycompany.mvc.Modelo.Calculadora;
import com.mycompany.mvc.Vista.Vista1;



/**
 *
 * @author Daniel Perez
 */
public class MVC {

    /**
     * @param args the command line arguments se inici al prorama se llama el
     * modelo la vista y el controlador
     */
    public static void main(String[] args) {

        Calculadora mod = new Calculadora();
        Vista1 vis = new Vista1();
        
        Controlador controlador = new Controlador(vis, mod);
        controlador.iniciar();
        vis.setVisible(true);

    }

}
