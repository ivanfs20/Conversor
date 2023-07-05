/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Convertibles;

import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Temperatura {

    public Temperatura() {

    }

    //De Celcius a Faren
    //De Celcius a Kelvin
    //De Faren a Celcius
    //De Kelvin a Celcius
    //De Kelvin a Faren
    //De Faren a Kelvin
    public void convertir(int decision, double cantidad) {
        double resultado = 0;
        switch (decision) {
            case 0:
                resultado = Math.round((cantidad * 1.8) + 32);
                JOptionPane.showMessageDialog(null, resultado + " Farenheit");
                break;
            case 1:
                resultado = Math.round((cantidad - 32) * 1.8);
                JOptionPane.showMessageDialog(null, resultado + " Celsius");
                break;
            case 2:
                resultado = Math.round(cantidad - 273.15);
                JOptionPane.showMessageDialog(null, resultado + " Celsius");
                break;
            case 3:
                resultado = Math.round(cantidad + 273.15);
                JOptionPane.showMessageDialog(null, resultado + " Kelvin");
                break;
            case 4:
                resultado = Math.round(((5 / 9) * (cantidad - 32)) + 273.15);
                JOptionPane.showMessageDialog(null, resultado + " Kelvin");
                break;
        }
    }
}
