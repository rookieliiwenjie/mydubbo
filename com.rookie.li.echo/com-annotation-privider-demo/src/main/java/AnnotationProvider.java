import com.configuration.PrividerConfigration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class AnnotationProvider {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(PrividerConfigration.class);
        annotationConfigApplicationContext.start();
        System.in.read();
    }

}
