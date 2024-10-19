package com.klu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
    String url = "jdbc:mysql://localhost:3306/bookdb";
    String username = "root";
    String password = "ayazsalaar786";
    Connection con = null;
    PreparedStatement ps = null;

    public List<Book> getDetails() throws SQLException {
        con = DriverManager.getConnection(url, username, password);
        ps = con.prepareStatement("SELECT * FROM book");
        ResultSet rs = ps.executeQuery();
        List<Book> list = new ArrayList<Book>();
        while (rs.next()) {
            Book b = new Book();
            b.setBid(rs.getInt(1));
            b.setBname(rs.getString(2));
            b.setBprice(rs.getDouble(3));
            list.add(b);
        }
        return list;
    }
}
