// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Grade {
   public Grade() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Your Name : ");
      String var2 = var1.nextLine();
      System.out.println("Number of Subject : ");
      int var3 = var1.nextInt();
      int var4 = 0;

      int var5;
      for(var5 = 1; var5 <= var3; ++var5) {
         System.out.println("Enter you Subject Marks : " + var5);
         int var6 = var1.nextInt();
         var4 += var6;
      }

      System.out.println(var4);
      var5 = var4 / var3;
      System.out.println(var5);
   }
}
