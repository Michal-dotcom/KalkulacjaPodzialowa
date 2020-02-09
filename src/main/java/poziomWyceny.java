import java.util.Scanner;

public class poziomWyceny {
    public String poziomWyceny(String string) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj poziom wyceny (mat. b.; k. b.; k. w.)");
        String userInput = sc.nextLine();
        String wycena;
        if (userInput == "mat. b.") {
            wycena = "mat. b.";
        } else if (userInput == "k. b.") {
            wycena = "k. b.";
        } else {
            wycena = "k. w.";
        }
        return wycena;
    }
}
