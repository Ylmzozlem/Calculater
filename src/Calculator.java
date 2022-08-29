import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("What action do you want to do? :\n" + "1) Additio \n" + "2) Subtraction\n"+"3) Multiplication\n"+"4) Division\n"+"5) Exponentiation\n"+"6) Square Root\n"+"7) Differentiation\n"+"8) Integral Calculation\n"+"9) Factorial Calculation\n"+"10) Mode Calculation\n"+"11) Absolute Value Calculation\n");
        int i=0;
       while(i>=0) {
           System.out.print("Action is : ");
           int select = scn.nextInt();

           if (select == 1) {
               System.out.println("Enter Your Datas:");
               System.out.print("Data1: ");
               int a = scn.nextInt();
               System.out.print("Data2: ");
               int b = scn.nextInt();
               System.out.println("Result is : " + Utility.add(a, b));
               System.out.println();

           } else if (select == 2) {
               System.out.println("Enter Your Datas:");
               System.out.print("Data1: ");
               int a = scn.nextInt();
               System.out.print("Data2: ");
               int b = scn.nextInt();
               System.out.println("Result is : " + Utility.sub(a, b));
               System.out.println();

           }
           else if(select==3){
               System.out.println("Enter Your Datas:");
               System.out.print("Data1: ");
               int a = scn.nextInt();
               System.out.print("Data2: ");
               int b = scn.nextInt();
               System.out.println("Result is : " + Utility.multi(a, b));
               System.out.println();

           }else if(select==4){
               System.out.println("Enter Your Datas:");
               System.out.print("Data1: ");
               int a = scn.nextInt();
               System.out.print("Data2: ");
               int b = scn.nextInt();
                Utility.div(a, b);
               System.out.println();

           }else if(select==5){

               System.out.print("Enter your sub number: ");
               double a = scn.nextDouble();
               System.out.print("Enter your power: ");
               double b = scn.nextDouble();
               Utility.exp(a, b);
               System.out.println();


           }else if(select==6){

               System.out.print("Enter your number: ");
              double a = scn.nextDouble();

               Utility.sqrt(a);
               System.out.println();
               System.out.println(Math.sqrt(a));

           } else if(select==7){

               System.out.print("Enter your factor number: ");
               int a = scn.nextInt();
               System.out.print("Enter your power:");
               int b = scn.nextInt();

               Utility.diff(a,b);
               System.out.println();

           }else if(select==8) {

               System.out.print("Enter your coefficient: ");
               int a = scn.nextInt();
               System.out.print("Enter your exponent:");
               int b = scn.nextInt();

               Utility.integral(a, b);
               System.out.println();
           }else if(select==9) {

               System.out.print("Enter your number: ");
               int a = scn.nextInt();

               Utility.factorial(a);
               System.out.println();


           }else if(select==10) {

               System.out.print("Enter your number: ");
               int a = scn.nextInt();
               System.out.print("Enter your division: ");
               int b = scn.nextInt();

               Utility.mod(a,b);
               System.out.println();

           }else if(select==11) {

               System.out.print("Enter your number: ");
               int a = scn.nextInt();

               Utility.absolute(a);
               System.out.println();

           }
           i++;
       }
    }
}
