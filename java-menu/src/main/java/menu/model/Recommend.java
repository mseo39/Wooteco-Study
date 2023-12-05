package menu.model;

import menu.phrase.Exception;

import java.util.ArrayList;
import java.util.List;

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
}