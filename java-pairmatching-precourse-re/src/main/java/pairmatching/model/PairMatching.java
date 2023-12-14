package pairmatching.model;

import pairmatching.view.ErrorPhrase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairMatching {
    private List<Matching> matchings;
    final int tryNum = 3;

    public PairMatching(){
        matchings = new ArrayList<>();
    }

    public void addMatchings(Matching matching, Crew crew){
        for(int i=0; i<this.tryNum;i++){
            if(validateMatching(randomNames(crew),matching)){
                this.matchings.add(matching);
                return;
            }
        }
        throw new IllegalArgumentException(ErrorPhrase.TRY_MATCHING.getPhrase());
    }

    public List<List<String>> randomNames(Crew crew) {
        List<String> names = crew.getNames();
        List<List<String>> result= new ArrayList<>();
        for(int i=0;i<names.size();i+=2){
            result.add(new ArrayList<>(Arrays.asList(names.get(i), names.get(i+1))));
        }
        if(names.size()%2!=0){
            result.get(result.size()-1).add(names.get(names.size()-1));
        }
        return result;
    }

    public boolean validateMatching(List<List<String>> randomNames, Matching tmp){
        for(List<String> name: randomNames) {
            if(matchings.stream().filter(matching -> matching.getLevel().equals(tmp.getLevel())).anyMatch(matching -> matching.getNames().contains(name))){
                return false;
            }
        }
        return true;
    }
}
