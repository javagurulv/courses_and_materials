package student_edgars_lukjanskis.lession_4.homeworks.day_2;

import java.util.Scanner;

class Task_7 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Scanner number1 =new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = number1.nextInt();

        Scanner number2 = new Scanner(System.in);
        System.out.println("Enter second number: ");
        int secondNumber = number2.nextInt();

        if ((firstNumber == secondNumber)){
            System.out.println("Numbers are equals!");

        }else{System.out.println("Numbers are diferent!");}


    }



}
