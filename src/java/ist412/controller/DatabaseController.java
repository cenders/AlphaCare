package ist412.controller;

import java.sql.*;
import ist412.alphacare.*;

/**
 * Controller for managing database-related functions
 * @author Collin
 */
public class DatabaseController {
    static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://cenders.me/alphacare";

    private Connection con = null;
    private Statement stmt = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public DatabaseController() {
        
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to a selected database...");
            con = DriverManager.getConnection(DB_URL, "alphacare", "IST412");
            System.out.println("Connected database successfully...");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Profile getUserByID(String id) {
        Profile user = new Profile();
        try {
            ps = con.prepareStatement("SELECT * FROM users WHERE username = ?");
            ps.setString(1, id);
            rs = ps.executeQuery();
            rs.first();
            
            user.setUsername(rs.getString(1));
            user.setPassword(rs.getString(2));
            user.setFirstName(rs.getString(3));
            user.setLastName(rs.getString(4));
            user.setDOB(rs.getDate(5));
            user.setAddress(rs.getString(6));
            user.setPhone(rs.getString(7));
            
        }catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
    public Record[] getRecordsByUserID(String id) {
        try {
            ps = con.prepareStatement("SELECT * FROM record WHERE patient_id = ?");
            ps.setString(1, id);
            rs = ps.executeQuery();
            
            int numRows = getRowCount(rs);
            
            Record[] records = new Record[numRows];
            for( int i = 0; i < numRows; i++){
                records[i] = new Record();
                records[i].setRecordID(Integer.toString(rs.getInt(1)));
                records[i].setRecordDate(rs.getDate(2));
                records[i].setRecordType(rs.getString(3));
                records[i].setWorker(rs.getString(4));
                records[i].setPatient(rs.getString(5));
                records[i].setMsg(rs.getString(6));   
                rs.next();
            }
            return records;
            
        }catch (Exception e) {
            e.printStackTrace();
        }
        return new Record[0];
    }
    
    private int getRowCount(ResultSet resultSet){
	int size = 0;
	try {
            resultSet.last();
            size = resultSet.getRow();
            resultSet.first();
	} catch (SQLException sqlex) {
            sqlex.printStackTrace();
            return 0;
	}
            return size;
    }
}

