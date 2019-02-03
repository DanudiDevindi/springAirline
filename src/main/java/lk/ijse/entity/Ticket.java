package lk.ijse.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="Ticket")
public class Ticket implements Serializable {

    @Id
    @GeneratedValue
    @Column(name ="tid")
    private int tid;
    @Column (name ="tocity")
    private String tocity;
    @Column (name ="fromcity")
    private String fromcity;
    @Column (name ="date")
    private String date;
    @Column (name ="pNo")
    private int passengerno;
    @Column (name ="fclass")
    private String fclass;

    public Ticket() {

    }

    @ManyToOne(cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "paid", referencedColumnName = "paid")
    private Passenger passenger;

    @ManyToOne(cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "pid", referencedColumnName = "pid")
    private Payment payment;

    @ManyToOne(cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "fid", referencedColumnName = "fid")
    private  Flight flight;

    public Ticket(String tocity, String fromcity, String date, int passengerno, String fclass) {
        this.tocity = tocity;
        this.fromcity = fromcity;
        this.date = date;
        this.passengerno = passengerno;
        this.fclass = fclass;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTocity() {
        return tocity;
    }

    public void setTocity(String tocity) {
        this.tocity = tocity;
    }

    public String getFromcity() {
        return fromcity;
    }

    public void setFromcity(String fromcity) {
        this.fromcity = fromcity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPassengerno() {
        return passengerno;
    }

    public void setPassengerno(int passengerno) {
        this.passengerno = passengerno;
    }

    public String getFclass() {
        return fclass;
    }

    public void setFclass(String fclass) {
        this.fclass = fclass;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "tid=" + tid +
                ", tocity='" + tocity + '\'' +
                ", fromcity='" + fromcity + '\'' +
                ", date='" + date + '\'' +
                ", passengerno=" + passengerno +
                ", fclass='" + fclass + '\'' +
                '}';
    }
}
