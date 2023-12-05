package menu.model;

import java.util.ArrayList;
import java.util.List;

public class Recommend {
    private List<User> users;
    private List<Category> categories;

    public Recommend(List<String> users) {
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
}