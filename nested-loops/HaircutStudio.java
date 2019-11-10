import java.util.Scanner;
 
public class HaircutStudio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int totalSum = 0;
        int priceForHaircut = 0;
        int prcieForColour = 0;
        boolean targetReached = false;
 
        while (!"closed".equals(input) && !(totalSum >= target)) {
            if (input.equals("haircut")) {
                input = scanner.nextLine();
                switch (input) {
                    case "mens":
                        priceForHaircut = 15;
                        totalSum += priceForHaircut;
                        break;
                    case "ladies":
                        priceForHaircut = 20;
                        totalSum += priceForHaircut;
                        break;
                    case "kids":
                        priceForHaircut = 10;
                        totalSum += priceForHaircut;
                        break;
                }
            } else if (input.equals("color")) {
                input = scanner.nextLine();
                switch (input) {
                    case "touch up":
                        prcieForColour = 20;
                        totalSum += prcieForColour;
                        break;
                    case "full color":
                        prcieForColour = 30;
                        totalSum += prcieForColour;
                        break;
                }
            }
 
            if (totalSum >= target) {
                targetReached = true;
            }
            input = scanner.nextLine();
        }
 
        if (targetReached) {
            System.out.println("You have reached your target for the day!");
            System.out.printf("Earned money: %dlv.",totalSum);
        } else {
            System.out.printf("Target not reached! You need %dlv. more.%n",(target - totalSum));
            System.out.printf("Earned money: %dlv.",totalSum);
        }
    }
}