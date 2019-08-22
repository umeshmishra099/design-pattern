package com.design.creational.objectpool;

import java.sql.Connection;

public class ObjectPoolClient
{
  public static void main(String[] args)
  {
    JDBCConnectionPool pool = new JDBCConnectionPool(
            "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
            "sa", "secret");
    Connection con = pool.checkOut();
    pool.checkIn(con);
  }
}
