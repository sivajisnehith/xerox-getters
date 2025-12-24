package com.xeroxgetters.portal.repository;
import java.util.Optional;
import com.xeroxgetters.portal.model.customerprofile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface customerprofilerepository extends JpaRepository<customerprofile, Long> {
    Optional<customerprofile> findByUserId(Long userId);
}



