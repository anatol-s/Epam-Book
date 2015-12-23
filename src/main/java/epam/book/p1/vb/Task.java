package epam.book.p1.vb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task
{
    public static void main(String[] args)
    {
        // 1
        {
            System.out.println("== 1 ==");
            List<Integer> list = new ArrayList<>();
            for (String s :
                    args)
            {
                int i = Integer.parseInt(s);
                if (i % 2 == 0)
                {
                    System.out.printf("%d ", i);
                } else list.add(i);
            }
            System.out.println();
            for (Integer integer : list)
            {
                System.out.printf("%d ", integer);
            }
            System.out.println();
            list.clear();
        }

        // 2
        {
            System.out.println("== 2 ==");
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (String arg : args)
            {
                int n = Integer.parseInt(arg);
                if (n > max) max = n;
                if (n < min) min = n;
            }
            System.out.printf("Max: %d%nMin: %d%n", max, min);
        }

        // 3
        {
            System.out.println("== 3 ==");
            System.out.print("3 - ");
            for (String arg : args)
            {
                int n = Integer.parseInt(arg);
                if (n % 3 == 0) System.out.printf("%d ", n);
            }
            System.out.print("\n9 - ");
            for (String arg : args)
            {
                int n = Integer.parseInt(arg);
                if (n % 9 == 0) System.out.printf("%d ", n);
            }
            System.out.println();
        }

        // 4
        {
            System.out.println("== 4 ==");
            System.out.print("5 - ");
            for (String arg : args)
            {
                int n = Integer.parseInt(arg);
                if (n % 5 == 0) System.out.printf("%d ", n);
            }
            System.out.print("\n7 - ");
            for (String arg : args)
            {
                int n = Integer.parseInt(arg);
                if (n % 7 == 0) System.out.printf("%d ", n);
            }
            System.out.println();
        }

        // 5
        {
            System.out.println("== 5 ==");
            List<Integer> list = new ArrayList<>();
            for (String arg : args)
            {
                list.add(Integer.parseInt(arg));
            }
            int tmp;
            for (int i = 0; i < list.size(); i++)
            {
                for (int j = 0; j < list.size() - i - 1; j++)
                {
                    if (list.get(j) < list.get(j + 1))
                    {
                        tmp = list.get(j + 1);
                        list.set(j + 1, list.get(j));
                        list.set(j, tmp);
                    }
                }
            }
            for (Integer integer : list)
            {
                System.out.printf("%d ", integer);
            }
            System.out.println();
        }

        // 6
        {
            System.out.println("== 6 ==");
            for (String arg : args)
            {
                if (arg.length() == 3)
                {
                    char[] c = arg.toCharArray();
                    if (c[1] != c[2])
                    {
                        System.out.printf("%s ", arg);
                    }
                }
            }
            System.out.println();
        }

        // 7
        {
            System.out.println("== 7 ==");
            // GCD
            int gcd;
            Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
            for (String arg : args)
            {
                int n = Integer.parseInt(arg);
                if (!map.containsKey(n))
                {
                    Map<Integer, Integer> innerMap = new HashMap<>();
                    int z = n;
                    for (int i = 2; i < n;)
                    {
                        if (z % i == 0)
                        {
                            int x = innerMap.get(i) == null ? 0 : innerMap.get(i);
                            innerMap.put(i, ++x);
                            z /= i;
                        } else i++;
                    }
                    map.put(n, innerMap);
                }
            }
            System.out.println(map);

            // LCM
            int lcm;
        }
    }
}
