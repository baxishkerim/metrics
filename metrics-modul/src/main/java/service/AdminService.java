package service;


import lombok.extern.log4j.Log4j2;
import model.enums.AdminRoles;
import org.springframework.stereotype.Service;
import repository.AdminRepository;

import java.util.Set;

@Service
@Log4j2
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }


    public void deleteMetricsByAdmin(Long id, Set<AdminRoles> rolesSet) {
        log.info("deleted successfully");
        adminRepository.deleteByIdAndRole(id, rolesSet);
    }
}
