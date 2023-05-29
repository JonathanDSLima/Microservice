package Controllers;

import java.util.function.Consumer;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.mongodb.Function;

@Component
public class CatalogController {
	
	@Bean
    public Function<String, String> function() {
        return input -> input;
    }

    @Bean
    public Consumer<String> consume() {
        return input -> {
            System.err.println("Input-" + input);
        };
    }

    @Bean
    public Supplier<String> supply() {
        return () -> "Hello from Supplier";
    }

}
