package view;

import domain.Menu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutputView {
    private static final String TOP_LINE = "┌ ─ ┐";
    private static final String TABLE_FORMAT = "| %s |";
    private static final String BOTTOM_LINE = "└ ─ ┘";
    private static final String ORDER_BOTTOM_LINE = "└ + ┘";

    public static void printTables(HashMap<String,Boolean> tables) {
        System.out.println("");
        System.out.println(OutputPhrase.TABLE_LIST.getPhrase());
        final int size = tables.size();
        printTop(TOP_LINE, size);
        printTableNumbers(tables);
        printBottom(tables);
    }

    public static void printMenus(final List<Menu> menus) {
        System.out.println("");
        for (final Menu menu : menus) {
            System.out.println(menu);
        }
    }

    private static void printTop(final String line, final int count) {
        for (int index = 0; index < count; index++) {
            System.out.print(line);
        }
        System.out.println();
    }

    private static void printBottom(HashMap<String,Boolean> tables){
        for(Map.Entry<String, Boolean> elem : tables.entrySet()){
            if(elem.getValue().equals(true)){
                System.out.print(ORDER_BOTTOM_LINE);
                continue;
            }
            System.out.print(BOTTOM_LINE);
        }
    }

    private static void printTableNumbers(HashMap<String,Boolean> tables) {
        for(String key : tables.keySet()){
            System.out.printf(TABLE_FORMAT, key);
        }
        System.out.println();
    }

    public static void printFunctionList(){
        System.out.println("");
        System.out.println(OutputPhrase.MAIN_DISPLAY.getPhrase());
    }
}
