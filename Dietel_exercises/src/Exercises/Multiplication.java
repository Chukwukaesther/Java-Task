package Exercises;

import java.util.Scanner;
import java.util.Arrays;
public class Multiplication {
     int[] numbers = {2, 3, 5, 2, 5, 3};

    public void multiply(int[] number) {

        for (int count = 0; count < numbers.length; count++) {
            numbers[count] *= 2;

        }

        System.out.print(Arrays.toString(numbers));
    }


}
