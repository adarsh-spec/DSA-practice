import java.util.Arrays;
import java.util.Collections;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(revArray(arr)));
        System.out.println(Arrays.toString(rasd(arr)));

    }

    static void reverse(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            swap(arr, s, e);
            s++;
            e--;
        }

    }
    static void swap(int[] arr, int s,int e){
        int temp = arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    static int[] revArray(int[] arr){
        int n= arr.length;
        int[] ans = new int[n];
        for(int i=n-1; i>=0;i--){
            ans[n-i-1]=arr[i];
        }
        return ans;
    }
    static  int[] rasd(int[] arr){
        Collections.reverse(Arrays.asList(arr));
        return arr;
    }


}
