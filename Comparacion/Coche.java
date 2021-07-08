package Comparacion;

import java.util.Objects;

public class Coche {

    private int c_year, max_speed;
    private String brand;

    public Coche() {
    }

    public Coche(int c_year, int max_speed, String brand) {
        this.c_year = c_year;
        this.max_speed = max_speed;
        this.brand = brand;
    }

    public int getC_year() {
        return this.c_year;
    }

    public void setC_year(int c_year) {
        this.c_year = c_year;
    }

    public int getMax_speed() {
        return this.max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Coche c_year(int c_year) {
        setC_year(c_year);
        return this;
    }

    public Coche max_speed(int max_speed) {
        setMax_speed(max_speed);
        return this;
    }

    public Coche brand(String brand) {
        setBrand(brand);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Coche)) {
            return false;
        }
        Coche coche = (Coche) o;
        return c_year == coche.c_year && max_speed == coche.max_speed && Objects.equals(brand, coche.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(c_year, max_speed, brand);
    }

    @Override
    public String toString() {
        return "{" +
            " c_year='" + getC_year() + "'" +
            ", max_speed='" + getMax_speed() + "'" +
            ", brand='" + getBrand() + "'" +
            "}";
    }
    
}
