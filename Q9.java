package Demo.assignment2;

//9.  Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables.
// There are stress and fire tests for each products.

enum fire_resistance
{
    HIGH, MEDIUM, LOW
}

enum stress_resistance
{
    HIGH, MEDIUM, LOW
}


enum furniture_type
{
    metal, wood
}

abstract class Furniture
{
    String color;
    fire_resistance f;
    stress_resistance s;

    abstract String fire_test();
    abstract String stress_test();

}

class Table extends Furniture
{
    String color;
    fire_resistance f;
    stress_resistance s;
    furniture_type type;

    @Override
    String fire_test() {

        if(f == fire_resistance.HIGH)
            return "Very resistive.";
        else if(f == fire_resistance.MEDIUM)
            return "A little ressistive.";
        else
            return "Not at all resistive.";

    }

    @Override
    String stress_test()
    {
        if(s == stress_resistance.HIGH)
            return "Very resistive.";
        else if(s == stress_resistance.MEDIUM)
            return "A little ressistive.";
        else
            return "Not at all resistive.";
    }

    public String typeof()
    {
        return type.toString();
    }
}

class Chair extends Furniture
{
    String color;
    fire_resistance f;
    stress_resistance s;
    furniture_type type;

    @Override
    String fire_test() {
        if(f == fire_resistance.HIGH)
            return "Very resistive.";
        else if(f == fire_resistance.MEDIUM)
            return "A little ressistive.";
        else
            return "Not at all resistive.";

    }

    @Override
    String stress_test() {

        if(s == stress_resistance.HIGH)
            return "Very resistive.";
        else if(s == stress_resistance.MEDIUM)
            return "A little ressistive.";
        else
            return "Not at all resistive.";
    }

    public String typeof()
    {
        return type.toString();
    }
}


public class Q9
{
    //driver code.
    public static void main(String[] args)
    {

    }
}
