import java.util.Scanner;
 public class App
 {
     public static void main(String[] args)
     {

         Scanner sc= new Scanner(System.in);
         System.out.println("nhap he so a: ");
         double a=sc.nextDouble();
         System.out.println("nhap he so b: ");
         double b=sc.nextDouble();
         System.out.println("nhap he so c: ");
         double c=sc.nextDouble();
         double delta;
         delta = b*b - 4*a*c;
         double x1;
         double x2;
         
         if(delta==0)
         {
             x1=-b/2*a;
             System.out.println("phuong trinh co nghiem kep:"+"x1=x2="+x1);
         }
         else if(delta<0) System.out.println("phuong trinh vo nghiem");
         else if(delta>0) 
         {
             x1=-b + Math.sqrt(delta)/2*a;
             x2=-b - Math.sqrt(delta)/2*a;
             System.out.println("phuong trinh co hai nghiem :"+ "x1 = " + x1 +" x2 = " + x2);
         }

     }
 }

