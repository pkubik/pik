package pl.edu.pw.elka.pik.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mateusz on 2016-03-28.
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello world";
    }

}
