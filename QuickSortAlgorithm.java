public class QuickSortAlgorithm {
    public static int partition(int[] arr, int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for (int j=low;j<high;j++){
            if (arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high] =temp;
        return i;
    }
    public static void quickSort(int[] arr, int low, int high){
        if (low<high){
            int pi=partition(arr, low, high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1, high);
        }
    }
    public static void main(String[] args) {
        int [] arr={13,15,27,2,9,10,5,12};
        int n=arr.length;
        quickSort(arr,0,n-1);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}

public class QuickSort {
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high)
    {

        // pivot
        int pivot = arr[high];
        int i = (low - 1);

        for(int j = low; j < high ; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i +1;
    }
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            quickSort(arr,low, pi-1);
            quickSort(arr, pi + 1, high);
        }
    }
    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}

Recusrsive method

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)    arr[i]=sc.nextInt();
         
        recursiveQuickSort(arr,0,n-1);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        
    }
    public static void recursiveQuickSort(int[] array, int startIdx, int endIdx) { 
        if (startIdx<endIdx){
            int idx = partition(array, startIdx, endIdx); 
            recursiveQuickSort(array, startIdx, idx - 1); 
            recursiveQuickSort(array, idx, endIdx); 
            
        } 
    }
    public static int partition(int[] array, int left, int right) { 
        int pivot = array[left]; 
        while (left <= right) { 
            while (array[left] < pivot) { 
                left++; }   
            while (array[right] > pivot) { 
                right--; } 
            if (left <= right) { 
                int tmp = array[left]; 
                array[left] = array[right]; 
                array[right] = tmp; 
                left++; 
                right--; 
                
            }
        }
        return left;
    }
}

