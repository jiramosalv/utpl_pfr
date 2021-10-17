package pfrClasss1;


import java.util.ArrayList;

public class clase1Java {

    public static void main(String[] args) {
        System.out.println("Hola MUndo desde Java");
        System.out.println(1 + 2);

        //inmutabel vs mutable

        //val mutable= 1;
        //var mutale2= 4.0;

        //System.out.println(mutable2);


        //Persona 1

        Person p1 = new Person("Sebastian", 1);
        System.out.println(p1);

        int[] lista = {20, 20, 60, 80};
        p1.proList(lista);

        ArrayList<Integer> arrayLis = new ArrayList<>();
        arrayLis.add(20);
        arrayLis.add(40);
        arrayLis.add(60);
        arrayLis.add(80);

        p1.proArrayList(arrayLis);


        p1.factorialCal(5);
        p1.fibonacci(5);
    }


}
