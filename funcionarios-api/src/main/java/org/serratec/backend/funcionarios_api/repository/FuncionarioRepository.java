package org.serratec.backend.funcionarios_api.repository;

import org.serratec.backend.funcionarios_api.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
