package com.jeffersonlupinacci.contas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jeffersonlupinacci.contas.model.Pessoa;

/**Repositório do cadastro de pessos
 * @author Jefferson Lupinacci
 * @version 0.1 */
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}