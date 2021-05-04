import java.util.*;

class Bubble {


    static void bubbleSort(int[] arr) {
        int len = arr.length;
        int swap = 0;
        
         for(int i=0; i < len; i++){

                 for(int j=1; j < (len-i); j++){

                          if(arr[j-1] > arr[j]){

                                 //swap elements
                                 swap = arr[j-1];
                                 arr[j-1] = arr[j];
                                 arr[j] = swap;
                      }
                }
         }
    }


    public static void main(String[] args) {


                int arr[] ={4,70,43,5,34,127,18};

                System.out.println("Not Bubble Sorted");

                for(int i=0; i < arr.length; i++){
                        System.out.print(arr[i] + " ");
                }

                System.out.println("  ");

                bubbleSort(arr);

                System.out.println("Bubble Sorted");

                for(int i=0; i < arr.length; i++){
                        System.out.print(arr[i] + " ");
            }

        }

    }
