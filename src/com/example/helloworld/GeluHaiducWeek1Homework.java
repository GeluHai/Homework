package com.example.helloworld;

public class GeluHaiducWeek1Homework {
    static void getHmPunct4(boolean a, char b, int c, long d, double e, String f, int[] g){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        for(int i=0;i<g.length;i++)
            System.out.print(g[i]+", ");
        System.out.println();
        System.out.println();
    }
    static void getHmPunct5(int x, int y, int z, int w){
        System.out.println("1. "+x++);
        System.out.println("2. "+x);
        System.out.println("3. "+ ++y);
        System.out.println("4. "+z--);
        System.out.println("5. "+z);
        System.out.println("6. "+ --w);

        System.out.println();

        System.out.println("7. "+ x+y);
        System.out.println("8. "+ (w-z));
        System.out.println("9. "+ x*w);
        System.out.println("10. "+ w/y);
        System.out.println("11. "+ z%x);

        int min=(z<w)?z:w;
        System.out.println("12. "+min);

        System.out.println();
        System.out.println();
    }
    static void getHmPunct6(int r, int t){
        if(r>t) System.out.println(r+" is larger then "+t);
        else if (t>r) System.out.println(t+" is larger then "+r);
        else System.out.println(r+" is equal to "+t);

        System.out.println();
        System.out.println();
    }
    static void getHmPunct7(int k[]){
        for(int i=0;i<k.length;i++){
            if(k[i]==15) continue;
            System.out.println(k[i]);
        }
    }


    public static void main(String[] args) {

        //punctul 4
        int g[]={99,89,79,69,59,9};
        getHmPunct4(true, 'b', 100, 987654321L, 125478.369d, "ceva", g);


        //punctul 5
        getHmPunct5(5, 2, 10, 29);


        //punctul 6
        getHmPunct6(75, 47);


        //punctul 7
        int k[]={1,2,3,4,15,6,7,8,9,10};
        getHmPunct7(k);
    }

}
