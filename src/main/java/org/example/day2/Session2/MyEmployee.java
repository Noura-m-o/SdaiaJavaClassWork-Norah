package org.example.day2.Session2;

public class MyEmployee {

    String name;
    double salary;
    int hireYear;


    public MyEmployee(String n, double s, int h){

        name= n;
        salary= s;
        hireYear =h;
    }

    public double calcS(){

        return salary*12;
    }
    public int calcY(){
        return (2024-hireYear);
    }


}
