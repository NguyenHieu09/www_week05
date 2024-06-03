package vn.edu.iuh.fit.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import vn.edu.iuh.fit.backend.enums.SkillType;
import vn.edu.iuh.fit.backend.models.CandidateSkill;
import vn.edu.iuh.fit.backend.models.CandidateSkillID;

import java.util.List;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, CandidateSkillID> {
    @Query("select cs from CandidateSkill  cs where cs.skill.type = ?1")
    List<CandidateSkill> findCandidateSkillBySkillType(SkillType skillType);
}