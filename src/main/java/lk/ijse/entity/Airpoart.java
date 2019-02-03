package lk.ijse.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="Airpoart")
public class Airpoart implements Serializable {

    @Id
    @GeneratedValue
    @Column (name ="aid")
    private int aid;
    @Column (name ="country")
    private String country;
    @Column (name ="airpoartName")
    private String airpoartname;

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<FlightDetails> flightDetails = new ArrayList<>();

    public Airpoart() {
    }

    public Airpoart(String country, String airpoartname) {
        this.country = country;
        this.airpoartname = airpoartname;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAirpoartname() {
        return airpoartname;
    }

    public void setAirpoartname(String airpoartname) {
        this.airpoartname = airpoartname;
    }

    @Override
    public String toString() {
        return "Airpoart{" +
                "aid=" + aid +
                ", country='" + country + '\'' +
                ", airpoartname='" + airpoartname + '\'' +
                '}';
    }
}
