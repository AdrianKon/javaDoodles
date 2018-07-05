package family;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class FamilyController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/xd")
    public Temp temp(@RequestParam(value = "name", defaultValue = "Word") String name){
        return new Temp(counter.incrementAndGet(), String.format("Hello, %s",name));
    }
}
