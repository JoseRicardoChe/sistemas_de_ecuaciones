package Unidad4;

import java.util.ArrayList;

public class csMetodoTercioGenPart {

    double Aprox;
    boolean v;

    public ArrayList<csFilaTercio> Trapecio(double a, double b, int N) {
        //Calcular h
        double xa = a;
        double xb = b;
        double h = (xb - xa) / N;

        //Generar tabla
        ArrayList<csFilaTercio> lista;
        //Contador i++
        int i = 0;
        lista = new ArrayList<csFilaTercio>();
        double sumaX = 0;
        double sumaY = 0;

        if (b > a || a > b) {
            //Si es b > a la integral se realiza con normalidad en cambia de ser FALSE se agrega el signo negativo
            v = b > a;

            //Ciclo
            /*if (N < 3) { //Caso particular
                Aprox = h / 3 * (this.integral(a) + 4 * this.integral((a + b) / 2) + this.integral(b));
            } else if (N >= 3) { // //Caso general  */
            for (int j = 0; j < (N + 1); j++) {
                csFilaTercio fila = new csFilaTercio();
                fila.setI(i++);
                fila.setH(h);
                fila.setX(xa + fila.getI() * fila.getH());
                fila.setFx(this.integral(fila.getX()));
                if (i < (N + 1)) {
                    //double copyFx = fila.getFx();
                    if (i % 2 == 0) {
                        sumaX = sumaX + fila.getFx();
                    } else {
                        sumaY = sumaY + fila.getFx();
                    }
                }
                lista.add(fila);
                //}

            }
            //System.out.println("Par: " + 2 * (sumaY - a));
            //System.out.println("Impar: " + 4 * (sumaX));
            if (N < 3) {
                Aprox = h / 3 * (this.integral(a) + 4 * this.integral((a + b) / 2) + this.integral(b));
            } else if (N >= 3) {
                Aprox = h / 3 * (this.integral(a) + 2 * (sumaY - a) + 4 * sumaX + this.integral(b));
            }
            //System.out.println("Suma: " + (suma - a));
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

    csFilaTercio a = new csFilaTercio();

    public String e() {
        return String.valueOf(Aprox);
    }
}
