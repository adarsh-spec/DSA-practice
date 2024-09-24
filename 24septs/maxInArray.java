public class maxInArray {

    public static void main(String[] args){
        int[] arr = {12999,21,44,88,454,22,1212,22,4};
        System.out.println(max(arr));
    }
    static int max(int[]arr){
        int max =0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}
