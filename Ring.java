import java.util.*;

public class Ring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int p[] = new int[n];
        boolean a[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter process id: ");
            p[i] = sc.nextInt();
            a[i] = true;
        }

        Arrays.sort(p);

        System.out.println("Process " + p[n - 1] + " selected as coordinator");
        a[n - 1] = false;

        while (true) {

            System.out.println("\n1.Election\n2.Exit");

            if (sc.nextInt() == 2)
                return;

            System.out.print("Enter initiator index: ");
            int s = sc.nextInt(), c = s, max = -1;

            do {

                int next = (c + 1) % n;

                while (!a[next])
                    next = (next + 1) % n;

                System.out.println("Process " + p[c] +
                        " sends message to " + p[next]);

                max = Math.max(max, p[next]);

                c = next;

            } while (c != s);

            System.out.println("Process " + max +
                    " selected as coordinator");

            for (int i = 0; i < n; i++)
                if (p[i] == max)
                    a[i] = false;
        }
    }
}