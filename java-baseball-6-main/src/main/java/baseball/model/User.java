package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<List<Integer>> inputBaseball;

    public User(){
        this.inputBaseball = new ArrayList<>();
    }

    public void addInputBaseball(List<Integer> input){
        this.inputBaseball.add(input);
    }

    public List<List<Integer>> getInputBaseball() {
        return inputBaseball;
    }
}
