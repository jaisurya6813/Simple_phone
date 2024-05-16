import java.util.ArrayList;
import java.util.Scanner;

public class Messages_menu {
    static ArrayList<String> M_AR=new ArrayList<String>();
    boolean bool=false;
    public void Messages_menu()
    {
        while(true){
        System.out.println("1.See the list of all messages");
        System.out.println("2.Send a new Message");
        System.out.println("3.Go back to previous menu");
        Scanner sc=new Scanner(System.in);
        Scanner nc=new Scanner(System.in);

        int num= sc.nextInt();
        switch(num)
        {
            case 1:
                System.out.println("\tYour Messages");
                for(int i=0;i< M_AR.size();i++)
                {
                    System.out.println(M_AR.get(i));
                }
                break;
            case 2:
                System.out.println("Enter the name of the recepient : ");
                String nam=nc.nextLine();
                for(String s:Main.Ar)
                {
                if(s.equals(nam))
                {
                    System.out.println(s);
                    System.out.println(nam);
                    bool=true;
                    break;
                }
                bool=false;
                }
                if(bool) {
                    System.out.println("Enter the msg");
                    M_AR.add(nc.nextLine());
                    System.out.println("Message sent");
                }
                else {
                    System.out.println("Recipient not found on your contacts");
                }
                break;

            case 3:
                Main.main(null);


        }
    }
}}
