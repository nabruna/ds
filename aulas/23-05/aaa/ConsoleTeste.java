package aaa;

import java.util.Scanner;

public class ConsoleTeste {
    public int lerInt(String msg) {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println(msg);
                String str = input.next();
                input.close();
                return Integer.parseInt(str);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                input.close();
            }
        }
    }
}
