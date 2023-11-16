package com.loginStudy.controller;

import com.loginStudy.domain.User;
import com.loginStudy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("users", userService.findAll());
        return "member/users";
    }

    @GetMapping("/add")
    public String addUserForm(Model model) {
        model.addAttribute("user", new User());
        return "member/add";
    }

    @PostMapping("/add")
    public String addUser(User user) {
        userService.addUser(user);
        return "redirect:/users";
    }

    @GetMapping("/{num}")
    public String updateUserForm(@PathVariable("num") int num, Model model) {
        User user = userService.findUserById(num);
        model.addAttribute("user", user);
        return "member/edit";
    }

    @PostMapping("/{num}")
    public String updateUser(@PathVariable("num") int num, User user) {
        userService.updateUser(user);
        return "redirect:/users";
    }

    @PostMapping("/{num}/delete")
    public String deleteUser(@PathVariable("num") int num) {
        userService.deleteUser(num);
        return "redirect:/users";
    }
}