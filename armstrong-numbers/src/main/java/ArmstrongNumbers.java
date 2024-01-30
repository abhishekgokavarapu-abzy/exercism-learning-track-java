import java.util.Arrays;

class ArmstrongNumbers {

    static boolean  isArmstrongNumber(int numberToCheck) {
        return numberToCheck == Arrays.stream(String.valueOf(numberToCheck).split(""))
                .mapToInt(Integer::parseInt)
                .map(i -> (int) Math.pow(i, String.valueOf(numberToCheck).length()))
                .sum();
    }
}