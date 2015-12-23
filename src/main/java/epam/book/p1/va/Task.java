package epam.book.p1.va;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 1
        {
            System.out.println("== 1 ==");
            System.out.println("What is you name?");
            System.out.printf("%nWelcome %s!%n", reader.readLine());
        }

        // 2
        {
            System.out.println("== 2 ==");
            for (int i = args.length; i > 0; i--)
            {
                System.out.println(args[i - 1]);
            }
        }

        // 3
        {
            System.out.println("== 3 ==");
            try
            {
                int n = Integer.parseInt(reader.readLine());
                for (int i = 0; i < n; i++)
                {
                    System.out.println(new Random().nextInt());
                }
                System.out.println();
                for (int i = 0; i < n; i++)
                {
                    System.out.printf("%d ", new Random().nextInt());
                }
                System.out.println();
            }
            catch (NumberFormatException e)
            {
                System.out.println("Isn't number!");
            }
        }

        // 4
        {
            System.out.println("== 4 ==");
            System.out.println("Enter \"password\"");
            String pass = reader.readLine();
            if (pass.equals("password"))
            {
                System.out.println("Password correct!");
            } else System.out.println("Password incorrect!");
        }

        // 5
        {
            System.out.println("== 5 ==");
            if (args.length != 0)
            {
                int summ = 0;
                for (String s :
                        args)
                {
                    summ += Integer.parseInt(s);
                }
                System.out.printf("%nSumm = %d%n", summ);
            }
        }

        // 6
        {
            System.out.printf("== 6 ==\n" +
                    "Anatoliy Samokisha\n" +
                    "07.11.2015\n" +
                    "07.11.2015");
        }

        reader.close();
    }
}
