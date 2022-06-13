package com.example.service;


import com.example.dto.AdminMetricsDto;
import lombok.extern.log4j.Log4j2;
import com.example.model.enums.AdminRoles;
import org.springframework.stereotype.Service;
import com.example.repository.AdminRepository;

import java.util.Set;

@Service
@Log4j2
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }





    public void createMetricsByAdmin(AdminMetricsDto adminMetricsDto){



//    if (adminMetricsDto.getRoles())
    }




    public void deleteMetricsByAdmin(Long id, Set<AdminRoles> rolesSet) {
        log.info("deleted successfully");
        adminRepository.deleteByIdAndRole(id, rolesSet);
    }
}
