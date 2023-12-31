package menu.model;

import camp.nextstep.edu.missionutils.Randoms;
import menu.phrase.Exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class Recommend {
    private List<User> users;
    private List<Category> categories;

    public Recommend(List<String> users) {
        validate(users);
        this.users = new ArrayList<>();
        this.categories = new ArrayList<>();
        for (String user : users) {
            this.users.add(new User(user));
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void validate(List<String> users) {
        if (users.size() < 2 || users.size() > 5) {
            throw new IllegalArgumentException(Exception.ERROR_COACH_NUM.getPhrase());
        }
    }

    public void addCategories(int num) {
        this.categories.add(Category.getCategory(num));
    }

    public boolean validCategories(int num){
        if(Collections.frequency(this.categories, Category.getCategory(num))>=2){
            return false;
        }
        return true;
    }

    public int recommendCategory(){
        return Randoms.pickNumberInRange(1, 5);
    }

    public String recommendMenu(List<String> menus){
        return Randoms.shuffle(menus).get(0);
    }

    public boolean validMenu(String menu, User user){
        if(user.getAlreadyRecommendMenu().contains(menu) || user.getAvoidEatingMenu().contains(menu)){
            return false;
        }
        return true;
    }

    public List<String> getCategoriesName() {
        return categories.stream().map(Category::getName).collect(Collectors.toList());
    }
}