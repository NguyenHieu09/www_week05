package vn.edu.iuh.fit.backend.enums;

import lombok.Getter;

@Getter
public enum SkillLevel {
    MASTER(5),

    PROFESSIONAL(4),

    ADVANCED(3),

    IMTERMEDIATE(2),

    BEGINER(1);

    SkillLevel(int value) {
    }
}
