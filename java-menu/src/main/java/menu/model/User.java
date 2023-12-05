package menu.model;

import menu.phrase.Exception;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<String> avoidMenu;
    private List<String> alreadyRecommendMenu;

    public User(String name) {
        validate(name);
        this.name = name;
        this.alreadyRecommendMenu = new ArrayList<>();
        this.avoidMenu = new ArrayList<>();
    }

    public List<String> getAlreadyRecommendMenu() {
        return alreadyRecommendMenu;
    }

    public List<String> getAvoidEatingMenu() {
        return avoidMenu;
    }

    public void addAlreadyRecommendMenu(String menu) {
        this.alreadyRecommendMenu.add(menu);
    }

    public void setAvoidMenu(List<String> avoidMenu) {
        this.avoidMenu = avoidMenu;
    }

    public String getName() {
        return name;
    }

    public void validate(String name){
        if(name.length()<2 || name.length()>4){
            throw new IllegalArgumentException(Exception.ERROR_NAME_SIZE.getPhrase());
        }
    }
}
