package learn.micronaut.Controller;

import java.util.HashMap;

import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import learn.micronaut.Service.CommonService;
import learn.micronaut.Service.MainService;

@Controller("public/api/v1")
public class Test01Controller {

    HashMap<String, Object> results;

    CommonService commonSvc;
    MainService mainSvc;

    public Test01Controller() {
        this.results = new HashMap<>();
        this.results.put("John", "Doe");
    }

    @Inject
    public Test01Controller(CommonService commonSvc, MainService mainSvc) {
        this.commonSvc = commonSvc;
        this.mainSvc = mainSvc;
    }

    public Test01Controller(CommonService commonSvc) {
        this.commonSvc = commonSvc;
    }

    @Get(uri="test01")
    public String index() {
        return this.mainSvc.setGetString("Example Response");
    }

}