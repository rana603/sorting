public class margeSort {
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        divide(arr, 0,n-1);
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void divide(int[] arr, int left, int right){
        if (left>=right) {
            return;
        }
            int mid=left+(right-left)/2;
            divide(arr, left, mid);
            divide(arr, mid+1, right);
            conquer(arr, left, mid, right);

        }
        public static void conquer(int[] arr, int left, int mid , int right){
        int idx1=left;
        int idx2=mid+1;
        int x=0;
        int [] arr1=new int[right-left+1];
//        for (int i=idx1,j=idx2;j)
        while  ( idx1<=mid && idx2<=right){
            if (arr[idx1]<=arr[idx2])
                arr1[x++]=arr[idx1++];
            else
                arr1[x++]=arr[idx2++];
        }
        while  ( idx1<=mid){
            arr1[x++]=arr[idx1++];
        }
        while  ( idx2<=right){
            arr1[x++]=arr[idx2++];
        }
        for (int i=0,j=left;i<arr1.length;i++,j++){
            arr[j]=arr1[i];
        }

    }
}
