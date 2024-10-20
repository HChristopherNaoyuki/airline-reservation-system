package Solutions;

import java.util.Scanner;

public interface User 
{
    Scanner scan = new Scanner(System.in);

    // 사용자 입력 받기
    static String userInput() 
    {
        return scan.next();
    }

    // 예약 입력 처리
    static String reserveInput() 
    {
        String userTyped = userInput();
        System.out.format("User typed information %s for reservation\n", userTyped);
        return userTyped;
    }
}
