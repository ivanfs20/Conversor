package Administrador;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Administrador {
    
    ImageIcon image = new ImageIcon("C:\\Users\\carlo\\OneDrive\\Documents\\NetBeansProjects\\Conversor_1\\src\\Imagenes\\MenuPrincipal.png");
    
    public void menu1() {
        
        boolean bandera = true;
        do {
            /*
            Tenemos que hacer un menu el cual sea despegable con opciones
            para que el usuario tenga la opcion de elegir el tipo
            de conversion que va a hacer: De moneda y de Temperatura
             */
            
            String dato = JOptionPane.showInputDialog(null, "ELIJE LA CONVERSION", "CONVERSOR",
                    0, image, new Object[]{"MONEDA", "TEMPERATURA", "SALIR"},
                    "MONEDA").toString();
            int valor = 0;
            switch (dato) {
                case "MONEDA":
                    valor = 1;
                    menu2(valor);
                    break;
                case "TEMPERATURA":
                    valor = 2;
                    menu2(valor);
                    break;
                case "SALIR":
                    bandera = false;
                    break;
            }
            int des = JOptionPane.showConfirmDialog(null, "Desea continuar???");
            if (des == 1) {
                JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO");
                bandera = false;
            } else if (des == 2) {
                JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO");
                
                bandera = false;
            }
        } while (bandera);
    }
    
    public void menu2(int valor) {
        /*
        Este menu nos ayudara para que el usuario tenga mas opciones de conversion
        sin importar si eligio de monedas o de temperatura
         */
        double cantidad = 0;
        
        try {
            cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Cantidad a ingresar"));
            Menu menu = new Menu();
            
            if (valor == 1) {
                menu.conversorMonedas(cantidad);
            } else {
                menu.conversorTemperatura(cantidad);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "VALOR NO VALIDO");
        }
    }
}
