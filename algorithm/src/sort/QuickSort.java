package sort;

import java.util.Arrays;

/**
 * @description:
 * @author: LiJun
 * @date: Created in 2021/3/20 19:31
 */
public class QuickSort {


    public static void quickSort(int[] arr,int startIndex,int endIndex){
        if(startIndex>=endIndex){
            return;
        }
        int pivotIndex=partition(arr,startIndex,endIndex);
        quickSort(arr,startIndex,pivotIndex-1);
        quickSort(arr,pivotIndex+1,endIndex);
    }

    public static int partition(int[] arr,int startIndex,int endIndex){
        int pivot=arr[startIndex];
        int mark=startIndex;
        for(int i=startIndex;i<=endIndex;i++){
            if(pivot>arr[i]){
                mark++;
                int p=arr[mark];
                arr[mark]=arr[i];
                arr[i]=p;
            }
        }
        arr[startIndex]=arr[mark];
        arr[mark]=pivot;
        return mark;
    }


    public static void main(String[] args) {
        int[] arr=new int[]{4,2,3,1,6,8,5,7,1};
        int startIndex=0;
        int endIndex=arr.length-1;
        quickSort(arr,startIndex,endIndex);
        System.out.println(Arrays.toString(arr));
    }
}

