package task;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        double a;
        double b;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите а = ");
        a = in.nextDouble();
        System.out.print("Введите b = ");
        b = in.nextDouble();

        //Выполним сложение двух чисел
        System.out.println("Выполним сложение двух чисел: " + (a + b));
        //Вычитание b из а        
        System.out.println("Вычитание b из а: " + (a - b));
        //Произведение чисел
        System.out.println("Произведение чисел: " + (a * b));
        //Деление 
        if (b != 0) {
            System.out.println("Деление: " + (a / b));
        } else {
            System.out.println("Деление на ноль запрещено законом!");
        }
        //Квадрат
        System.out.println("Квадрат a: " + (a * a));
        System.out.println("Квадрат b: " + (b * b));

        //Выведем корни квадратные 
        if (a < 0 || b < 0) {
            System.out.println("Корень из отрицательного не считает!");
        } else {
            System.out.println("Корень из сложения двух чисел: " + Math.sqrt(a + b));

            System.out.println("Корень из вычитания b из а: " + Math.sqrt(a - b));

            System.out.println("Корень из произведения чисел: " + Math.sqrt(a * b));

            if (b != 0) {
                System.out.println("Корень из деления: " + Math.sqrt(a / b));
            } else {
                System.out.println("Деление на ноль запрещено законом!");
            }

            System.out.println("Корень из квадрата a: " + Math.sqrt(a * a));
            System.out.println("Корень из квадрата b: " + Math.sqrt(b * b));
        }

        System.out.println("Запись результатов в два массива");
        double r11 = a + b;
        double r12 = a - b;
        double r13 = a * b;
        double r14 = a / b;
        double r15 = a * a;
        double r16 = b * b;

       /* double[] mas1 = {r11, r12, r13, r14, r15, r16};
        System.out.println("1-й массив");
        for (int i=0;i<mas1.length;i++){
        System.out.println("   "+mas1[i]);
        } */
        double r21 = Math.sqrt(a + b);
        double r22 = Math.sqrt(a - b);
        double r23 = Math.sqrt(a * b);
        double r24 = Math.sqrt(a / b);
        double r25 = Math.sqrt(a * a);
        double r26 = Math.sqrt(b * b);

      /*  double[] mas2 = {r21, r22, r23, r24, r25, r26};
        System.out.println("2-й массив");
        for (int j=0;j<mas2.length;j++){
        System.out.println("   "+mas2[j]);
        
        }*/
        
        System.out.println("3 - й массив");
         double[][] mas3 = {{r11, r12, r13, r14, r15, r16},
                           {r21, r22, r23, r24, r25, r26}};
         for (int i = 0;i<mas3.length;i++) {
         for (int j = 0;j<mas3[i].length;j++) {
             System.out.print(mas3[i][j]+"\t");
         } 
           System.out.println();
         }
         System.out.print("Вывести элемент = ");
         int q;
         Scanner SS = new Scanner(System.in);
         q = SS.nextInt();
         System.out.println(mas3[0][q-1]);
         System.out.println(mas3[1][q-1]);
    }

    }
