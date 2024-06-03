package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "candidate")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Candidate {
    @Id
    @Column(name = "can_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 15,nullable = false,unique = true)
    private String phone;
    @Column(nullable = false,columnDefinition = "date")
    private LocalDate dob;
    @Column(length = 255,nullable = false,unique = true)
    private String email;
    @Column(length = 255,name = "full_name")
    private String fullName;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "add_id", name = "address", nullable = false)
    private Address address;

    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private List<CandidateSkill> candidateSkills;
    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private List<Experience> experiences;

    public Candidate(String phone, LocalDate dob, String email, String fullName, Address address) {
        this.phone = phone;
        this.dob = dob;
        this.email = email;
        this.fullName = fullName;
        this.address = address;
    }

}
