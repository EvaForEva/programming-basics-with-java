import java.util.Scanner;
 
public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        String input = "";
        int totalSteps = 0;
 
        int steps = 0;
 
        while (totalSteps < 10000) {
            input = scan.nextLine();
            if ("Going home".equals(input)) {
                totalSteps += Integer.parseInt(scan.nextLine());
                break;
            } else {
                totalSteps += Integer.parseInt(input);
            }
        }
 
        if (totalSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal.", (10000 - totalSteps));
        }
    }
}