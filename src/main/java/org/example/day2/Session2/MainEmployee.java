package Session2;

import org.example.MyMethods;

import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args) {

        MyEmployee m = new  MyEmployee("norah",20000,2020);

        System.out.println(m.name);
        System.out.println(m.calcS());
        System.out.println(m.calcY());

    }
}
