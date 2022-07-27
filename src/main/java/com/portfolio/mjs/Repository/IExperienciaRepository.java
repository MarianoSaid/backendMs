
package com.portfolio.mjs.Repository;

import com.portfolio.mjs.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface IExperienciaRepository extends JpaRepository<Experiencia, Integer>{
    public Optional<Experiencia> findByEmpresaExp(String empresaExp);
    public boolean existsByEmpresaExp(String empresaExp);
}
