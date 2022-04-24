package todolist.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    // http://localhost:8080/todo-list/welcome
    @GetMapping("welcome")
    public String welcome() {
        return "welcome";
    }

}
