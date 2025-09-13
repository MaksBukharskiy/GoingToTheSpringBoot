package SpringBoot5.RestApiStarter.EchoMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/echo")
public class EchoController {

    @Autowired
    private EchoRepository repository;

    @GetMapping
    public String ecoForm(){
        return "echo-form";
    }

    @PostMapping(path = "/message", consumes = "application/x-www-form-urlencoded")
    public String webCreate(@RequestParam String message, Model model) {
        Echo echo = new Echo(message);
        Echo saved = repository.save(echo);
        model.addAttribute("echo", saved);
        return "echo-result";
    }

}
