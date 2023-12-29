package ru.docnemo.granitis.core.repository.frame;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.docnemo.granitis.core.domain.frame.QuestionRoleFrame;
import ru.docnemo.granitis.core.domain.lexical.Term;

import java.util.Optional;

public interface QuestionRoleFramesRepository extends JpaRepository<QuestionRoleFrame, Long> {
    Optional<QuestionRoleFrame> findByPrepositionTermAndPronounInterrogativeRelativeAdverbTerm(
            Term prepositionTerm,
            Term pronounInterrogativeRelativeAdverbTerm
    );
}
