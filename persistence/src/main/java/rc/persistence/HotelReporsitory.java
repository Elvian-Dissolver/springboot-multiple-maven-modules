package rc.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rc.domain.Hotel;

@Repository
public interface HotelReporsitory extends JpaRepository<Hotel, Long> {
}
