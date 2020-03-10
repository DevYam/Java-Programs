import  java.util.*;
public class ArraysMethods {
    // Here we will be implementing the methods already available in the arrays class

    // Arrays library class method binary search
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int searchResult = Arrays.binarySearch(arr,30);
        System.out.println("Search result is  = "+searchResult);  // Result is 2, it returns the array index which is 2

        // Now checking the implementation of equals method
        int arr2[] = {10,20,30,40,50};
        if (Arrays.equals(arr,arr2)){
            System.out.println("Both arrays are equal");
        }else
            System.out.println("They are not equal");

        // checking the implementation of fill method of the Arrays Class
        int fillArray[] = new int[10];
        Arrays.fill(fillArray,0,5,10);
        // If we does not want to specify the from index and to index after array name then only the below signature
        // will initialize all the elements of the array
//        Arrays.fill(fillArray,20);

        for (int i:fillArray
             ) {
            System.out.println(i);
            // All the elements from 0 to 5 are initialized to 10 and rest are still 0
        }

        // Implementing the sort method of the arrays class

        int arr123[] = {23,12,3,43,99,34,1,76,9,0,24};
        Arrays.sort(arr123);        // Elements are sorted in original array itself
        for (int i:arr123
             ) {
            System.out.print(i+" "); // Prints the elements in ascending order
        }

    }

}
