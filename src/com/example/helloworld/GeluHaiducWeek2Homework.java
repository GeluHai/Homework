package com.example.helloworld;

import java.util.Arrays;
import java.util.*;

//4
class Contacts {
    String name,email;
    public Contacts(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

    public class GeluHaiducWeek2Homework {

        static void getHmPunct1(String nume, String prenume){
            if(nume.compareTo(prenume)==0){
                System.out.println(nume+" este egal cu "+prenume);
            }
            else System.out.println(nume+" NU este egal cu "+prenume);

            String concatenare=nume+prenume;
            System.out.println(concatenare);

            String fullName = prenume.concat(nume);
            System.out.println(fullName);

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
        static void getHmPunct2(String str1){
            String[] words=str1.split("");
            String[] wordsrev= new String[words.length];

            System.out.println();
            System.out.println();

            int i=0;
            for(int j=words.length-1;j>=0;j--){
                wordsrev[i++]=words[j];
            }

            String single_word = Arrays.toString(words);
            String single_wordrev = Arrays.toString(wordsrev);

            System.out.println(single_word);
            System.out.println(single_wordrev);

            if(single_word.compareTo(single_wordrev)==0) System.out.println(single_word+" is a palandrome");
            else System.out.println(single_word+" is NOT a palandrome");

            System.out.println();
            System.out.println();
            System.out.println();
        }
        static void getHmPunct3(){
            String str2;
            String[] arr1= new String[10];
            List<String> str3=new ArrayList<String>();
            str3.add("anamaria");
            str3.add("Bob");
            str3.add("xaer");
            str3.add("oMaria");
            str3.add("ocal");
            str3.add("vaSile");
            str3.add("XBsa");

            for(String s:str3){
                System.out.println(s);
            }

            System.out.println();

            ListIterator<String> itr=str3.listIterator();

            while(itr.hasNext()){
                int index = itr.nextIndex();
                String val= itr.next();
                String[] sep=val.split("");

                if(sep.length<=3) {
                    System.out.println("Skipped");
                    continue;
                }

                for (int z=0;z<sep.length;z++){
                    if (sep[z].contains("X")){
                        System.out.println("Skipped");
                        continue;
                    }
                    else if (sep[z].contains("x")){
                        System.out.println("Skipped");
                        continue;
                    }
                }

                if (sep[0].compareTo("a")==0||sep[0].compareTo("e")==0||sep[0].compareTo("i")==0||sep[0].compareTo("o")==0||sep[0].compareTo("u")==0){
                    str2=String.join("-",val.toUpperCase());
                    System.out.println(str2);
                }
                else {
                    arr1[index]=val.toLowerCase();
                }

            }
            System.out.println();
            for(String s:arr1){
                if (s==null) continue;
                else System.out.println(s);
            }

            System.out.println();
            System.out.println();
            System.out.println();
        }
        static void getHmPunct4(){
            List<Contacts> list=new ArrayList<Contacts>();

            //a
            Contacts c1=new Contacts("Vasile","vasile@vasile.ro");
            Contacts c2=new Contacts("Ion","ion@ion.ro");
            Contacts c3=new Contacts("Pop","pop@pop.ro");
            Contacts c4=new Contacts("Papp","papp@pop.ro");

            list.add(c1);
            list.add(c2);
            list.add(c3);
            list.add(c4);

            //b
            System.out.println("Lista este asa  "+list.size()+"  de mare");
            System.out.println();

            for(Contacts c:list){
                System.out.println(c.name+" - "+c.email);
            }

            //c
            System.out.println("\n"+list.contains("Pop"));

            //d
            for(Contacts c:list){
                //System.out.println(c.name+" - "+c.email);
                if (c.name=="Pop") System.out.println("\n"+c.name+" - "+c.email+"\n");
                else continue;
            }

            //e
            list.remove(2);
            System.out.println("\nNew list");
            for(Contacts c:list){
                System.out.println(c.name+" - "+c.email);
            }
        }


    public static void main(String[] args) {

        //1
        getHmPunct1("Haiduc", "Gelu");

        //2
        getHmPunct2("borrob");

        //3
        getHmPunct3();

        //4
        getHmPunct4();
    }
}