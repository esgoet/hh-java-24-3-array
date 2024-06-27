import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
//        int[][] twoDArray = {{2,3},{4,5}};
//
//        System.out.println(Arrays.toString(twoDArray[1])); //Output: [4,5]
//        System.out.println(twoDArray[0][0]); //Output: 2
//        System.out.println(twoDArray[0][1]); //Output: 3

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));

        // sum of all numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Summe: " + sum);

        // largest number in array
        int max = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Größte Zahl: " + max);

        // second array with 11-20
        int[] biggerNumbers = new int[10];

        for (int i = 0; i < biggerNumbers.length; i++) {
            biggerNumbers[i] = i + 11;
        }
        System.out.println(Arrays.toString(biggerNumbers));

        // add both arrays element-wise
        int[] addedNumbers = new int[10];
        for (int i = 0; i < addedNumbers.length; i++) {
            addedNumbers[i] = numbers[i] + biggerNumbers[i];
        }
        System.out.println(Arrays.toString(addedNumbers));

    }
}
