package template.view;

public enum InputPhrase {
    INPUT_CHOICE("");

    private String phrase;

    InputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return this.phrase;
    }
}