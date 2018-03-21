package Unidad1;

import java.math.RoundingMode;
import java.text.NumberFormat;

public class Calculos {

    //Atributos
    private double Pr;
    private double Pa;
    private int Dig;

    //Se manda los valores desde la clase Interfaz
    public void setPr(double Pr) {
        this.Pr = Pr;
    }

    public void setPa(double Pa) {
        this.Pa = Pa;
    }

    public void setDig(int Dig) {
        this.Dig = Dig;
    }

    public double getPr() {
        return Pr;
    }

    public double getPa() {
        return Pa;
    }

    public int getDig() {
        return Dig;
    }

    //Métodos TRUNCAR & REDONDEAR
    public double Redondear(double Aprox, int Decimales) {
        /*Aprox = Aprox * Math.pow(10, Decimales);
        Aprox = Math.round(Aprox);
        Aprox = Aprox / Math.pow(10, Decimales);
        return Aprox;*/
 /*BigDecimal bd = new BigDecimal(Aprox);
        bd = bd.setScale(Decimales, RoundingMode.HALF_UP);
        return bd.doubleValue();*/
 /*Aprox = Aprox * (java.lang.Math.pow(10, Decimales));
        Aprox = java.lang.Math.round(Aprox);
        Aprox = Aprox / java.lang.Math.pow(10, Decimales);
        return Aprox;*/
        int Cifras = (int) Math.pow(10, Decimales);
        return Math.rint(Aprox * Cifras) / Cifras;
    }

    public double Truncar(double Aprox, int Decimales) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(Decimales);
        numberFormat.setRoundingMode(RoundingMode.DOWN);
        return Double.parseDouble(numberFormat.format(Aprox));
    }

    //Metodos  Error Absoluto, Error Relativo y Error Porcentual
    public double ErrorAbs(double AproxTrunRedo) {
        return Math.abs(this.Pr - AproxTrunRedo);
    }

    public double ErrorRela(double AproxTrunRedo) {
        return this.ErrorAbs(AproxTrunRedo) / this.Pr;
    }

    public double ErrorPorc(double AproxTrunRedo) {
        return this.ErrorRela(AproxTrunRedo) * 100;
    }
}
