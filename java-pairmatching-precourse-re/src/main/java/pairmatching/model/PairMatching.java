package pairmatching.model;

import java.util.ArrayList;
import java.util.List;

public class PairMatching {
    private List<List<String>> matchings;
    final int tryNum = 3;

    public PairMatching(){
        matchings = new ArrayList<>();
    }
}
