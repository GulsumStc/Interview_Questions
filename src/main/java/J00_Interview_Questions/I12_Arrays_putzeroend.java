package J00_Interview_Questions;

import java.util.Arrays;

public class I12_Arrays_putzeroend {



    // Example 1: [0,2,3,0,12,0] put the zeros to the end
    //            [2,3,12,0,0]


    public static void main(String[] args) {


        int arr[]={0,2,3,0,12,0};
        int brr[]= new int[arr.length];

        int index = 0;
//
//        for (int w: arr){
//
//            if (w!=0){
//
//                brr[index] = w;
//                index++;
//
//            }
//
//        }
//        System.out.println(Arrays.toString(brr));


        for (int i =0; i<arr.length; i++){

            if (arr[i]!=0){

                brr[index] = arr[i];

                index++;

            }

        }

        System.out.println(Arrays.toString(brr));



    }

}

