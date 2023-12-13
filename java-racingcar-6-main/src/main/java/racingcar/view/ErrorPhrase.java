package racingcar.view;

public enum ErrorPhrase {
    CAR_NAME_SIZE("이름은 %d자 이하만 가능합니다."),
    STRING_TO_INTEGER("양수만 입력 가능합니다");

    private String phrase;
    private static String error = "[ERROR]";

    ErrorPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return error + " " + this.phrase;
    }
}