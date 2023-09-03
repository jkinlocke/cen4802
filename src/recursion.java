

    import java.util.Random;

    public class recursion {
        public static void main(String args[]) {


            System.out.println("the nth number is:" + fibbSequence(10));

        }

        public static int fibbSequence(int n) {
            if (n > 0) {
                return n + fibbSequence(n - 1);
            } else {
                return 0;
            }

        }
    }

