package pairmatching.view;

public enum InputPhrase {
    INPUT_CHOICE("기능을 선택하세요.\n" +
            "1. 페어 매칭\n" +
            "2. 페어 조회\n" +
            "3. 페어 초기화\n" +
            "Q. 종료"),
    INPUT_PAIRMATCHING("과정, 레벨, 미션을 선택하세요.\n" +
            "ex) 백엔드, 레벨1, 자동차경주"),
    RESTART_PAIRMATCHING("매칭 정보가 있습니다. 다시 매칭하시겠습니까?\n" +
            "네 | 아니오");

    private String phrase;

    InputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return this.phrase;
    }
}