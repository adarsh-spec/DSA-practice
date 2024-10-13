import java.util.*;
public class arrayList {
    public static void main(String[]  args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(18);
        list.add(25);
        list.add(4);

        System.out.println(list.get(1));
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            System.out.print(list.get(i));
            System.out.print(list.get(i));
        }
    }
}
