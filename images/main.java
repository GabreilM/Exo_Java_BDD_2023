//Carré

package etoiles;

import java.util.Scanner;

public class Boucle {
    public static void main(String[] args){
       try {
         Scanner sc = new Scanner(System.in);
          int x = sc.nextInt();
          System.err.println(x);

          for(int i = 1; i < x; i++){
             for(int j = 1; j < x; j++){
                System.err.print("*");
             }
             System.err.println("*");
          }

          sc.close();

       }
       catch (Exception e) {
          System.err.println(e);
       }
    }
 }

//Triangle RECTANGLE

package etoiles;

import java.util.Scanner;

public class Boucle {
   public static void main(String[] args){
      try {
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         System.err.println(x);

         for(int i = 0; i < x; i++){
            for(int j = 0; j < i; j++){
               System.err.print("*");
            }
            System.err.println("*");
         }

         sc.close();

      }
      catch (Exception e) {
         System.err.println(e);
      }
   }
}

//Triangle rectangle inversé


package etoiles;

import java.util.Scanner;

public class Main {
   public static void main(String[] args){
      try {
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         // System.err.println(x);

         for(int i = x; i > 0; i--){
            for(int j = 1; j < i; j++){
               System.err.print("*");
            }
            System.err.println("*");
         }

         sc.close();

      }
      catch (Exception e) {
         System.err.println(e);
      }
   }
}


//Triangle rectangle 2


package etoiles;

import java.util.Scanner;

public class Boucle {
   public static void main(String[] args){
      try {
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();

         for(int i = x; i > 0; i--){
            for(int j = 1; j < i; j++){
               System.err.print(" ");
            }
            for (int k = i; k<=x; k++){
               System.err.print("*");
            }
            System.err.println(""); 
         }

         sc.close();

      }
      catch (Exception e) {
         System.err.println(e);
      }
   }
}

//Traingle Isocele




package etoiles;

import java.util.Scanner;

public class Boucle {
   public static void main(String[] args){
      try {
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();

         for(int i = 1; i <= x; i++){
            for(int j = x-i; j > 0; j--){
               System.err.print(" ");
            }
            for (int k = 1; k<=i; k++){
               System.err.print("* ");
            }
            System.err.println(""); 
         }

         sc.close();

      }
      catch (Exception e) {
         System.err.println(e);
      }
   }
}


//Demi-Losange


package etoiles;

import java.util.Scanner;

public class Boucle {
   public static void main(String[] args){
      try {
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();

         for(int i = x; i > 0; i--){
            for(int j = 1; j < i; j++){
               System.err.print(" ");
            }
            for (int k = i; k<=x; k++){
               System.err.print("*");
            }
            System.err.println(""); 
         }

         System.err.println(""); 


         for(int a = 0; a < x; a++){
            for (int z = 1; z < a + 1; z++){
               System.err.print(" ");
            }
            for(int b = x; b > a; b--){
               System.err.print("*");
            }
            System.err.println(""); 
         }

         sc.close();

      }
      catch (Exception e) {
         System.err.println(e);
      }
   }
}


//Multiplication

package etoiles;

import java.util.Scanner;

public class Boucle {
   public static void main(String[] args){
      try {
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();

         for(int i = 1; i <= x; i++){
            System.err.print(x + "*" + i + " =" ); 
            System.err.print(x*i); 

            System.err.println(""); 
         }
         sc.close();

      }
      catch (Exception e) {
         System.err.println(e);
      }
   }
}
