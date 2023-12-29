package ru.docnemo.granitis.core.repository.lexical;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.docnemo.granitis.core.domain.lexical.Term;

public interface TermRepository extends JpaRepository<Term, Long> {

}
