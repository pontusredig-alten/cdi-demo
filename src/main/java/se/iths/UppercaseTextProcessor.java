package se.iths;

public class UppercaseTextProcessor implements TextProcessor {

    public String processText(String text) {
        return text.toUpperCase();
    }

}