package data;

public enum Menu {
    ADD,
    LIST,
    EXIT;

    public static Menu IncorrectCommand(String menu) {
        try {
            return Menu.valueOf(menu.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Команда " + menu + " не опознана");
            return null;
        }

    }
}
