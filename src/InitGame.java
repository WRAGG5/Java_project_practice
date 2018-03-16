import java.awt.*;
import java.io.*;
import java.util.Scanner;

class Terrorist
{
    int age;
    String name;
    String Color;

    Terrorist(int ter_age, String ter_name, String ter_Color)
    {
        age = ter_age;
        name = "Terrorist " + ter_name;
        Color = ter_Color;
    }
}

class CounterTerrorist
{
    int age;
    String name;
    String Color;

    CounterTerrorist(int ct_age , String ct_name , String ct_color)
    {
        age = ct_age;
        name = "counterTerrorist " + ct_name;
        Color = ct_color;
    }
}
public class InitGame
{
    public static void main(String args[])throws Exception
    {
        System.out.println("What kind of terrorist you want? Enter age, name, color.");

        Scanner sc = new Scanner(System.in);
        int users_entered_age = sc.nextInt();
        sc.nextLine();
        String users_entered_name = sc.nextLine();
        String users_entered_color = sc.nextLine();

        Terrorist gangsta = new Terrorist(users_entered_age, users_entered_name, users_entered_color);
        System.out.println("Your new gangsta is: ");
        System.out.print(gangsta.name + " * " + Integer.toString(gangsta.age) + " * " + gangsta.Color);

        System.out.println("\n\nWhat kind of Counterterrorist you want? Enter age, name, color.");
        Scanner obc = new Scanner(System.in);
        int user_entered_age = obc.nextInt();
        obc.nextLine();
        String user_entered_name = obc.nextLine();
        String user_entered_color = obc.nextLine();

        CounterTerrorist wannabeGangsta = new CounterTerrorist(user_entered_age , user_entered_name , user_entered_color);
        System.out.println("your new wannabeGangsta is :   ");
        System.out.println(wannabeGangsta.name  +  " * " + Integer.toString(wannabeGangsta.age) + " * " + wannabeGangsta.Color );
    }
}