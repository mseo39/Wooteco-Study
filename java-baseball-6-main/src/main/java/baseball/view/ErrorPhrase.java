package baseball.view;

public enum ErrorPhrase {
    BASEBALL_SIZE("정답의 길이는 2보다 작을 수 없습니다."),
    RESTART_CHOICE("재시작은 1, 종료는 2를 입력하세요."),
    INPUT_SIZE("입력 숫자의 길이는 %s입니다."),
    INPUT_DUPLICATE("입력된 숫자는 중복되면 안됩니다");
    private String phrase;
    private static String error = "[ERROR]";

    ErrorPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return error+" "+this.phrase;
    }
}