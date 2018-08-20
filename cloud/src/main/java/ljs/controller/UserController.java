package ljs.controller;

import ljs.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping(path = "info", method = RequestMethod.GET)
    @ResponseBody
    public User info() {
        User user = new User();
        user.setId(1);
        user.setName("ljs");
        user.setAddress("china");
        user.setPhone("1234");
        return user;
    }
}
