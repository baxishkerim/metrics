package com.example.controller;

import com.example.model.enums.AdminRoles;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.AdminService;

import java.util.Set;

@RestController
@RequestMapping("metrics/admin")
public class AdminContoller {


private final AdminService service;

    public AdminContoller(AdminService service) {
        this.service = service;
    }



    @DeleteMapping("/delete")
    public void deleteMetricsByAdmin(@PathVariable Long id, @PathVariable Set<AdminRoles> rolesSet){

        service.deleteMetricsByAdmin(id, rolesSet);
    }
}
