package top.wangruns.trackstacking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin_dashboard")
    public String adminDashboard(){
        return "admin_dashboard";
    }
}
