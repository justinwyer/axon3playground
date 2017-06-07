package axon.example;

import org.axonframework.config.SagaConfiguration;
import org.axonframework.eventhandling.EventBus;
import org.axonframework.eventsourcing.eventstore.EmbeddedEventStore;
import org.axonframework.eventsourcing.eventstore.inmemory.InMemoryEventStorageEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfig {
    @Bean
    public EventBus eventBus() {
        return new EmbeddedEventStore(new InMemoryEventStorageEngine());
    }

    @Bean
    public SagaConfiguration exampleSagaConfiguration() {
        return SagaConfiguration.subscribingSagaManager(ExampleSaga.class);
    }
}
