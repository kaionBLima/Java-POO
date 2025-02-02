package entitiess;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientBuy {

    private String nameClient;
    private String emailClient;
    private Date bithDate;

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public ClientBuy() {
    }

    public ClientBuy(String nameClient, String emailClient, Date bithDay) {
        this.nameClient = nameClient;
        this.emailClient = emailClient;
        this.bithDate = bithDay;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public Date getBithDay() {
        return bithDate;
    }

    public void setBithDay(Date bithDay) {
        this.bithDate = bithDate;
    }

    @Override
    public String toString() {
        return nameClient + " (" + sdf.format(bithDate) + ") - " + emailClient;
    }
}
