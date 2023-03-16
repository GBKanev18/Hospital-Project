package com.example.HospitalProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/home/login")
    public String login() {
        return "login";
    }

    @GetMapping("/home/register")
    public String register() {
        return "register";
    }

    @GetMapping("/home/login/loginDoctorPage")
    public String loginDoctorPage() {
        return "loginDoctorPage";
    }

    @GetMapping("/home/login/LoginPatientPage")
    public String LoginPatientPage() {
        return "LoginPatientPage";
    }

    @GetMapping("/home/register/RegisterDoctorPage")
    public String RegisterDoctorPage() {
        return "RegisterDoctorPage";
    }

    @GetMapping("/home/register/RegisterPatientPage")
    public String RegisterPatientPage() {
        return "RegisterPatientPage";
    }
}
