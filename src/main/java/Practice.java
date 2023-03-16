import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Practice {
    public static void main(String[] args) throws SQLException {
        Config config = new Config();
        Connection connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM albums");

//        if (resultSet.next()) {
//                 String firstArtist = resultSet.getString("artist");
//                 String firstAlbum = resultSet.getString("name");
//                 System.out.println(firstArtist);
//                 System.out.println(firstAlbum);
//             }

        while(resultSet.next()) {
//            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getString("artist"));

            System.out.println(resultSet.getString("release_date"));
        }
    }
}
