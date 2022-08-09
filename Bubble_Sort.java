import java.lang.*;
import java.util.*;

class Array
{
    public int Arr[];

    public Array(int iSize)
    {
        Arr = new int[iSize];       //Allocating resources
    }

    public void Accept()            //To Accept data in Array
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i= 0;i <Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()           //To Display data from Array
   {
        System.out.println("Elements of the array are");
        for(int i= 0;i <Arr.length; i++)
        {
           System.out.print(Arr[i]+"  ");
        }
        System.out.println();
   }

   public void BubbleSort(char type)
   {
        int i = 0, j = 0, temp = 0;

        boolean Swap = false;

        if(type == 'I' || type == 'i')      //For Increasing Order
        {
            for(i = 0; i < Arr.length; i++)
            {
                Swap = false;              
                for(j = 0; j < Arr.length-i-1; j++)
                {
                    if(Arr[j] > Arr[j+1])
                    {
                        temp = Arr[j];
                        Arr[j] = Arr[j+1];  //Swapping Logic
                        Arr[j+1] = temp;
                        Swap = true;
                    }
                }
                if(Swap == false)           //For making code more efficient
                {
                    break;
                }
            }
        }
        else if(type == 'd' || type == 'D') //For Decreasing Order
        {
            for(i = 0; i < Arr.length; i++)
            {
                Swap = false;
                for(j = 0; j < Arr.length-i-1; j++)
                {
                    if(Arr[j] < Arr[j+1])
                    {
                        temp = Arr[j];
                        Arr[j] = Arr[j+1];  //Swapping Logic
                        Arr[j+1] = temp;
                        Swap = true;
                    }
                }
                if(Swap == false)           //For making code more efficient
                {
                    break;
                }
            }
        }
   }
}

class Bubble_Sort
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = sobj.nextInt();

        Array aobj = new Array(size);
        aobj.Accept();
        aobj.Display();

        System.out.println("In which order you want to display ?\nfor Increasing order enter 'I' or 'i' and for Decreasing order enter 'D' or 'd'");
        char ch = sobj.next().charAt(0);

        aobj.BubbleSort(ch);
        System.out.println("Data after sorting");
        aobj.Display();
    }
}