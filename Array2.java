import java.lang.*;
import java.util.*;

class Array2 {
    
    public static void main(String a[])
    {
        int iCnt=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter number of elements");
        int size=sobj.nextInt();

        int Arr[]=new int[size];

        System.out.println("enter the elements pf array");
        for(iCnt=0;iCnt<Arr.length;iCnt++);
        {
            Arr[iCnt]=sobj.nextInt();

        }
        System.out.println("Elemts if array are");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}
