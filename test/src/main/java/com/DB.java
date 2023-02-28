
package com;
import java.sql.Connection;
import java.sql.DriverManager;
public class DB {
public static void main(String[] args) {
// TODO Auto-generated method stub
try{
Class.forName("com.mysql.cj.jdbc.Driver");
@SuppressWarnings("unused")
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
System.out.println("connected");
}catch(Exception e){
e.printStackTrace();
}
}
}