package se.iths;

public class LowerCaseTextProcessor implements TextProcessor {

    public String processText(String text) {
        return text.toLowerCase();
    }

}
