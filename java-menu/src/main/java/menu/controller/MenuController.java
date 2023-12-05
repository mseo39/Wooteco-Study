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
}
