package ru.docnemo.granitis.core.repository.frame;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.docnemo.granitis.core.domain.frame.PrepositionFrame;
import ru.docnemo.granitis.core.domain.lexical.Term;
import ru.docnemo.granitis.core.domain.meaning.Meaning;

import java.util.Optional;

public interface PrepositionFrameRepository extends JpaRepository<PrepositionFrame, Long> {
    Optional<PrepositionFrame> findByAdditionalMeaningNoun1AndAdditionalMeaningNoun2AndPrepositionTerm(
            Meaning meaningNoun1,
            Meaning meaningNoun2,
            Term preposition
    );
}
