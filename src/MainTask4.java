import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainTask4 { // 4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, sum = 0, multiplication = 1;
        System.out.print("enter the numbers or stop: ");
        boolean i = true;
        while (i) {
            String count = br.readLine();
            if (count.equals("stop")) {
                System.out.println("The programm has been stopped. ");
                i = false;
            }
            else {
                a = Integer.parseInt(count);
                sum = sum + a;
                multiplication = multiplication * a;
                System.out.println("The sum is: " + sum);
                System.out.println("The multiplication is: " + multiplication);
            }
        }
    }
}
