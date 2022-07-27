package com.portfolio.mjs.Repository;

import com.portfolio.mjs.Entity.Footer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFooterRepository extends JpaRepository<Footer, Long> {
    
}
