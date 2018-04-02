package apply;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("member")
public class MemberController {

    // GET Request
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String rootGET() {
        return "Hello CSHer!";
    }

    // Return a 404
    @RequestMapping(value = "/fail", method = RequestMethod.GET)
    public ResponseEntity returnFail() {
        return ResponseEntity.status(404).body("This will return a 404 Status Code");
    }

}