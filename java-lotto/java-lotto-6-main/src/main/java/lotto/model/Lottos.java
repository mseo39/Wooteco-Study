package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.util.Validator;

import java.util.ArrayList;
import java.util.List;

public class Lottos {
    private final static int LOTTO_RANGE_MIN = 1;
    private final static int LOTTO_RANGE_MAX = 45;
    private List<Lotto> lottos;
    private int lottoNum;

    public Lottos(int lottoNum) {
        this.lottos = new ArrayList<>();
        this.lottoNum = lottoNum;
    }

    public List<Lotto> getLottos() {
        return lottos;
    }

    public int getLottoNum() {
        return lottoNum;
    }

    public void addLottos(){
        this.lottos.add(new Lotto(Randoms.pickUniqueNumbersInRange(1, 45, 6)));
    }

    public static int getLottoRangeMax() {
        return LOTTO_RANGE_MAX;
    }

    public static int getLottoRangeMin() {
        return LOTTO_RANGE_MIN;
    }
}