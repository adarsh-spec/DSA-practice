public class factorialOfNNumbersFunctionalWayRecursion {
    public static void main(String[] args){
        int f=5;
        int store= fac(f);
       System.out.print(store);
    }
    static int  fac(int f) {
        if(f==0){
            return 1;
        }
        return  f* fac(f-1);
    }


}
