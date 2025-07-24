
package abarquez;

import java.util.Scanner;

public class Abarquez {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        
        System.out.print("Enter your name:");
        name = sc.nextLine();
        System.out.print("enter your age:");
        age = sc.nextInt();
        
        System.out.println("\nHello "+name+" your age is "+age);
        
        if(age >= 18){
            System.out.println("Pwedie nah");
        }else{
            System.out.println("Minor");

        }
    }
    
}

