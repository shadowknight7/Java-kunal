package practice_again;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {18,25,-45,-32,-29};
        selection(arr);
        System.out.println(Arrays.toString(arr));



    }
    static void selection(int[]arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxindex=getmaxindex(arr,0,last);
            swap(arr,maxindex,last);
        }
    }
    static int getmaxindex(int[] arr,int start,int last){
       int max=start;
       for(int i =0;i<=last;i++){
           if(arr[i]>arr[max]){
               max=i;
           }
       }
       return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
