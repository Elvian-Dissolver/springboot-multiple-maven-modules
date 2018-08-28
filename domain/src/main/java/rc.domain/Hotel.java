package rc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String nameHotel;
    private int classification;
    private boolean isOpen;

    protected Hotel(){

    }

    public Hotel(String nameHotel, int classification, boolean isOpen){
        this.nameHotel = nameHotel;
        this.classification = classification;
        this.isOpen = isOpen;
    }

    public long getId(){
        return id;
    }

    public String getNameHotel(){
        return  nameHotel;
    }

    public int getClassification(){
        return  classification;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
