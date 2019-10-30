import java.util.Scanner;
 
public class CookieFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int n = Integer.parseInt(scanner.nextLine());
 
        for (int i = 1; i <= n; i++) {
 
            String input = scanner.nextLine();
            boolean ifFlour = false;
            boolean ifEggs = false;
            boolean ifSugar = false;
 
            while (true) {
 
                switch (input) {
                    case "flour":
                        ifFlour = true;
                        break;
                    case "eggs":
                        ifEggs = true;
                        break;
                    case "sugar":
                        ifSugar = true;
                        break;
                }
                if (input.equals("Bake!")) {
                    if (!(ifEggs && ifFlour && ifSugar)) {
                        System.out.println("The batter should contain flour, eggs and sugar!");
                    } else {
                        System.out.printf("Baking batch number %d...%n", i);
                        break;
                    }
                }
                input = scanner.nextLine();
            }
        }
    }
}