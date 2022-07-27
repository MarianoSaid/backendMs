package com.portfolio.mjs.Interface;

import com.portfolio.mjs.Entity.HyS;
import java.util.List;


public interface IHySService {
    // Metodos que voy a utilizar:
    //Traer una lista de H y skils
    public List<HyS> getHyS();
    
    //Guardar un objeto de tipo HyS
    public void saveHyS(HyS hys);
    
    //Eliminar un objeto (HyS), buscado por id
    public void deleteHyS(Long id);
    
    //Busca una HyS por id
    public HyS findHyS(Long id);
}
