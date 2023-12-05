package menu.controller;

import menu.model.Category;
import menu.model.Menu;
import menu.model.Recommend;
import menu.model.User;
import menu.view.InputView;
import menu.view.OutputView;

import java.util.List;

public class MenuController {
    private Recommend recommend;

    public void requestCoachName() {
        while (true) {
            try {
                recommend = new Recommend(InputView.readCoachName());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void requestInputAvoidMenu(User user) {
        while (true) {
            try {
                List<String> avoidMenu = InputView.readAvoidMenu(user.getName());
                Menu.validateMenu(avoidMenu);
                user.validateAvoidMenu(avoidMenu);
                user.setAvoidMenu(avoidMenu);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void requestAvoidMenu(Recommend recommend) {
        for (User user : recommend.getUsers()) {
            requestInputAvoidMenu(user);
        }
    }

    public void requestCategory(Recommend recommend) {
        for(int i=0; i<5;i++){
            addCategory(recommend);
        }
    }

    public void addCategory(Recommend recommend) {
        boolean repeat = true;
        int num = 0;
        while (repeat) {
            num = recommend.recommendCategory();
            repeat = !recommend.validCategories(num);
        }
        recommend.addCategories(num);
    }
}
