package vikas.org.horse_animation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HorseController {

    @GetMapping("/horse")
    public String showHorse() {
        return "horse";
    }
}

