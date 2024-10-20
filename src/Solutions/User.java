package Solutions;

import java.util.Scanner;

public interface User 
{
    Scanner scan = new Scanner(System.in);

    static String userInput() 
    {
        return scan.next();
    }

    static String reserveInput() 
    {
        String userTyped = userInput();
        System.out.format("User typed information %s for reservation\n", userTyped);
        return userTyped;
    }
}
