public class palindromeCheck {
    public static void main(String[] args){
        String s ="madame";
        int i=0;
        System.out.println(isPal(0,s));;
    }
    static boolean isPal(int i,String s){

        if(i>s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return isPal(i+1,s);
    }
}
