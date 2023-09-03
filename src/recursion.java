

    import java.util.Random;

    public class recursion {

        /**
         * This method implements the fibbsequence method
         * below and passes a value of 10 to the method
         * for execution
         * @param args
         */
        public static void main(String args[]) {


            System.out.println("the nth number is:" + fibbSequence(10));

        }


        /**
         * This method implements recursion to fulfill the
         * fibonacci sequence.
         * @param n
         * @return
         */
        public static int fibbSequence(int n) {
            if (n > 0) {
                return n + fibbSequence(n - 1);
            } else {
                return 0;
            }

        }
    }

