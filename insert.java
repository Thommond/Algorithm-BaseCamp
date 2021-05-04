import java.util.*;

class Insertion {

    public static void insertion(int[] arr) {

        int len = arr.length;

        // Go through arr till end
        for (int j = 1; j < len; j++) {

            int key = arr[j];
            int i = j-1;

            // Switch index
            while ( (i > -1) && ( arr[i] > key ) ) {
                arr[i+1] = arr[i];
                i -= 1;
            }

            // New key
            arr[i+1] = key;
        }
    }

    public static void main(String[] args){

        int[] arr = {18,11,4,45,173,3,58,78};

        System.out.println("Not Insertion Sorted");
        for(int num : arr) {
            System.out.print(num+" ");
        }
        System.out.println("  ");

        insertion(arr);

        System.out.println("Insertion Sorted");

        for(int num : arr) {
            System.out.print(num+" ");
        }
    }
}
