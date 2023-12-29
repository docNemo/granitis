package ru.docnemo.granitis.core.repository.frame;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.docnemo.granitis.core.domain.frame.VerbPrepositionFrame;
import ru.docnemo.granitis.core.domain.lexical.MorphologicalTrait;
import ru.docnemo.granitis.core.domain.lexical.Term;

import java.util.Optional;

public interface VerbPrepositionFrameRepository extends JpaRepository<VerbPrepositionFrame, Long> {
    Optional<VerbPrepositionFrame> findByVerbFormAndVerbReflectAndVerbVoiceAndPrepositionTermAndCaseTrait(
            MorphologicalTrait verbForm,
            MorphologicalTrait verbReflect,
            MorphologicalTrait verbVoice,
            Term prepositionTerm,
            MorphologicalTrait caseTrait
    );
}
