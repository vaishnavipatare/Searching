public class binarysearching
{
    public static void bs (int[]arr,int first,int last,int key)
    {
     int mid=(first+last)/2;
     while(first<=last)
     {
        if(arr[mid]<key)
        {
            first=mid+1;
        }
        else if(arr[mid]==key)
        {
            System.out.println("Elements is found at index:"+mid);
            break;
        }
        else
        {
            last=mid-1;
        }
        mid=(first+last)/2;
     }
     if(first>last)
     {
        System.out.println("Elements is not found!");
     }
    }
    public static void main(String[] args)
    {
       int[] arr={12,13,14,14,15,16,70};
       int key=12;
       int last=arr.length-1;
       bs(arr,0,last,key);
    }

}

