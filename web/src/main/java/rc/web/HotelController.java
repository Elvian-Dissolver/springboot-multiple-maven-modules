package rc.web;

import org.springframework.web.bind.annotation.*;
import rc.domain.Hotel;
import rc.persistence.HotelReporsitory;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class HotelController {
    private HotelReporsitory hotelReporsitory;

    public HotelController(HotelReporsitory hotelReporsitory){
        this.hotelReporsitory = hotelReporsitory;
    }

    //@RequestMapping(value = "/hotels", method = RequestMethod.GET)
    @GetMapping("/hotels")
    public List<Hotel> getHotels(){
        List<Hotel> hotels = this.hotelReporsitory.findAll();
        return  hotels;
    }

    @GetMapping("/delete/{id}")
    public List<Hotel> remove(@PathVariable long id){
        this.hotelReporsitory.deleteById(id);
        return this.hotelReporsitory.findAll();
    }
}
