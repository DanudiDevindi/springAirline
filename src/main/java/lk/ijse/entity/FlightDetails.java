package lk.ijse.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "flightDetails")
public class FlightDetails  implements Serializable {

    @Id
    @GeneratedValue
    @Column(name ="fdid")
    private  int fdid;

    @ManyToOne(cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "fid", referencedColumnName = "fid")
    private Flight flight;

    @ManyToOne(cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "aid", referencedColumnName = "aid")
    private Airpoart airpoart;

    public FlightDetails() {
    }

    public FlightDetails(int fdid,Flight flight, Airpoart airpoart) {
        this.fdid=fdid;
        this.flight = flight;
        this.airpoart = airpoart;
    }

    public int getFdid() {
        return fdid;
    }

    public void setFdid(int fdid) {
        this.fdid = fdid;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Airpoart getAirpoart() {
        return airpoart;
    }

    public void setAirpoart(Airpoart airpoart) {
        this.airpoart = airpoart;
    }

    @Override
    public String toString() {
        return "FlightDetails{" +
                "fdid=" + fdid +
                ", flight=" + flight +
                ", airpoart=" + airpoart +
                '}';
    }
}
