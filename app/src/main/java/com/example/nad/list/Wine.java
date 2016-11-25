package com.example.nad.list;

import java.io.Serializable;

/**
 * Created by Nad on 25.11.2016.
 */

public class Wine implements Serializable {

    private int percentage;

    private String name;

    private String brand;

    private String location;

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Wine(int percentage, String name, String brand, String location) {
        this.percentage = percentage;
        this.name = name;
        this.brand = brand;
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wine wine = (Wine) o;

        if (Double.compare(wine.percentage, percentage) != 0) return false;
        if (!name.equals(wine.name)) return false;
        if (!brand.equals(wine.brand)) return false;
        return location.equals(wine.location);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(percentage);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + brand.hashCode();
        result = 31 * result + location.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "percentage=" + percentage +
                "%, name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
