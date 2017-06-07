package axon.example;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventhandling.EventBus;
import org.axonframework.eventhandling.GenericEventMessage;
import org.springframework.stereotype.Component;

@Component
public class ExampleCommandHandler {
    private EventBus eventBus;

    public ExampleCommandHandler(EventBus eventBus) {
        this.eventBus = eventBus;
    }


    @CommandHandler
    public void begin(StartExampleCommand command) {
        System.out.println("Command handler");
        eventBus.publish(new GenericEventMessage<>(new ExampleStartedEvent(command.getId())));
    }
}
