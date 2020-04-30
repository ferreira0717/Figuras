package taller_viernes;

import javax.swing.JOptionPane;

/**
 *
 * @author JFerreira
 */
public class Main {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        int i = 1;
        do {
            try {
                double ra = Double.parseDouble(JOptionPane.showInputDialog(null, "Punto: " + (i) + ".\nIngrese el radio de un circulo para hallar:"
                        + " Diametro y Circunferencia. "));
                
                
                circulo.setRadio(ra);
                System.out.println("Punto " + (i) + ".");
                i++;
                System.out.println("Radio ingresado es: " + circulo.getRadio());
                System.out.println("El diametro del circulo es: " + circulo.getDiametro());
                System.out.println("la circunferencia del circulo es: " + circulo.getCircunferencia());
                System.out.println("");

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo acepta caracteres numericos.");

            }

        } while (i <= 5);

    }
}
