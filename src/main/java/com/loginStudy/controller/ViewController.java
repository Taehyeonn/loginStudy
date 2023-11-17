package com.loginStudy.controller;

import com.loginStudy.domain.User;
import com.loginStudy.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class ViewController {

    private final UserService userService;

    @GetMapping("/join")
    public String joinForm(Model model) {
        model.addAttribute("user", new User());
        return "member/join";
    }

    @PostMapping("/join")
    public String join(User user) {
        userService.addUser(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("user", new User());
        return "member/login";
    }

    @PostMapping("/login")
    public String login() {
        return "redirect:/";
    }
}
