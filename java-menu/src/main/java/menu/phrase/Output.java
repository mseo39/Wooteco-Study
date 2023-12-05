package menu.phrase;

public enum Output {
    SERVICE_START("점심 메뉴 추천을 시작합니다."),
    COACH_INPUT("코치의 이름을 입력해 주세요. (, 로 구분)"),
    AVOID_MENU_INPUT("%s(이)가 못 먹는 메뉴를 입력해 주세요."),
    RECOMMEND_RESULT("메뉴 추천 결과입니다."),
    PROGRAM_END("추천을 완료했습니다.");


    private String phrase;

    Output(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return this.phrase;
    }
}
