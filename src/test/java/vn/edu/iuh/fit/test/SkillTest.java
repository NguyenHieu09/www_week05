package vn.edu.iuh.fit.test;

import jakarta.annotation.PostConstruct;
import net.datafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vn.edu.iuh.fit.backend.enums.SkillType;
import vn.edu.iuh.fit.backend.models.Skill;
import vn.edu.iuh.fit.backend.repositories.SkillRepository;

import java.util.List;

@SpringBootTest
public class SkillTest {

//    private final SkillRepository skillRepository;
//    @Autowired
//    public SkillTest(SkillRepository skillRepository) {
//        this.skillRepository = skillRepository;
//    }
//
//
//    @PostConstruct
//    void init(){
//        Faker faker = new Faker();
//        for (int i = 0; i < 100; i++) {
//            Skill skill = new Skill(SkillType.values()[faker.number().numberBetween(0,2)],faker.job().keySkills(),faker.lorem().paragraph(10));
//            skillRepository.save(skill);
//
//        }
//    }

//    @Test
//    void findAll() {
//        List<Skill> skills = skillRepository.findAll();
//
//        Assertions.assertTrue(skills.size() > 50);
//    }
}
