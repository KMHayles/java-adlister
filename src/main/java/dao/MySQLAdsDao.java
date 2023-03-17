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
        Long lastInsertedID = 0L;
        try {
            Statement statement = connection.createStatement();
            String insertQuarty = String.format("INSERT INTO ads (user_id, title, description) VALUE (%d, '%s','%s')",
                ad.getUserId(), ad.getTitle(), ad.getDescription());
            statement.executeUpdate(insertQuarty, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            resultSet.next();
            lastInsertedID = resultSet.getLong(1);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lastInsertedID;
    }

//    public static void main(String[] args) {
//        MySQLAdsDao mySQLAdsDao = new MySQLAdsDao((new Config()));
//        Ad adToInsert = new Ad (
//                1,
//                "Test Insert Ad",
//                "Test Insert Ad Description"
//        );
//        System.out.println(mySQLAdsDao.insert(adToInsert));
//    }
}
