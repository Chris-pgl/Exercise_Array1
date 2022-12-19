import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] carBrands = new String[5];

        carBrands[0] = "Cadillac";
        carBrands[1] = "BMW";
        carBrands[2] = "Mercedes";
        carBrands[3] = "Ford";
        carBrands[4] = "Nissan";

        System.out.println("Number of items : "+carBrands.length);
        System.out.println(carBrands[2]);

        int[] primeNumbers = new int[6];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        System.out.println(Arrays.toString(primeNumbers));

    }
}