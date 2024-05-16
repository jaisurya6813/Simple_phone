import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static ArrayList<String> Ar=new ArrayList<String>();
    public static void main(String[]args) {
        System.out.println("Hello User");
        Main_menu mm = new Main_menu();
        mm.first_menu();
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                MC_menu mcm = new MC_menu();
                mcm.MC_menu();
                break;
            case 2:
                Messages_menu op = new Messages_menu();
                op.Messages_menu();
                break;

            case 3:
                System.exit(1);
        }
}
}