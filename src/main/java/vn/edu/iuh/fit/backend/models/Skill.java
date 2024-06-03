package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.backend.enums.SkillType;

import java.util.List;

@Entity
@Table(name = "skill")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Skill {
    @Id
    @Column(name = "skill_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "skill_type")
    private SkillType type;
    @Column(name = "skill_name")
    private String skillName;
    @Column(name = "skill_desc")
    private String skillDescription;
    @OneToMany(mappedBy = "skill", fetch = FetchType.LAZY)
    private List<JobSkill> jobSkills;

    public Skill(SkillType type, String skillName, String skillDescription) {
        this.type = type;
        this.skillName = skillName;
        this.skillDescription = skillDescription;
    }
}
