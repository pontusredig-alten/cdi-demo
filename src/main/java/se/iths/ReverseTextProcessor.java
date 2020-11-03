package se.iths;

public class ReverseTextProcessor implements TextProcessor {

    public String processText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

}