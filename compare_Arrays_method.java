import java.util.Arrays;
public class compare_Arrays_method {
    public static void main(String[] args)
    {
       int[] arr ={1,2,3,4,5,6};
       int[] arr1 ={1,2,5,4,3,6};
       int[] arr2 ={1,2,3,4,5,6};
       int[] arr3 ={1,2,3,4,5,6};
       int[] arr4 ={1,2,5,4,5,6};
       int[] arr6 ={1,2,3,4,5,6};
       //Arrays.compare(arr,arr1)----->int
       int result=Arrays.compare(arr,arr1);
       System.out.println(result);//if array1 is smaller then array2--> -1
       int result2=Arrays.compare(arr2,arr3);
       System.out.println(result2);//if array1 is equal to array2--> 0
       int result3=Arrays.compare(arr4,arr6);
       System.out.println(result3);//if array1 is greter then array2--> 1

    }
}
