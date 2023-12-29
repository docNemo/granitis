package ru.docnemo.granitis.core.domain.frame;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.docnemo.granitis.core.domain.lexical.MorphologicalTrait;
import ru.docnemo.granitis.core.domain.lexical.Term;
import ru.docnemo.granitis.core.domain.meaning.Meaning;

@Entity
@Table(name = "verb_preposition_frames")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VerbPrepositionFrame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_frame")
    private Long idFrame;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_meaning_situation")
    private Meaning situationMeaning;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_trait_verb_form")
    private MorphologicalTrait verbForm;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_trait_verb_reflect")
    private MorphologicalTrait verbReflect;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_trait_verb_voice")
    private MorphologicalTrait verbVoice;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_term_preposition")
    private Term prepositionTerm;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_trait_case")
    private MorphologicalTrait caseTrait;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_meaning_frame")
    private Meaning meaningFrame;

    @Column(name = "comment")
    private String comment;
}
