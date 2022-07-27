package com.portfolio.mjs.Interface;

import com.portfolio.mjs.Entity.Educacion;
import java.util.List;

public interface IEducacionService {
   // Traer una lista de educacion
    public List<Educacion> getEducacion();
    
    //Guardar un objeto de tipo educacion
    public void saveEducacion(Educacion educacion);
    
    //Eliminar un objeto (educacion), buscado por id
    public void deleteEducacion(Long id);
    
    //Busca una educacion por id
    public Educacion findEducacion(Long id);
}
