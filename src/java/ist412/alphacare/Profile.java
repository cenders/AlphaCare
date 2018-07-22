package ist412.alphacare;

import java.util.Date;

/**
 *
 * @author William
 */
public class Profile {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Date dob;
    private String address;
    private String phone;
    
    /**
     * Default constructor for the Profile class
     */
    public Profile(){
        
    }
    
    /**
     * Constructor for the Profile class
     */
    public Profile(String username, String password, String firstName, 
            String lastName, Date dob, String address, String phone, String age){
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
    }

    /**
     * Get the username for this user
     * @return the user's username
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * Set the username for this user
     * @param username the user's username
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * Get the password for this user
     * @return the user's password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Set the password for this user
     * @param password the user's username
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * Get the Date of Birth for this user
     * @return Date of Birth
     */
    public Date getDOB() {
        return dob;
    }

    /**
     * Set the Date of Birth for this user
     * @param dob the Date of Birth for this user
     */
    public void setDOB(Date dob){
        this.dob = dob;
    }
    
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
