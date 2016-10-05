package han.controllers;

/**
 * Created by hanmei on 9/20/16.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController  {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        try {
            model.addAttribute("name", name);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "greeting";
    }
}
