public class Utility {
    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){

        return a-b;
    }

    public static int multi(int a, int b){
        return a*b;
    }

    public static void div(int a, int b){

            double x=a;
            double y=b;
       if(b!=0) {
    System.out.println("Result is : " + x / y);
        }else{
           System.err.println("You can not divide any number by 0!");

        }

    }
    public static void exp(double a, double b){
        if(a==0){
            System.out.println("Result is : "+1);

        }else if(b<0) {
            double x = 1;
            for (int i = 0; i < -1*b; i++) {
                x *= a;

            }
            double y=x;
            System.out.println("Result is : "+"1/"+x+" = "+1.0/y);

        }else if(b==0) {
                System.out.println("Result is : " + 1);
        }else{

            double x = 1;
            for (int i = 0; i < b; i++) {
                x *=a;
            }
            System.out.println("Result is : "+x);
        }
    }

    public static void sqrt(double a){
        if(a<=0){
            System.err.println("Your number don't be equal zero or less then zero!");
        }
        for(double i=1.0; i<=a;i++){
            if(i*i==a){
                System.out.println("Result is : "+ i);
            }
        }

    }

    public static void diff(double a, double b) {
        if (a == 0 && b == 0) {
            System.out.println("Your function is : " + "f(x) = 0");
            System.out.println("Your result is: " + "f'(x)= 0");

        } else if (a == 0) {
            System.out.println("Your function is : " + "f(x)= 0");
            System.out.println("Your result is: " + "f'(x)= 0 ");

        } else if (b == 0) {
            System.out.println("Your function is : " + "f(x)= " + a);
            System.out.println("Your result is: " + "f'(x)= 0");
        } else {
            System.out.println("Your function is : " + "f(x)= " + a + "*x^" + b);
            System.out.println("Your result is: " + "f'(x)= " + a * (b ) + "*x^" + (b - 1));
        }
    }


    public static void integral(double a, double b){
            if (a == 0 && b == 0) {
                System.out.println("Your function is : " + "f'(x) = 0");
                System.out.println("Your result is: " + "f(x)= 0");

            } else if (a == 0) {
                System.out.println("Your function is : " + "f'(x)= 0");
                System.out.println("Your result is: " + "f(x)= 0 ");

            } else if (b == 0) {
                System.out.println("Your function is : " + "f'(x)= " + a);
                System.out.println("Your result is: " + "f(x)= " + a / (b + 1) + "*x^" + (b + 1));
            } else {
                System.out.println("Your function is : " + "f'(x)= " + a + "*x^" + b);
                System.out.println("Your result is: " + "f(x)= " + a / (b + 1) + "*x^" + (b + 1));
            }
        }


            public static void factorial ( int a){
                if (a <= 0) {
                    System.err.println("Number must be higher then 0!");
                } else {
                    int x = 1;
                    for (int i = 1; i < a + 1; i++) {
                        x = x * i;
                    }
                    System.out.println("Result is: " + x);
                }
            }

            public static void mod ( int a, int b){
                if (b < 1) {
                    System.err.print("Division must higher then 1!");
                } else {
                    System.out.println("Result is: " + a % b);
                }

            }

            public static void absolute ( double a){
                if (a <= 0) {
                    System.out.println("Result is : " + (-1) * a);
                } else {
                    System.out.println("Result is : " + a);
                }
            }

        }


