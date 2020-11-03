package se.iths;

import javax.inject.Inject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextApplication {

    private TextProcessor textProcessor;
    private BufferedReader userInputReader;

    @Inject
    public TextApplication(TextProcessor textProcessor) {
        this.textProcessor = textProcessor;
        this.userInputReader =
                new BufferedReader(new InputStreamReader(System.in));
    }

    public void run() throws IOException {
        System.out.println("Enter the text to process : ");
        String text = userInputReader.readLine();
        System.out.println(textProcessor.processText(text));
    }

}
