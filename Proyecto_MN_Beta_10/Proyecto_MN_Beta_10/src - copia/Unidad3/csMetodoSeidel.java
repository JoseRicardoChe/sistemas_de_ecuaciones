package Unidad3;

import java.util.ArrayList;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;

public class csMetodoSeidel {

    public ArrayList<csFilaSeidel> Seidel(double x1, double x2, double x3, double x4, double errorDeseado) {

        double Error;
        double AnteriorX1 = x1;
        double AnteriorX2 = x2;
        double AnteriorX3 = x3;
        double AnteriorX4 = x4;

        ArrayList<csFilaSeidel> lista;
        int i = 1;
        lista = new ArrayList<csFilaSeidel>();
        do {
            csFilaSeidel fila = new csFilaSeidel();
            //Calculo de la primera iteración
            fila.setX1(this.forx1(AnteriorX2, AnteriorX3));
           
            fila.setX2(this.forx2(fila.getX1(), AnteriorX3, AnteriorX4));
            System.out.println("gerX2"+fila.getX2() );
            fila.setX3(this.forx3(fila.getX1(), fila.getX2(), AnteriorX4));
            fila.setX4(this.forx4(fila.getX2(), fila.getRestX3()));

            //Resta de Xk - Xk-1 osea la ultima menos la antepenultima            
            double RestX1, RestX2, RestX3, RestX4;
            RestX1 = Math.abs(fila.getX1() - AnteriorX1);
            fila.setRestX1(RestX1);
            System.out.println("restX1 " + fila.getRestX1());
            RestX2 = Math.abs(fila.getX2() - AnteriorX2);
            fila.setRestX2(RestX2);
            System.out.println("restX2 " + RestX2);
            RestX3 = Math.abs(fila.getX3() - AnteriorX3);
            fila.setRestX3(RestX3);
            System.out.println("restX3 " + RestX3);
            RestX4 = Math.abs(fila.getX4() - AnteriorX4);
            fila.setRestX4(RestX4);
            System.out.println("restX4 " + RestX4);

            System.out.println();
            //double maxRest = Math.max(RestX1, Math.max(RestX2, Math.max(RestX3, RestX4)));

            AnteriorX1 = fila.getX1();
            System.out.println("fila anteriorX1 " + fila.getX1());
            AnteriorX2 = fila.getX2();
            System.out.println("fila anteriorX2 " + fila.getX2());
            AnteriorX3 = fila.getX3();
            System.out.println("fila anteriorX3 " + fila.getX3());
            AnteriorX4 = fila.getX4();
            System.out.println("fila anteriorX4 " + fila.getX4());
            //double maxRest = Math.max(RestX1,(RestX2));
            //System.out.println("maxRest1 "+maxRest);
            //double macRest2= Math.max(RestX3, RestX4);
            //System.out.println("maxRest2 "+macRest2);

            //ouble maxinres=Math.max(maxRest, macRest2);
            double maxRest = Math.max(RestX1, Math.max(RestX2, Math.max(RestX3, RestX4)));

            System.out.println("max rest total " + maxRest);

            double maxXk = Math.max(Math.abs(fila.getX1()), Math.max(Math.abs(fila.getX2()), Math.max(Math.abs(fila.getX3()), Math.abs(fila.getX4()))));
            System.out.println("max de la ultima " + maxXk);

            Error = maxRest / maxXk;
            System.out.println("error final " + Error);
            System.out.println();
            // fila.setRestAbs(Error);
            lista.add(fila);
            fila.setK(i++);
            a.setError(Error);

            System.out.println("****fin iteración***** ");
        } while (errorDeseado <= Error);
        
        /*if (errorDeseado >= Error) {
            JOptionPane.showMessageDialog(null, "Se ha encontrado el error " + errorDeseado);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el error " + errorDeseado);
        }*/
        //JOptionPane.showMessageDialog(null, Error);
        return lista;
    }
    csFilaSeidel a = new csFilaSeidel();
    public String e (){
        return String.valueOf(a.getError());
    }
    public double forx1(double X2, double X3) {
        //Primera formula
        return (6 + X2 - 2 * X3) / 10;
    }

    public double forx2(double X1, double X3, double X4) {
        //Primera formula
        return (25 + X1 + X3 - 3 * X4) / 11;
    }

    public double forx3(double X1, double X2, double X4) {
        //Primera formula
        return (-11 - 2 * X1 + X2 + X4) / 10;
    }

    public double forx4(double X2, double X3) {
        //Primera formula
        return (15 - 3 * X2 +  X3) / 8;
    }

}
