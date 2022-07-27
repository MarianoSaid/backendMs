package com.portfolio.mjs.Service;

import com.portfolio.mjs.Entity.Footer;
import com.portfolio.mjs.Interface.IFooterService;
import com.portfolio.mjs.Repository.IFooterRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpFooterService implements IFooterService{
@Autowired IFooterRepository ifooterRepository;   
    
    @Override
    public List<Footer> getFooter() {
        List<Footer> footer = ifooterRepository.findAll();
       return footer;
    }

    @Override
    public void saveFooter(Footer footer) {
       ifooterRepository.save(footer);
    }

    @Override
    public void deleteFooter(Long id) {
     ifooterRepository.deleteById(id);
    
    }

    @Override
    public Footer findFooter(Long id) {
        Footer footer = ifooterRepository.findById(id).orElse(null);
       return footer;
    }
    
}
