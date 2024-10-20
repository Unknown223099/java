public class DigitSumCalculator {
    public static long calculateDigitSum(char[] charArray) {
        long sum = 0;

        for (char c : charArray) {
            if (Character.isDigit(c)) {
                int digit = c - '0'; 
                sum += digit;
            } else {
                throw new IllegalArgumentException("Input array must consist of digits '0' to '9'");
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        char[] inputArray ={'1', '2', '3', '4', '5', '6'};
        long digitSum = calculateDigitSum(inputArray);
        System.out.println("Sum of digits: " + digitSum);
    }
}
