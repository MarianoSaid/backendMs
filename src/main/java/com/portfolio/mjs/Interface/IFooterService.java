package com.portfolio.mjs.Interface;

import com.portfolio.mjs.Entity.Footer;
import java.util.List;


public interface IFooterService {
    // Traer una lista del footer
    public List<Footer> getFooter();
    
    //Guardar un objeto de tipo footer
    public void saveFooter(Footer footer);
    
    //Eliminar un objeto (footer), buscado por id
    public void deleteFooter(Long id);
    
    //Busca un footer por id
    public Footer findFooter(Long id);
}
