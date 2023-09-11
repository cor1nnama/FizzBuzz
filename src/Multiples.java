public class Multiples {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 1; i < 1000; i++){
            boolean multipleOf3 = i % 3 == 0;
            boolean multipleOf5 = i % 5 == 0;

            if (multipleOf3 && multipleOf5) {
                j++;
            } else if (multipleOf3){
                j++;
            } else if (multipleOf5){
                j++;
            }
        }
        System.out.println(j);
    }
}
