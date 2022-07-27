package com.portfolio.mjs.Interface;

import com.portfolio.mjs.Entity.Proyectos;
import java.util.List;

public interface IProyectosService {
     // Traer una lista de proyectos
    public List<Proyectos> getProyectos();
    
    //Guardar un objeto de tipo proyecto
    public void saveProyectos(Proyectos Proyectos);
    
    //Eliminar un objeto (proyecto), buscado por id
    public void deleteProyectos(Long id);
    
    //Busca una educacion por id
    public Proyectos findProyectos(Long id);
    
}
