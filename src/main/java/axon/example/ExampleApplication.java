package axon.example;

import org.axonframework.commandhandling.CommandBus;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.commandhandling.gateway.DefaultCommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ExampleApplication.class, args);
    }

    @Bean
    @Autowired
    public CommandGateway commandGateway(CommandBus bus) {
        return new DefaultCommandGateway(bus);
    }
}
