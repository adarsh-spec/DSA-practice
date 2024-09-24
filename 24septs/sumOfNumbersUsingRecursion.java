public class sumOfNumbersUsingRecursion {
    public static void main(String[] args){
        int n=7;
        func(n,0);
    }
    static void func(int n,int sum){
        if(n<1){
            System.out.print(sum);
            return;
        }
        func(n-1,sum+n);

    }
    //this is only parameterized way , you also need to learn about functional way==
}
