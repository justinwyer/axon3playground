package axon.example;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TaskApi {
    private CommandGateway commandGateway;

    @Autowired
    public TaskApi(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping("/start/{id}")
    public ResponseEntity start(@PathVariable("id")String id) {
        commandGateway.send(new StartExampleCommand(id));
        return ResponseEntity.ok().build();
    }
}
