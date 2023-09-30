import java.util.Scanner;
public class linearsearching
{    
public static int linearSearch(int[] array, int key)
{    
        for(int i=0;i<array.length;i++)
        {    
            if(array[i] == key)
            {    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String [] args)
    {    
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the size of array: ");
        int n=input.nextInt();
        System.out.print("Enter the elements into array: ");
        int[] array = new int[10];
        for(int i=0;i<n;i++)
        {
            array[i]=input.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int key=input.nextInt();
        System.out.print(linearSearch(array,key));
   
    }}    
  