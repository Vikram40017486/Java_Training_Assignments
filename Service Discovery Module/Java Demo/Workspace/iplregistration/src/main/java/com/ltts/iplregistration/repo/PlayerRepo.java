package com.ltts.iplregistration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.iplregistration.model.Player;

@Repository

public interface PlayerRepo extends JpaRepository<Player , Integer> {
     
}
