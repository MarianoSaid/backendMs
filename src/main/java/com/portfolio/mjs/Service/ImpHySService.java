package com.portfolio.mjs.Service;

import com.portfolio.mjs.Entity.HyS;
import com.portfolio.mjs.Interface.IHySService;
import com.portfolio.mjs.Repository.IHySRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpHySService implements IHySService{
@Autowired IHySRepository ihysRepository;
    
    @Override
    public List<HyS> getHyS() {
        List<HyS> hys = ihysRepository.findAll();
        return hys;
    }

    @Override
    public void saveHyS(HyS hys) {
        ihysRepository.save(hys);
    }

    @Override
    public void deleteHyS(Long id) {
        ihysRepository.deleteById(id);
    }

    @Override
    public HyS findHyS(Long id) {
        HyS hys = ihysRepository.findById(id).orElse(null);
        return hys;
    }
    
}
