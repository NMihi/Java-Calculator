

package test.cal;

import java.util.Scanner;
public class TestCal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
            int a,b,c,selection;
            System.out.println("please enter any 2 didgits:");
            a= scan.nextInt();
            b= scan.nextInt();

            System.out.println("make your selection");
            System.out.println("1.addition");
            System.out.println("2.substraction");
            System.out.println("3.division");
            System.out.println("4.multiplicaton");
           
         //select user selection    
            selection=scan.nextInt();
            while(selection>4){
                System.out.println("please enter the correct selection");
            selection=scan.nextInt();
            }
            cal2 mani = new cal2();
            if(selection==1){
                c=mani.add(a,b);
                System.out.println("your answer is"+c);
            }else if(selection==2){
                c=mani.susbtract(a,b);
                System.out.println("your answer is"+c);
            }else if (selection==3){
                c=mani.divide(a,b);
                System.out.println("your answer is"+c);
            }else if(selection==4){
                c=mani.muliply(a,b);
                System.out.println("your answer is"+c);
    }
    }
    }

 
