package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {

    @Id
    private Long id;
    @ManyToOne
    private User user;
}
