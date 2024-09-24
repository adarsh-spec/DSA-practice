import java.awt.*;

public class stackOverflow {
    public static void main(String[] args){
        int cnt=0;
        fun(cnt);
    }
    static void fun(int cnt){
        System.out.println(cnt);
        cnt++;
        fun(cnt);
    }

}
