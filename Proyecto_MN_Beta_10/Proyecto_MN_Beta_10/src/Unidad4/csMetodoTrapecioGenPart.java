package Unidad4;

import java.util.ArrayList;

public class csMetodoTrapecioGenPart {

    double Aprox;
    boolean v;

    public ArrayList<csFilaTrapecio> Trapecio(double a, double b, int N) {
        //Calcular h
        double xa = a;
        double xb = b;
        double h = (xb - xa) / N;
        //Generar tabla
        ArrayList<csFilaTrapecio> lista;

        //Contador i++
        int i = 0;
        lista = new ArrayList<csFilaTrapecio>();
        double suma = 0;

        if (b > a || a > b) {
            //Si es b > a la integral se realiza con normalidad en cambia de ser FALSE se agrega el signo negativo
            v = b > a;

            //Ciclo
            for (int j = 0; j < (N + 1); j++) {
                csFilaTrapecio fila = new csFilaTrapecio();
                fila.setI(i++);
                fila.setH(h);
                fila.setX(xa + fila.getI() * fila.getH());
                fila.setFx(this.integral(fila.getX()));
                if (i < (N + 1)) {
                    //double copyFx = fila.getFx();
                    suma = suma + fila.getFx();
                }
                lista.add(fila);
            }
            //System.out.println("Suma: " + (suma - a));
            if (N < 3) {
                Aprox = (b - a) / 2 * (this.integral(a) + this.integral(b)); //Simple 
            } else if (N >= 3) {
                Aprox = h / 2 * (this.integral(a) + 2 * (suma - a) + this.integral(b)); //Compuesto
            }
            return lista;
        }
        return lista;
    }

    //Integral
    public double integral(double x) {
        if (v == true) { // A < B ---> 1 < 2 true
            return Math.pow(x, 2);
        } else { // A > B ---> 1 > -2
            return Math.pow(-x, 2);
        }
    }
    csFilaTrapecio a = new csFilaTrapecio();

    public String e() {
        return String.valueOf(Aprox);
    }
}
