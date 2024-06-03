package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "company")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Company {
    @Id
    @Column(name = "comp_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "comp_name", nullable = false)
    private String name;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "add_id", name = "address", nullable = false)
    private Address address;

    @Column(name = "web_url", nullable = false)
    private String webURL;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String email;
    @Column(length = 2000)
    private String about;
    @OneToMany(mappedBy = "company",fetch = FetchType.LAZY)
    private List<Job> jobs;

}
