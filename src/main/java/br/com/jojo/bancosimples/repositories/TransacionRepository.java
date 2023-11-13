package br.com.jojo.bancosimples.repositories;

import br.com.jojo.bancosimples.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacionRepository extends JpaRepository<Transaction, Long> {
}
