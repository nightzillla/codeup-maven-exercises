public class MathOperations {

    public static long add(long input1, long input2){
        return input1 + input2;
    }

    public static double tip(double bill, double tip){
        return bill * (tip/100);
    }

    public static int[] addOneToArray(int[] numbers) {
        int i = 0;
        for(int number : numbers){
            numbers[i++] = number + 1;
        }
        return numbers;
    }
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] += 1;
//        }
//        return numbers;
//    }



    public static void main(String[] args) {
        int[] startArray = {1,2,3,4,5};

    }
} // end of MathOperations
