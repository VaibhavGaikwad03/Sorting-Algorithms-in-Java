import java.lang.*;
import java.util.*;

class Array
{
    public int Arr[];

    public Array(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i= 0;i <Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
   {
        System.out.println("Elements of the array are");
        for(int i= 0;i <Arr.length; i++)
        {
           System.out.print(Arr[i]+"  ");
        }
        System.out.println();
   }

   public void InsertionSort()
   {
        int i = 0, j= 0, selected = 0;
        //      1           2               3
        for(i = 1; i < Arr.length; i++)     // 1
        {
            //              1                                           2                            3
            for(j = i-1, selected = Arr[i]; (j >=0) && (Arr[j] > selected) ;j--)    // 2
            {
                Arr[j+1] = Arr[j];
            }
            Arr[j+1] = selected;
        }
   }
}

class Insertion_Sort
{
    public static void main(String arr[])
    {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the size of array : ");
            int size = sobj.nextInt();

            Array aobj = new Array(size);
            aobj.Accept();
            aobj.Display();

            aobj.InsertionSort();
            System.out.println("Data after sorting");
            aobj.Display();
    }
}