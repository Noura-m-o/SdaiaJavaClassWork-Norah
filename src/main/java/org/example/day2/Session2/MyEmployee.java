package Session2;

import java.util.Date;
import java.util.Locale;

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
