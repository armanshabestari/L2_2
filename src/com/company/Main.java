package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n#Select your Lesson and write below#");
        System.out.println("\n1) Barname Nevisi Pishrafte (write BNP)\n2) Riazi2\n3) Fizik2\n4) Moadelat");
        Scanner input=new Scanner(System.in);
        String str;
        str=input.next();
        System.out.println("==============");
        if (str.equals("BNF")){
            BNP bnf=new BNP();
            System.out.println("Barname Nevisi Pishrafte");
            bnf.pish_niyaz();
            bnf.ham_niyaz();
            bnf.vahed();
        }
        else if (str.equals("Riazi2")){
            Riazi_2 riazi2=new Riazi_2();
            System.out.println("Riazi 2");
            riazi2.pish_niyaz();
            riazi2.ham_niyaz();
            riazi2.vahed();
        }
        else if (str.equals("Fizik2")){
            Fizik_2 fizik2=new Fizik_2();
            System.out.println("Fizik 2");
            fizik2.pish_niyaz();
            fizik2.ham_niyaz();
            fizik2.vahed();
        }
        else if (str.equals("Moadelat")){
            Moadelat moadelat=new Moadelat();
            System.out.println("Moadelat");
            moadelat.pish_niyaz();
            moadelat.ham_niyaz();
            moadelat.vahed();
        }
        else{
            System.out.println("NOT CORRECT!");
        }
    }
}
