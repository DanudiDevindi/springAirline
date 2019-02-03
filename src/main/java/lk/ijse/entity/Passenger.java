package lk.ijse.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pasenger")
public class Passenger implements Serializable {

    @Id
    @GeneratedValue
    @Column(name ="paid")
    private int paid;
    @Column (name ="password")
    private int password;
    @Column (name = "name")
    private String name;
    @Column (name ="tp")
    private int tp;
    @Column (name ="email")
    private String email;
    @Column (name ="dob")
    private String dob;
    @Column (name = "address")
    private String address;
    @Column (name ="city")
    private String city;
    @Column (name ="country")
    private String country;

    @OneToMany(mappedBy = "passenger", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Ticket> tickets = new ArrayList<>();// uses a list as many tickets for one passenger

    public Passenger() {

    }

    public Passenger(int password, String name, int tp, String email, String dob, String address, String city, String country) {
        this.password = password;
        this.name = name;
        this.tp = tp;
        this.email = email;
        this.dob = dob;
        this.address = address;
        this.city = city;
        this.country = country;
    }

    public int getPaid() {
        return paid;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTp() {
        return tp;
    }

    public void setTp(int tp) {
        this.tp = tp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "paid=" + paid +
                ", password=" + password +
                ", name='" + name + '\'' +
                ", tp=" + tp +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
