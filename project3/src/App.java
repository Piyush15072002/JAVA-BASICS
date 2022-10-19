import java.sql.*;

public class App {

    // Database connectivity

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/javacon";
        String username = "piyush";
        String password = "pant";

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        // String query = "insert into test2(name, age) values('Trunks',20)";
        String query = "select * from test2 where age=30";

        ResultSet RS = statement.executeQuery(query);

        while (RS.next()) {

            int age = RS.getInt("age");
            String name = RS.getString("name");
            System.out.println(name + " - " + age);

        }

        RS.close();
        statement.close();
        connection.close();
    }
}
