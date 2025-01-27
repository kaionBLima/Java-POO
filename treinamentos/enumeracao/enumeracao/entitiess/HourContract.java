package entitiess;

import java.util.Date;

public class HourContract {

    private Date date;
    private Double valuePerHous;
    private Integer hours;

    public HourContract(){
    }

    public HourContract(Date date, Double valuePerHous, Integer hours) {
        this.date = date;
        this.valuePerHous = valuePerHous;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHous() {
        return valuePerHous;
    }

    public void setValuePerHous(Double valuePerHous) {
        this.valuePerHous = valuePerHous;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue() {
        return valuePerHous * hours;
    }
}
