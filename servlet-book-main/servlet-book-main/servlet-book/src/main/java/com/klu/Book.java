package com.klu;

public class Book {
    int bid;
    String bname;
    double bprice;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public double getBprice() {
        return bprice;
    }

    public void setBprice(double bprice) {
        this.bprice = bprice;
    }

    @Override
    public String toString() {
        return "Book [bid=" + bid + ", bname=" + bname + ", bprice=" + bprice + "]";
    }
}
