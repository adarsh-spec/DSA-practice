//public class baseConditionMet {
//    public static void main(String[] args){
//        int cnt =0;
//        count(cnt);
//    }
//    static void count(int cnt){
//        if(cnt==4) return;
//        System.out.println(cnt);
//        cnt++;
//        count(cnt);
//    }
//}

public class baseConditionMet{
    public static void main(String [] args){
        count();
    }
    static int cnt=0;
    static void count(){
        if(cnt==4) return;
        System.out.println(cnt);
        cnt++;
        count();
    }
}
