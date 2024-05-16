import java.util.ArrayList;
import java.util.Scanner;

public class MC_menu {



    public MC_menu() {

    }

    public void MC_menu()
    {
        while(true){
        System.out.println("1.Show all contacts");
        System.out.println("2.Add a new contact");
        System.out.println("3.Search for a contact");
        System.out.println("4.Delete a contact");
        System.out.println("5.Go back to previous menu");
        Scanner sc=new Scanner(System.in);
        Scanner nc=new Scanner(System.in);
        int n = sc.nextInt();
        boolean boo=true;
        switch (n)
        {
            case 1:
                System.out.println("\tYour Contacts");
                for(int i = 0; i< Main.Ar.size(); i++)
                {
                    System.out.println(Main.Ar.get(i));
                }
                break;
            case 2:
                System.out.println("Enter the name : ");
                String test=nc.nextLine();
                //System.out.println(test);
                Main.Ar.add(test);
                System.out.println("Contact added Successfully\n");
                break;

            case 3:
                System.out.println("Enter Contact name: ");
                String Name=nc.nextLine();
                System.out.println("Searching Contact...");
                for(String s:Main.Ar)
                {
                    if(s.equals(Name))
                    {
                        System.out.println("Contact is present : "+Name);
                        boo=false;
                    }}
                    if(boo)
                    {
                        System.out.println("No such Contact");
                    }


                break;

            case 4:
                System.out.println("Enter the name of the contact ");
                Main.Ar.remove(Main.Ar.indexOf(nc.nextLine()));
                System.out.println("The contact is removed");
                break;

            case 5:
                Main.main(null);
                //System.exit(1);
        }
    }
}}
