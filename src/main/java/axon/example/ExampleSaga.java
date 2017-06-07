package axon.example;

import org.axonframework.eventhandling.saga.SagaEventHandler;
import org.axonframework.eventhandling.saga.StartSaga;
import org.axonframework.spring.stereotype.Saga;

@Saga()
public class ExampleSaga {

    @StartSaga
    @SagaEventHandler(associationProperty = "id")
    public void handleExampleStarted(ExampleStartedEvent event) {
        System.out.println("Started the example saga for id " + event.getId());
    }
}
