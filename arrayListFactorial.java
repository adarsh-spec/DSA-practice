import java.util.ArrayList;
public class arrayListFactorial {
    public static void main(String[] args) {
        System.out.println(factorialNumbers(6));
    }

    static ArrayList<Integer> factorialNumbers(Integer n) {
        // code here
        ArrayList<Integer> factorialNumberss = new ArrayList<Integer>();

        int fact =1;
        int i=1;
        while(fact<=n){
            factorialNumberss.add(fact);
            i++;
            fact = fact*i;
        }
        return factorialNumberss;

    }
}
