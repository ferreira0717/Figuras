package taller_viernes;

/**
 *
 * @author JFerreira
 */
public class Circulo extends Figura {

    @Override
    public double getDiametro() {
        diametro = 2 *radio;
        return diametro;
    }

    @Override
    public double getCircunferencia() {
        circunferencia = diametro * 3.1416;
        return circunferencia;
    }

    @Override
    public double getpollos() {
        return super.getpollos(); //To change body of generated methods, choose Tools | Templates.
    }

     
}
