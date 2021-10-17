package pfrClasss1;

import java.util.ArrayList;

public class Person {
    String strNom;
    int intEdad;

    public Person(String strNom, int intEdad) {
        this.strNom = strNom;
        this.intEdad = intEdad;

        toString();
    }

    public String getStrNom() {
        return strNom;
    }

    public void setStrNom(String strNom) {
        this.strNom = strNom;
    }

    public int getIntEdad() {
        return intEdad;
    }

    public void setIntEdad(int intEdad) {
        this.intEdad = intEdad;
    }

    @Override
    public String toString() {
        return "Person{" +
                "strNom='" + strNom + '\'' +
                ", intEdad=" + intEdad +

                '}';
    }

    public void proList(int[] lista) {
        int suma = 0;
        for (int i = 0; i < lista.length; i++) {

            suma = suma + lista[i];
        }

        int promedio = (suma / lista.length);
        System.out.println("La suma " + suma + " y promedio" + promedio);
    }

    public void proArrayList(ArrayList<Integer> arrayList) {
        int suma = 0;

        for (int i = 0; i < arrayList.size(); i++) {

            suma = suma + arrayList.get(i);
        }

        int promedio = (suma / arrayList.size());

        System.out.println("La suma del arraylista" + suma + " y promedio" + promedio);

    }
    // fobonaci
    public void factorialCal(int n) {

        long sol;
        int i;
        for (i = 2, sol = 1; i <= n; i++) {
            sol *= i;
            //System.out.print(sol);

        }
        System.out.print(sol);

    }

    //fobinaci

    public void fibonacci(int n)
    {
        if (n <= 0) {
            System.out.printf("Debe ingresar un número mayor que cero");
        } else {
            if (n >= 1) {
                System.out.printf("0 ");
            }
            if (n >= 2) {
                System.out.printf("1 ");
            }
            int anterior = 0;
            int actual = 1;
            int i;
            for (i = 3; i <= n; i++) {
                int copia_actual = actual;
                actual = actual + anterior;
                anterior = copia_actual;
                System.out.printf("%d ", actual);
            }
         }
    }
}