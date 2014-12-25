package ua.test.mentoring.homework;

import java.util.Scanner;
import java.lang.Math;

/**
 * Created by Iurii_Galias on 12/24/14.
 */
public class Calculate { // класс вычислений
    static   Scanner s = new Scanner(System.in);
    public void valid(){
        while (!s.hasNextDouble()){ //проверяем, действительно ли введенные числа типа инт или дабл
            System.out.println("This is not a number,(please enter number in format 5 or 5.5) ");
            s.next();
        }
    }
    public void getresult(){// этот метод считывает вводимые данные , запоминает их и выбирает
        Double first, second, result;
        char op;
        {
            {
                System.out.println("Please, enter first number");
                valid();
                first =  s.nextDouble();
                System.out.println("Please, enter second number");
                valid();
                second = s.nextDouble();
            }
        }
        System.out.println("Please, enter operation (Available operations +,-,*,/)");
        op = s.next().charAt(0);
        switch (op){
            case '+':
                result = first + second;
                System.out.println("The result of summ = " + result);
                break;
            case '-':
                result = first - second;
                System.out.println("The result of subtraction = " + result);
                break;
            case '*':
                result = first * second;
                System.out.println("The result of multiplication = " + result);
                break;
            case '/':
                if (first == 0 ||(second == 0)){
                    System.out.println("Devision by zero");
                    break;
                }else {
                    result = first / second;
                    System.out.println("The result of division = " + result + " round to " + Math.round(result));
                    break;
                }
            default:
                System.out.println("Illegal character !!!");
        }
    }
}
