public class DisplayArray {
    // There are two methods to display array elements one Using simple for loop and using foreach loop
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};

        // Using simple for loop
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        // Using foreach loop

        for(int i:arr){
            System.out.println(i);
        }
    }
}
