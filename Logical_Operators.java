import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class Logical_Operators {
    public static void main(String[] args)
    {
        String x = "Makarand Hinge";
        String y = "MMH";

        Scanner s = new Scanner(System.in);
        System.out.println("Enter username");
        String u = s.nextLine();
        System.out.println("Enter a password");
        String p = s.next();

        if ((u.equals(x) && p.equals(y)) || (u.equals(y) && p.equals(x)))
        {
            System.out.println("Welcome User");

        } 
        else{
            System.out.println("Wrong username or password");
        }
        }
    }

