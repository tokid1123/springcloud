package tokid.hystrix;

import org.springframework.stereotype.Component;
import tokid.SchedualServiceHi;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry, request fail "+name;
    }
}
