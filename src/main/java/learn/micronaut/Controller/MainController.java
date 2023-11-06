package learn.micronaut.Controller;

import java.util.HashMap;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("public/api/v1")
public class MainController {

    HashMap<String, Object> results;

    public MainController() {
        this.results = new HashMap<>();
    }

    @Get(uri = "hello")
    public String index() {
        return "Hello world";
    }

    @Get(uri = "response-example")
    public HttpResponse<?> responseExample(HttpRequest request) {

        this.results.put("data", 12);
        this.results.put("status", "ok");
        this.results.put("request", request);

        return HttpResponse.status(HttpStatus.OK).body(results);
    }

}
