package application.repository;

import application.model.Questao;
import org.springframework.data.repository.CrudRepository;

public interface QuestaoRepository extends CrudRepository<Questao, Long> {
    
}