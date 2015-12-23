package epam.book.p4.vb2.action;

import epam.book.p4.vb2.entity.Candy;
import epam.book.p4.vb2.entity.GiftBox;

import java.util.HashMap;
import java.util.Map;

public class MenuRun {

    private static MenuRun instance = new MenuRun();

    private MenuRun() {}

    public static MenuRun getInstance() {
        return instance;
    }

    private Map<String, GiftBox> gifts = new HashMap<>();

    public void printHelp() {
        System.out.println("Help Page!\n\n" +
                "\tgift [опция]\n" +
                "\t\t-add [имя]\t\t\t\t\t\t\t\t- создание подарка;\n" +
                "\t\t-sort [имя] [name|weight|sugar]\t\t\t- сортировка по выбранному парамерту;\n" +
                "\t\t-print [имя] [all|sugar от-до]\t\t\t- печать содержимого подарка;\n\n" +
                "\tcandy [опция]\n" +
                "\t\t-add [имя подарка] [имя вес сахар]\t\t- добовление конфеты в подарок;\n\n" +
                "\texit\t\t\t\t\t\t\t\t\t\t- выход.");
    }

    public void doGift(String[] cmd) {
        switch (cmd[1].toUpperCase()) {
            case "-ADD":
                if (gifts.containsKey(cmd[2])) {
                    System.err.println("Подарок с таким именем существует!");
                } else {
                    gifts.put(cmd[2], new GiftBox(cmd[2]));
                }
                break;
            case "-SORT":
                if (gifts.containsKey(cmd[2])) {
                    gifts.get(cmd[2]).sort(cmd[3]);
                    System.out.println("Подарок отсортирован!");
                } else {
                    System.err.println("Подарка с таким именем не существует!");
                }
                break;
            case "-PRINT":
                if (gifts.containsKey(cmd[2])) {
                    GiftBox giftBox = gifts.get(cmd[2]);
                    if (cmd.length < 4 || cmd[3].toUpperCase().equals("ALL")) {
                        System.out.println(giftBox);
                    }
                    else if (cmd[3].toUpperCase().equals("SUGAR")) {
                        String[] range = cmd[4].split("-");
                        for (Candy candy : giftBox.getCandies()) {
                            if (candy.getSugar() >= Integer.parseInt(range[0]) && candy.getSugar() <= Integer.parseInt(range[1])) {
                                System.out.println(candy);
                            }
                        }
                    }
                } else {
                    System.err.println("Подарка с таким именем не существует!");
                }
        }
    }

    public void doCandy(String[] cmd) {
        if (cmd[1].toUpperCase().equals("-ADD")) {
            if (gifts.containsKey(cmd[2])) {
                gifts.get(cmd[2]).add(new Candy(cmd[3], Integer.parseInt(cmd[4]), Integer.parseInt(cmd[5])));
            } else {
                System.err.println("Подарка с таким именем не существует!");
            }
        }
    }
}
