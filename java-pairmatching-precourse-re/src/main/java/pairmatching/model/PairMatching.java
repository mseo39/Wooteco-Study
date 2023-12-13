package pairmatching.model;

import java.util.ArrayList;
import java.util.List;

public class PairMatching {
    private List<Matching> matchings;
    final int tryNum = 3;

    public PairMatching(){
        matchings = new ArrayList<>();
    }

    public List<Matching> getMatchings() {
        return matchings;
    }

    public void addMatchings(Matching matching){
        this.matchings.add(matching);
    }
}
