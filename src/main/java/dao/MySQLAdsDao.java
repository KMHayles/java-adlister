package dao;

import com.mysql.cj.jdbc.Driver;
import model.Ad;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        String quary = "SELECT * FROM ads";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(quary);
            while(resultSet.next()){
                Ad ad = new Ad(
                    resultSet.getLong("id"),
                    resultSet.getLong("user_id"),
                    resultSet.getString("title"),
                    resultSet.getString("description")
                );
                ads.add(ad);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }

    public static void main(String[] args) {
        MySQLAdsDao mySQLAdsDao = new MySQLAdsDao((new Config()));
        System.out.println(mySQLAdsDao.all());
    }
}
