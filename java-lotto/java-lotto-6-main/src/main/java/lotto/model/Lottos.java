package lotto.model;

import java.util.List;

public class Lottos {
    private List<Lotto> lottos;
    private int lottoNum;

    public Lottos(int lottoNum) {
        this.lottoNum = lottoNum;
    }

    public List<Lotto> getLottos() {
        return lottos;
    }

    public int getLottoNum() {
        return lottoNum;
    }
}
