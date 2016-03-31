package co.tylerevans.avocado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tyler on 3/30/16.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public String Index(ModelMap modelMap){
        modelMap.addAttribute("message", "Hello World");
        return "home";
    }

    @RequestMapping("json")
    public @ResponseBody String JsonIndex(){
        return "Hello World";
    }
}
