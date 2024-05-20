package application;

// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.sql.*;
import java.util.*;

public class TodoDao {      //dao = "data access object"

    private String databasePath;

    public TodoDao(String databasePath) {
        this.databasePath = databasePath;
    }

    public List<Todo> list() throws SQLException {
        List<Todo> todos = new ArrayList<>();
        try (Connection connection = createConnectionAndEnsureDatabase();
                ResultSet results = connection.prepareStatement("SELECT * FROM Todo").executeQuery()) {
            while (results.next()) {
                todos.add(new Todo(results.getInt("id"), results.getString("name"), results.getString("description"), results.getBoolean("done")));
            }
        }
        return todos;
    }

    public void add(Todo todo) throws SQLException {
        try (Connection connection = createConnectionAndEnsureDatabase()) {
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO Todo (name, description, done) VALUES (?, ?, ?)");
            stmt.setString(1, todo.getName());
            stmt.setString(2, todo.getDescription());
            stmt.setBoolean(3, todo.getDone());
            stmt.executeUpdate();
        }
    }

    public void markAsDone(int id) throws SQLException {
        try (Connection connection = createConnectionAndEnsureDatabase()) {
            PreparedStatement stmt = connection.prepareStatement("UPDATE Todo SET done = true WHERE id = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public void remove(int id) throws SQLException {
        try (Connection connection = createConnectionAndEnsureDatabase()) {
            PreparedStatement stmt = connection.prepareStatement("DELETE FROM Todo WHERE id = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    private Connection createConnectionAndEnsureDatabase() throws SQLException {
        Connection conn = DriverManager.getConnection(this.databasePath, "sa", "");
        try {
            conn.prepareStatement("CREATE TABLE Todo (id int auto_increment primary key, name varchar(255), description varchar(10000), done boolean)").execute();
        } catch (SQLException t) {
        }

        return conn;
    }
}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
