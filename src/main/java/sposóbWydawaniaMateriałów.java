import java.util.Scanner;

public class sposóbWydawaniaMateriałów {



    public String sposóbWydawaniaMateriałów(boolean sposóbWydawaniaMateriałów) {
        boolean materiały;
        Scanner sc = new Scanner(System.in);
        System.out.println("Materiały wydawane sykcesywnie? (tak/nie)");
        String userInput = sc.nextLine();
        if (userInput == "tak") {
            materiały = true;
        } else {
            materiały = false;
        }
        return userInput;
    }

}
