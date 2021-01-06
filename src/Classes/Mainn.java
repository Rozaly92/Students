package Classes;

import java.util.BitSet;
import java.util.Optional;
import java.util.Random;
import java.util.StringTokenizer;

public class Mainn {
    public static void main(String[] args) {
        //Class StringTokenizer
      /*  System.out.println("Class StringTokenizer ");
        String str = "Quadratic equations, scatter plots= exponents," +
                " parallel language, figures of speech; semicolons, and more.";
        StringTokenizer st= new StringTokenizer(str);
        StringTokenizer st2 =new StringTokenizer(str,", ! = :");
        String delim = ", ! = :";
        StringTokenizer st3 = new StringTokenizer(str,delim);
        while(st.hasMoreElements())
        {
            System.out.println(st.nextElement());
        }
        System.out.println("-----------------------------------------------");
        while(st2.hasMoreTokens())
        {
            System.out.println(st2.nextToken());
        }
        System.out.println("-----------------------------------------------");
        while(st3.hasMoreTokens())
        {
            System.out.println(st3.nextToken());
        }*/



        //Class BitSet
       /* System.out.println("Class BitSet");
        BitSet bits1= new BitSet(16);
        BitSet bits2= new BitSet(16);

        for(int i=0; i<16; i++) {
            if (i % 2 == 0) bits1.set(i);
            if (i % 5 == 0) bits2.set(i);
        }
        System.out.println("Начальная комбинация битов в объекте bitsl: ");
        System.out.println(bits1);
        System.out.println("Начальная комбинация битов в объекте bits2: ");
        System.out.println(bits2);

        //выполнить логическую операцию И над битами
        bits2.and(bits1);
        System.out.println("\n bits2 AND bits1: "+ bits2);

        //выполнить логическую операцию ИЛИ над битами
        bits2.or(bits1);
        System.out.println("\n bits2 Or bits1: "+ bits2);

        //выполнить логическую операцию ИСКЛЮЧАЮЩЮЮ ИЛИ над битами
        bits2.xor(bits1);
        System.out.println("\n bits2 XOR bits1: "+ bits2);*/



        //Class Optional
      /*  System.out.println("Class Optional");
        Optional<String> noval = Optional.empty();
        Optional<String> noval2 =Optional.of("ABCDEFG");
        if(noval.isPresent())
        {
            System.out.println("This element is present"+ noval.get());
        }
        else System.out.println("This element is null");

        if(noval2.isPresent())
        {
            System.out.println("This element is present: "+ noval2.get());
        }
        else System.out.println("This element is null");
        System.out.println(noval.orElse("It is a null string"));*/



        //Class Random
        Random r= new Random();
        int a = r.nextInt(100);
        System.out.println(a);
        double b = r.nextDouble();
        System.out.println(b);
        int c= r.nextInt(10);
        System.out.println(c);



        //Class
        //System.out.println("###########################################################################");


        //Class
        //System.out.println("###########################################################################");











    }
}
