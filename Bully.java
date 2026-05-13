import java.util.*;

public class Bully {

    static boolean p[] = {true, true, true, true, true};

    static void msg(int n) {

        if (!p[n - 1]) {
            System.out.println("Process down");
            return;
        }

        if (p[4]) {
            System.out.println("OK");
            return;
        }

        System.out.println("Election started by " + n);

        for (int i = n; i < 5; i++)
            System.out.println(n + " -> " + (i + 1));

        for (int i = 5; i >= 1; i--) {

            if (p[i - 1]) {
                System.out.println("Coordinator is " + i);
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1.Process Down\n2.Process Up\n3.Send a Message\n4.Exit");

            int ch = sc.nextInt();

            if (ch == 4)
                return;

            System.out.print("Enter process: ");
            int n = sc.nextInt();

            switch (ch) {

                case 1:
                    p[n - 1] = false;
                    break;

                case 2:
                    p[n - 1] = true;
                    break;

                case 3:
                    msg(n);
            }
        }
    }
}