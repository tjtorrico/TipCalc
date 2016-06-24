package net.tjtorrico.tipcalc.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by TJT on 08/06/2016.
 */
public class TipRecord {
    private double bill;
    private int tipPercentage;
    private Date timesTemp;

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void setTipPercentage(int tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    public Date getTimesTemp() {
        return timesTemp;
    }

    public void setTimesTemp(Date timesTemp) {
        this.timesTemp = timesTemp;
    }

    public double getTip(){
        return bill*(tipPercentage/100d);
    }

    public String getDateFormatted(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        return simpleDateFormat.format(timesTemp);
    }
}
