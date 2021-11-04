package guru.springframefowk.spring5jokesapp.controllers;

import guru.springframefowk.spring5jokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    @Autowired
    //ova i ne mora da stoi zaso iame samo eden konstruktor i smaoto ke si naprai dependency injection
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke (Model model){

        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }

}
