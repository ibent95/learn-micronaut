package learn.micronaut.Service;

import io.micronaut.context.annotation.Bean;

@Bean
public class CommonService {

    public String setLogger(String data) {
        return data;
    }

}
