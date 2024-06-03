package vn.edu.iuh.fit;

import com.neovisionaries.i18n.CountryCode;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;
import vn.edu.iuh.fit.backend.enums.SkillLevel;
import vn.edu.iuh.fit.backend.enums.SkillType;
import vn.edu.iuh.fit.backend.models.Address;
import vn.edu.iuh.fit.backend.models.Candidate;
import vn.edu.iuh.fit.backend.models.CandidateSkill;
import vn.edu.iuh.fit.backend.models.Skill;
import vn.edu.iuh.fit.backend.repositories.AddressRepository;
import vn.edu.iuh.fit.backend.repositories.CandidateRepository;
import vn.edu.iuh.fit.backend.repositories.CandidateSkillRepository;
import vn.edu.iuh.fit.backend.repositories.SkillRepository;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
public class Week05LabNguyenThiTrungHieu20020381Application {
    public static void main(String[] args) {
        SpringApplication.run(Week05LabNguyenThiTrungHieu20020381Application.class, args);
    }

//    @Autowired
//    private CandidateRepository candidateRepository;
//
//    @Autowired
//    private AddressRepository addressRepository;
//
//    @Autowired
//    private SkillRepository skillRepository;
//
//    @Autowired
//    private CandidateSkillRepository candidateSkillRepository;
//
//
//    @Bean
//    CommandLineRunner initData() {
//        return args -> {
//            Faker faker = new Faker();
//            for (int i = 0; i < 30; i++) {
//                Address address = new Address("HCM", CountryCode.VN,
//                        String.valueOf(faker.number().numberBetween(70000, 80000)),
//                        "Nguyen Van Bao", String.valueOf(faker.number().numberBetween(1, 1000)));
//                addressRepository.save(address);
//
//                Candidate candidate = new Candidate(faker.phoneNumber().cellPhone(),
//                        LocalDate.of(1998, faker.number().numberBetween(1, 12), faker.number().numberBetween(1, 28)),
//                        faker.internet().emailAddress(), faker.name().fullName(), address);
//                candidateRepository.save(candidate);
//
//                Skill skill = new Skill(SkillType.values()[faker.number().numberBetween(0, 2)],
//                        faker.job().keySkills(), faker.lorem().sentence());
//                skillRepository.save(skill);
//
////                CandidateSkill candidateSkill = new CandidateSkill(SkillLevel.values()[faker.number().numberBetween(1, 5)],
////                        skill, candidate, faker.lorem().sentence());
////                candidateSkillRepository.save(candidateSkill);
//            }
//        };
//    }
}


