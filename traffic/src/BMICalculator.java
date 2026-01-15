import java.util.Scanner;

public class BMICalculator {

    public void calculateBmi() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Weight: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter Your Height: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);
        if(bmi < 18.5) {
            System.out.println("Underweight");
        } else if(bmi>= 18.5 && bmi<25) {
            System.out.println("Normal");
        }  else if(bmi >= 25 && bmi<30) {
            System.out.println("Obese");
        }   else{
            System.out.println("Overweight");
        }
    }
}
