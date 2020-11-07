import jpdemo.proto.greeting.v1.GreetingRequest;
import reactor.core.publisher.Mono;

public class GreetingServiceWrapper {
    private DefaultGreetingService service = new DefaultGreetingService();

    public Mono<String> greeting(String name){
        return service.greeting(GreetingRequest.newBuilder().setName(name).build(),null)
                .map(response -> response.getGreeting());
    }
}
