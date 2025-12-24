package com.xeroxgetters.portal.repository;

import com.xeroxgetters.portal.model.order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderrepository extends JpaRepository<order, Long> {
}
