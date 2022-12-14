package org.soulcodeacademy.empresa.repositories;

import org.soulcodeacademy.empresa.domain.Empregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpregadoRepository extends JpaRepository<Empregado, Integer> {
    @Query(value = "SELECT * FROM empregado WHERE salario BETWEEN :valor1 AND :valor2", nativeQuery = true)
    List<Empregado> findBySalarioEntreFaixas(Double valor1, Double valor2 );
}
