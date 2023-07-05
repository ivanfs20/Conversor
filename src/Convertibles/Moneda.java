package Convertibles;

import javax.swing.JOptionPane;

public class Moneda {

    private static final double dolar = 0.059;
    private static final double euro = 0.054;
    private static final double libras = 0.046;
    private static final double yen = 76.42;
    private static final double won = 76.39;

    public void convertir(int decision, double cantidad) {

        double valor = 0;
        switch (decision) {
            case 0:
                //MXN-USD
                valor = cantidad * dolar;
                JOptionPane.showMessageDialog(null, valor + " dolares");
                break;
            case 1:
                //MXN-EUR
                valor = cantidad * euro;
                JOptionPane.showMessageDialog(null, valor + " euros");
                break;
            case 2:
                //MXN-L
                valor = cantidad * libras;
                JOptionPane.showMessageDialog(null, valor + " libras esterlinas");

                break;
            case 3:
                //MXN-YEN
                valor = cantidad * yen;
                JOptionPane.showMessageDialog(null, valor + " yenes");

                break;
            case 4:
                //MXN-Won sul-coreano
                valor = cantidad * won;
                JOptionPane.showMessageDialog(null, valor + " won");

                break;
            case 5:
                //USD-MXN
                valor = cantidad / dolar;
                JOptionPane.showMessageDialog(null, valor + " pesos mexicanos");

                break;
            case 6:
                //EUR-MXN
                valor = cantidad / euro;
                JOptionPane.showMessageDialog(null, valor + " pesos mexicanos");

                break;
            case 7:
                //L-MXN
                valor = cantidad / libras;
                JOptionPane.showMessageDialog(null, valor + " pesos mexicanos");

                break;
            case 8:
                //YEN-MXN
                valor = cantidad / yen;
                JOptionPane.showMessageDialog(null, valor + " pesos mexicanos");

                break;
            case 9:
                //Won sul-coreano-MXN
                valor = cantidad / won;
                JOptionPane.showMessageDialog(null, valor + " pesos mexicanos");

                break;
        }
    }
}
