package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Используя этот онлайн калькулятор для решения квадратных уравнений, вы сможете очень просто и быстро найти корни квадратного уравнения.");
        System.out.println("ax\u00b2+bx+c=0");
        //UserNumber userNumber = new UserNumber(); //можно без инициализации объекта?
        double a = UserNumber.inputNumber("a");

        if (a != 0) { //проверка на первый коэффициент

            double b = UserNumber.inputNumber("b");
            double c = UserNumber.inputNumber("c");


            //приятный вывод уравнения для пользователя
            if (b != 0 && c != 0){ 
                System.out.println(a + "x\u00b2" + b + "x" + c + "=0");
            }
            else if (b == 0){
                System.out.println(a + "x\u00b2" + c + "=0");
            }
            else if (c == 0) {
                System.out.println(a + "x\u00b2" + b + "x" + "=0");
            }
            else if (b == 0 && c == 0){
                System.out.println(a + "x\u00b2" + "=0");
            }

            double discr = b * b - 4 * a * c; //определение дискриминанта

            System.out.println("Вычисление дискриминанта по формуле: D=" + b + "\u00b2+4*" + a + "*" + c);
            
            //вычисление корней
            if (discr > 0) {
                double x1 = (-b + Math.sqrt(discr)) / (2 * a);
                double x2 = (-b - Math.sqrt(discr)) / (2 * a);
                System.out.println("D=" + discr);
                System.out.println("Так как дискриминант положительный, то уравнение имеет два вещественных корня");
                System.out.println("x\u2081=" + x1);
                System.out.println("x\u2082=" + x2);
            } else if (discr == 0) {
                double x = (-b + Math.sqrt(discr)) / (2 * a);
                System.out.println("D=" + discr);
                System.out.println("Так как дискриминант равен 0, то уравнение имеет один вещественный корень");
                System.out.println("x=" + x);
            } else {
                System.out.println("D=" + discr);
                System.out.println("Так как дискриминант меньше 0, то уравнение не имеет вещественных корней");
            }
        }
        else {
            System.out.println("Первый коэфициент не может быть равен нулю, проверьте данные");
        }
    }
}
