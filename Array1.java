import java.lang.*;
class Array1
 {
    public static void main(String a[])
    {
        int iCnt=0;
        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        System.out.println("size of array"+arr.length);
        System.out.println("elements of array are"+arr);
        
        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            System.out.println(arr[iCnt]);
        }

        System.out.println("data by while looop");
          iCnt=0;
        while(iCnt<arr.length)
        {
            System.out.println(arr[iCnt]);
            iCnt++;
        }

        System.out.println("data by for each loop");
        for(int no:arr)
        {
            System.out.println(no);
        }
    }
    
}
