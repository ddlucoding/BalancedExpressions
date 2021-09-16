import java.lang.Math;

public class BMI_Calculator {

    public static void main(String[] args) {
        double final_result = calculateBMI(89.9, 195.58);
        System.out.println(final_result);
    }

    public static double calculateBMI(double weightKilograms, double heightCM){
        double heightMeters = heightCM/100;
        double result = weightKilograms/(Math.pow(heightMeters, 2));
        return result;
    }
}
