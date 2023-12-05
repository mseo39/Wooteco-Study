package menu.model;

import menu.phrase.Exception;

public enum Category {
    JAPANESE("일식", 1),
    KOREAN("한식", 2),
    CHINESE("중식", 3),
    ASIAN("아시안", 4),
    WESTERN("양식", 5);
    private String name;
    private int num;

    Category(String name, int num) {
        this.name = name;
        this.num=num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public static Category getCategory(int num){
        for (Category category : Category.values()) {
            if (category.getNum() == num) {
                return category;
            }
        }
        throw new IllegalArgumentException(Exception.ERROR_CATEGORY.getPhrase());
    }
}