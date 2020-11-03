package se.iths;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import java.io.IOException;

public class Main {

        public static void main(String[] args) throws IOException {
            Weld weld = new Weld();
            WeldContainer container = weld.initialize();
            TextApplication textApplication =
                    container.select(TextApplication.class).get();
            textApplication.run();
            weld.shutdown();
        }



}
