package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;
@Entity
@Table(name = "experience")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Experience {
    @Id
    @Column(name = "exp_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "date",name = "to_date")
    private LocalDate toDate;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "can_id")
    private Candidate candidate;
    @Column(columnDefinition = "date",name = "from_date")
    private LocalDate fromDate;
    @Column(name = "company",length = 120)
    private String companyName;
    @Column(length = 100)
    private String role;
    @Column(name = "work_desc",length = 400)
    private String workDescription;

}
