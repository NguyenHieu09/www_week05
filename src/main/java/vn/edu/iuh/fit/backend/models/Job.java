package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "job")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private long id;
    @Column(name = "job_name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "comp_id")
    private Company company;
    @OneToMany(mappedBy = "job",fetch = FetchType.LAZY)
    private List<JobSkill> jobSkills;
    @Column(name = "job_desc")
    private String description;
}
