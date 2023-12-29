package ru.docnemo.granitis.core.repository.lexical;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.docnemo.granitis.core.domain.lexical.Lexeme;

import java.util.Optional;

public interface LexemeRepository extends JpaRepository<Lexeme, Long> {
    Optional<Lexeme> findByLexeme(String lexeme);
}
