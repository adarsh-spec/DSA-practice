import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class swapArray {
    public static void main(String[] args){
        int[] arr = {1,23,4,5,11};
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1] =arr[index2];
        arr[index2] =temp;
    }

}
