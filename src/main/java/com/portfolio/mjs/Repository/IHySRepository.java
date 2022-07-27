package com.portfolio.mjs.Repository;

import com.portfolio.mjs.Entity.HyS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface IHySRepository extends JpaRepository<HyS, Long> {
    
  
    
}
