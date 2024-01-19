package org.javaee8.cdi.dynamic.bean.decorated;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.sql.Connection;
import java.util.Date;

public class Test {


    public int calculateDaysBetweenDates(Date start, Date end) {
        return (int) ((end.getTime() - start.getTime()) / (1000 * 60 * 60 * 24));
    }

    public Connection openConnection() {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            return java.sql.DriverManager.getConnection("jdbc:hsqldb:mem:.", "sa", "");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void main(String[] args) {
        System.out.println("Hello World!");
    }

    public void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Object connectToEjb(String name) {
        try {
            Context ctx = new InitialContext();
            return ctx.lookup(name);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
