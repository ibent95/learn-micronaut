package learn.micronaut.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import io.micronaut.context.annotation.Bean;

@Bean
public class MainService {

    public String setGetString(String data) {
        return data + " from MainService.";
    }

    public Integer setGetInteger(Integer data) {
        return data;
    }

    public Boolean setGetBoolean(Boolean data) {
        return data;
    }

    public Map<String, Object> setGetMap(Map<String, Object> data) {
        return data;
    }

    public HashMap<String, Object> setGetHashMap(HashMap<String, Object> data) {
        return data;
    }

    public Iterable<?> setGetIterable(Iterable<?> data) {
        return data;
    }

    public Collection<?> setGetCollection(Collection<?> data) {
        return data;
    }

}
