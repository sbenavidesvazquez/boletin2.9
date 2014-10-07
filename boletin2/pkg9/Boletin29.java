//cantidade enteira de diñeiro
package boletin2.pkg9;

import java.util.Scanner;


public class Boletin29 {

    
    public static void main(String[] args) {
    //billetes de 100(b1), billetes de 20(b2), billetes de 5(b5), monedas d 1(m)
    int b1,b2,b5,m;
    
    System.out.print("billetes de 100= ");
    Scanner dato= new Scanner(System.in);
    b1=dato.nextInt();
    
    System.out.print("billetes de 20= ");
    Scanner dato2= new Scanner(System.in);
    b2=dato2.nextInt();
    
    System.out.print("billetes de 5= ");
    Scanner dato3= new Scanner(System.in);
    b5=dato3.nextInt();
    
    System.out.print("monedas de 1= ");
    Scanner dato4= new Scanner(System.in);
    m=dato4.nextInt();
    
    System.out.println("dinero total= 100*"+ b1 +"+ 20*"+ b2 +"+ 5*"+ b5+"+ 1*"+ m +"="+ (100*b1+20*b2+5*b5+1*m));
    
    }
    
}
