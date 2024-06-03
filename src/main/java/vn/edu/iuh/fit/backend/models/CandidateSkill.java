package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.backend.enums.SkillLevel;

@Entity
@Table(name = "candidate_skill")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@IdClass(CandidateSkillID.class)
public class CandidateSkill {
    @Column(name = "skill_level",nullable = false)
    private SkillLevel skillLevel;
    @Id
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Id
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "can_id")
    private Candidate candidate;
    @Column(name = "more_infos",length = 1000)
    private String moreInfo;


}
