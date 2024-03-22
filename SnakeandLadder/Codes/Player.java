package player;
import java.util.Scanner;

public class Player {
    String name,contactno,emailId,address;
    int age;

    public void setPlayerdetails(String name,String address,String contactno,String emailId,int age)
    {
        this.name=name;
        this.contactno= contactno;
        this.emailId= emailId;
        this.address=address;
        this.age=age;

    }

    public void setPlayername(String name){
        this.name=name;
    }

    public void getPlayerdetails()
    {
        System.out.println("player name"+this.name);
        System.out.println("player age "+this.age);
        System.out.println("player contactno "+this.contactno);
        System.out.println("player emailId"+this.emailId);
        System.out.println("player address"+this.address);
    }

    public String getPlayername()
    {
        return this.name;
    }

    public Player setPlayerdetailsfromuserInput(Player p)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter player details");
        System.out.println("enter player name");
        String name= sc.nextLine();
        System.out.println("enter player contactno");
        String contactno= sc.nextLine();
        System.out.println("enter player address");
        String address = sc.nextLine();
        System.out.println("enter player emailId");
        String emailId= sc.nextLine();
        System.out.println("enter player age");
        int age =sc.nextInt();
       
        p.setPlayerdetails(name,address,contactno,emailId,age);
        return p;
    }

    

}
