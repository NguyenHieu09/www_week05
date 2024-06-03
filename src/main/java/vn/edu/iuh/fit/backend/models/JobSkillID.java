package vn.edu.iuh.fit.backend.models;

import java.io.Serializable;

public class JobSkillID implements Serializable {
    private Job job;
    private Skill skill;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobSkillID that = (JobSkillID) o;

        if (!job.equals(that.job)) return false;
        return skill.equals(that.skill);
    }

    @Override
    public int hashCode() {
        int result = job.hashCode();
        result = 31 * result + skill.hashCode();
        return result;
    }
}
