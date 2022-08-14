package main;

import java.util.Scanner;

public class main {

  public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

    //калькулятор
    System.out.print("1 number");
    float num1 = scan.nextFloat();
    System.out.print("2 number");
    float num2 = scan.nextFloat();

   float res;

    System.out.print("symbol:");
    String action = scan.nextLine();
    action = scan.nextLine();

    switch (action){
      case "+":
        res = num1 + num2;
        System.out.println("result: " + res);
        break;
      case "-":
        res = num1 - num2;
        System.out.println("result: " + res);
        break;
      case "*":
        res = num1 * num2;
        System.out.println("result: " + res);
        break;
      case "/":
          if (num2 == 0)
            System.out.println("Error");
          else {
        res = num1 / num2;
        System.out.println("result: " + res);}
        break;
      default:
        System.out.println("error");
    }


  }
}