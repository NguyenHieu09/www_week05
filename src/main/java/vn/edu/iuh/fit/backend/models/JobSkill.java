package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.backend.enums.SkillLevel;

@Entity
@Table(name = "job_skill")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@IdClass(JobSkillID.class)
public class JobSkill {
    @Enumerated(EnumType.STRING)
    private SkillLevel skillLevel;
    @Id
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "job_id")
    private Job job;
    @Column(name = "more_infos")
    private String moreInfo;
    @Id
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "skill_id")
    private Skill skill;
}
