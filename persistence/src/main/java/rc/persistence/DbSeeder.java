package rc.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rc.domain.Hotel;

import java.util.ArrayList;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {
    private HotelReporsitory hotelReporsitory;

    @Autowired
    public DbSeeder(HotelReporsitory hotelReporsitory){
        this.hotelReporsitory = hotelReporsitory;
    }

    @Override
    public void run(String... args) throws Exception {
        Hotel marriot = new Hotel("Marriot", 5, true);
        Hotel ibis = new Hotel("Ibis", 3, false);
        Hotel goldentulip = new Hotel("Golden Tulip", 4, true);

        List<Hotel> hotels = new ArrayList();
        hotels.add(marriot);
        hotels.add(ibis);
        hotels.add(goldentulip);
        this.hotelReporsitory.saveAll(hotels);
    }
}
