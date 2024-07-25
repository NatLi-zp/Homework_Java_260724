public class Main {
    public static void main(String[] args) {
        double m = 10.5;
        double n = 10.45;
        int num = 10;
        double num1 = Math.abs(m - num);
        double num2 = Math.abs(n - num);
        if (num1 == num2) {
            System.out.println("Числa " + m + " и " + n + " равноудалены от " + num);
        } else if (num1 < num2) {
            System.out.println("Число " + m + " ближе к " + num);
        } else {
            System.out.println("Число " + n + " ближе к " + num);
        }
    }

}