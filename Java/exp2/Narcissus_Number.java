public class Narcissus_Number{
    public static void main(String[] args) {
        int j=0;
        System.out.println("三位的水仙花数有：");
        for (int i = 100; i < 1000; i++) {
            int bit1 = i % 10;
            int bit2 = i % 100 / 10;
            int bit3 = i / 100;
            if (bit1 * bit1 * bit1 + bit2 * bit2 * bit2 + bit3 * bit3 * bit3 == i) {
                j=j+1;
                System.out.print(i+ "\t");
                if(j%2==0)
                {System.out.println();}
            }
        }
    }
}
