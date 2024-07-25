import java.util.Random;

public class RandomSeconds {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(28000);
        int hour = n / 60 / 60;

        System.out.println("осталось cекунд : " + n);
        switch (hour) {
            case 0: {
                System.out.println("осталось меньше часа");
                break;
            }
            case 1: {
                System.out.println("осталось равно час");
                break;
            }
            case 2:
            case 3:
            case 4: {
                System.out.println("осталось " + hour + " часа");
                break;
            }
            default: {
                System.out.println("осталось " + hour + " часов");
            }
        }
    }
}

