public class Reccurrssiioonn {

    static int cnt = 0;

    static void print() {
        if (cnt == 4) return;
        System.out.print(cnt);
        cnt++;
        print();
    }


    public static void main(String[] args) {
        print();
    }
}
