package com.jeffersonlupinacci.contas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jeffersonlupinacci.contas.model.Usuario;

/**Repositório do cadastro de usuários
 * @author Jefferson Lupinacci
 * @version 0.1 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByEmail(String email);

}