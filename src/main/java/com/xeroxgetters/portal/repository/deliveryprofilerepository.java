package com.xeroxgetters.portal.repository;

import com.xeroxgetters.portal.model.deliveryprofile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface deliveryprofilerepository extends JpaRepository<deliveryprofile, Long> {
    Optional<deliveryprofile> findByUser_Id(Long userId);
}
