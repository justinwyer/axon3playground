package axon.example;

public class ExampleStartedEvent {
    private String id;

    public ExampleStartedEvent(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
