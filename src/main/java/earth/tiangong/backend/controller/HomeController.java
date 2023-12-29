package earth.tiangong.backend.controller;

import static org.springframework.http.ResponseEntity.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/ok")
    public ResponseEntity<String> getOk() {
        return ok("ok");
    }
}