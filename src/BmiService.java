public class BmiService {
    public double calculate(double height, int weight) {
        double bmi = weight / Math.pow(height, 2);
        return bmi;
    }
}