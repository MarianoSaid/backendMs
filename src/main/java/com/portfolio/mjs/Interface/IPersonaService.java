package com.portfolio.mjs.Interface;

import com.portfolio.mjs.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto (usuario), buscado por id
    public void deletePersona(Long id);
    
    //Busca por una persona por id
    public Persona findPersona(Long id);
}
