package vn.edu.iuh.fit.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vn.edu.iuh.fit.backend.repositories.CandidateRepository;

@SpringBootTest
public class CandidateSkillTest {
    @Autowired
    private CandidateRepository candidateRepository;

    @Test
    void save(){

    }
}
