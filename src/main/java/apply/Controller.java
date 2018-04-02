package apply;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    // GET Request
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String rootGET() {
        return "Hello World!";
    }

    // Return a 404
    @RequestMapping(value = "/fail", method = RequestMethod.GET)
    public ResponseEntity returnFail() {
        return ResponseEntity.status(404).body("This will return a 404 Status Code");
    }

}