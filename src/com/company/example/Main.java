package com.company.example;

public class Main {

    public static void main(String[] args) {
    /*
      Relational Operators
      <  - less than
      <= - Less than Or equal to
      >  - greater than
      >= - greater than Or equal to
      == - equals
      != - not equal to

      Logical Operators
      && - AND
      || - OR
      !  - NOT

    */

        int a = 2;
        int b = 4;
        int x = 6;
        int y = 1;

        System.out.println("a = 2");
        System.out.println("b = 4");
        System.out.println("x = 6");
        System.out.println("y = 1");
        
        //AND Operator
        if (a == x || y + y == a) {
            //will this method run?
            System.out.println("a == x || y + y == a");
            //Yes, This will run because one of our conditions is true. All you need is a single true condition for an OR operator to be true.

        } //NOT Operator
        if (a != x && y + y == a) {
            //will this method run?
            System.out.println("a != x && y + y == a");}
            // Yes, this will run by using the ! operator this AND will evaluate as true OR both sides
    }}

