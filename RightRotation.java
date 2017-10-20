/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rightrotation;

import java.util.Scanner;

/**
 *
 * @author avid1894
 */
public class RightRotation {

    
    public void rotate(int a[], int n, int d)
    {
        
        int [] temp = new int[n];
        for (int i=0;i<(n-d);i++)
        {
            temp[i]=a[i];
        }
        
        for(int i=n-d;i<n;i++) //7 8 9
        {
            a[i-(n-d)]=a[i]; //a[7 - 7] a [8-7] a[9-7]
        }
        
        for(int i=0;i<(n-d);i++)
        {
            a[d+i]=temp[i];
            //a[d+i] -> a[3]
        }
        
       System.out.println("Array after right rotation is");
                       for(int i=0; i<n; i++)
                {
                  System.out.print(a[i] + " ");
                }
       // return a;
    }
    public static void main(String[] args) {
        // TODO code application logic here
                RightRotation r = new RightRotation();
                int d;
                int n;
                Scanner scan=new Scanner(System.in);
                System.out.println("enter the number of elements");
                n=scan.nextInt();
                int a[] = new int[n];
                System.out.println("enter the number of rotations");
                d= scan.nextInt();
                System.out.println("Enter the array");
                for(int i=0; i<n; i++)
                {
                    a[i]=scan.nextInt();
                }
                scan.close();
                
                             r.rotate(a, n, d);
                
        
                
    }
}
