public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int j = 0;
        while (i > 0) {
            boolean dividedBy2 = i % 2 == 0;
            if (dividedBy2) {
                i = i/2;
                j++;
            } else {
                i--;
                j++;
            }
        }
        System.out.println(j);
    }
}
