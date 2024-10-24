import java.util.Random;

public class Average {
    public static void main(String[] args) {
        Random r = new Random(System.currentTimeMillis());
        int count = r.nextInt(20);
        int total =0;
        for (int i=0; i < count; i++){
            int n = r.nextInt(50) + 1;
            total += n;
            System.out.println(n + " ");
        }
    System.out.println();
    System.out.println("TOTAL: " + total);  
    }
}