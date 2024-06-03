package vn.edu.iuh.fit.backend.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {
    @Id
    @Column(name = "add_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 50)
    private String city;
    private CountryCode country;
    @Column(length = 7)
    private String zipcode;
    @Column(length = 150)
    private String street;
    @Column(length = 20)
    private String number;

    @OneToOne(mappedBy = "address")
    private Candidate candidate;

    @OneToOne
    @JoinColumn(name = "comp_id")
    private Company company;

    public Address(String city, CountryCode country, String zipcode, String street, String number) {
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;
        this.street= street;
        this.number = number;
    }
}
