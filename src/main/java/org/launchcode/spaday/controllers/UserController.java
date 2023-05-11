package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("/add")
    public String displayAddUserForm(Model model){
        model.addAttribute(new User());
        return ("/user/add");
    }

    @PostMapping
    public String processAddUserForm(Model model, @ModelAttribute @Valid User user, Errors errors, String verify) {
        model.addAttribute("user", user);
        model.addAttribute("errorMsg", "Terrible data! Try again");
        model.addAttribute("verify", verify);
        if (errors.hasErrors()){
            return ("/user/add");
        }
        if (user.getPassword1()!=user.getPassword2()){
            return ("/user/add");
        }
        return ("/user/index");
    }
}
