package wildanp;

import java.util.Scanner;

public class tugas3point1 {

   
    public static void main(String[] args) {
        int w;
        int x;
        int y;
        int rata;
        
        Scanner dataln = new Scanner(System.in);
        
        System.out.print("Masukkan data 1 : ");
        w = dataln.nextInt();
        System.out.print("Masukkan data 2 : ");
        x= dataln.nextInt();
        System.out.print("Masukkan data 3 : ");
        y= dataln.nextInt();
        
        System.out.println("data 1 = "+ w);
        System.out.println("data 2= "+ x);
        System.out.println("data 3 = "+ y);
        rata= (w+x+y)/3;
        System.out.println("Rata Rata = "+rata );

        
    }
    
}
