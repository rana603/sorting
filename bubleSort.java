public class bubleSort {
    public static void main(String[] args) {
        int[] arr={7, 8, 1, 3, 2};
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

Recusrsive BubleSort
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bublesort(arr,n);
        for (int i=0;i<n;i++){
            
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void bublesort(int[] arr, int n){
        if (n==1){
            return;
        }
        for (int i=0;i<n-1;i++){
            if (arr[i]>arr[i+1]){
                swap(arr,i,i+1);
            }
        }
        bublesort(arr,n-1);
        
    }
    public static void swap(int[] arr,int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
