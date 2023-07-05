package Administrador;

import Convertibles.Moneda;
import Convertibles.Temperatura;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu {

    private String eleccion;
    private Moneda moneda = new Moneda();
    private Temperatura temperatura = new Temperatura();

    public Menu() {
    }

    public void conversorMonedas(double cantidad) {
        eleccion = JOptionPane.showInputDialog(null, "ELIJE A QUE CONVERSION DE MONEDA QUIERES PASAR??",
                "CONVERSION DE MONEDA", 0, new ImageIcon("C:\\Users\\carlo\\OneDrive\\Documents\\NetBeansProjects\\Conversor_1\\src\\Imagenes\\Moneda.png"),
                new Object[]{"MXN-USD", "MXN-EUR", "MXN-L", "MXN-YEN", "MXN-Won sul-coreano",
                    "USD-MXN", "EUR-MXN", "L-MXN", "YEN-MXN", "Won sul-coreano-MXN"},
                "").toString();
        switch (eleccion) {
            case "MXN-USD":
                moneda.convertir(0, cantidad);
                break;
            case "MXN-EUR":
                moneda.convertir(1, cantidad);
                break;
            case "MXN-L":
                moneda.convertir(2, cantidad);
                break;
            case "MXN-YEN":
                moneda.convertir(3, cantidad);
                break;
            case "MXN-Won sul-coreano":
                moneda.convertir(4, cantidad);
                break;
            case "USD-MXN":
                moneda.convertir(5, cantidad);
                break;
            case "EUR-MXN":
                moneda.convertir(6, cantidad);
                break;
            case "L-MXN":
                moneda.convertir(7, cantidad);
                break;
            case "YEN-MXN":
                moneda.convertir(8, cantidad);
                break;
            case "Won sul-coreano-MXN":
                moneda.convertir(9, cantidad);
                break;
        }
    }

    public void conversorTemperatura(double cantidad) {
        eleccion = JOptionPane.showInputDialog(null, "ELIJE A QUE CONVERSION DE TEMPERATURA QUIERES PASAR??",
                "CONVERSION DE TEMPERATURA", 0, new ImageIcon("C:\\Users\\carlo\\OneDrive\\Documents\\NetBeansProjects\\Conversor_1\\src\\Imagenes\\Temperatura.png"),
                new Object[]{"Celsius-Farenheit", "Farenheit-Celsius", "Kelvin-Celsius", "Celsius-Kelvin", "Farenheit-Kelvin"}, "").toString();
        switch (eleccion) {
            case "Celsius-Farenheit":
                temperatura.convertir(0, cantidad);
                break;
            case "Farenheit-C":
                temperatura.convertir(1, cantidad);
                break;
            case "Kelvin-Celsius":
                temperatura.convertir(2, cantidad);
                break;
            case "Celsius-Kelvin":
                temperatura.convertir(3, cantidad);
                break;
            case "Farenheit-Kelvin":
                temperatura.convertir(4, cantidad);
                break;
        }
    }

}
