package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Student;

public class StudentDataAccess {

	private static Connection connection;
	private static Statement statement;
	private static ResultSet rs;

	public static void openConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/demo", "root", "");
			statement = connection.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void closeConnection() {
		try {
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int createStudent(Student s) throws SQLException {
		openConnection();
		String insert = "INSERT INTO student(id, name, nick, nirc, mark, dob) VALUES "
				+ "("
				+s.getId()
				+",\""+s.getName()
				+"\",\""
				+s.getNick()
				+"\",\""
				+s.getNirc()
				+"\","
				+s.getMark()
				+","
				+s.getDob()+
				");";
		int result = statement.executeUpdate(insert);
		closeConnection();		
		return result;
	}

	public Student readOneStudent(Student s) {
		return null;
	}

	public ArrayList<Student> readAllStudent() {
		return null;
	}

	public int updateStudent(Student s) {
		return 0;
	}

	public int deleteStudent(Student s) {
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
