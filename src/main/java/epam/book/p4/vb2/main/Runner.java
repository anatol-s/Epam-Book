package epam.book.p4.vb2.main;

import epam.book.p4.vb2.action.MenuRun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void run() throws IOException {
        String wellcome = "GiftBox!\n" +
                "Введите \"help\" для открытия справки.",
        goodbye = "Пока!";
        System.out.printf("%s%n", wellcome);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            do {
                line = reader.readLine();
            } while (menuSelected(line));
        }
        System.out.print(goodbye);
    }

    private static boolean menuSelected(String line) {
        MenuRun menu = MenuRun.getInstance();
        String[] cmd = line.split(" ");
        switch (cmd[0].toUpperCase()) {
            case "HELP":
                menu.printHelp();
                break;
            case "GIFT":
                menu.doGift(cmd);
                break;
            case "CANDY":
                menu.doCandy(cmd);
                break;
            case "EXIT":
                return false;
            default:
                System.out.println("Такой команды нет!");
                return true;
        }
        return true;
    }
}
