package ist412.alphacare;

/**
 *
 * @author William Chen
 * @author Collin Enders
 */
public class Log {
    int eventType;
    Profile user;
    String msg;
    
    /**
     * Default constructor
     */
    public Log(){
    }
    
    /**
     * 
     * @param eventType Type of event
     * @param user User that triggered event
     * @param target Name of person affected by the event
     */
    public Log(int eventType, Profile user, String target){
        this.eventType = eventType;
        this.user = user;
        this.msg = target;
    }
    
    /**
     * Gets the type of event
     * @return Type of event triggered
     */
    public int getEventType() {
        return eventType;
    }
    
    /**
     * Sets the event type
     * @param eventType the type of event triggered
     */
    public void setEventType(int eventType) {
        this.eventType = eventType;
    }

    /**
     * Gets the user profile that triggered event
     * @return The user profile
     */
    public Profile getUser() {
        return user;
    }

    /**
     * Sets the user profile that triggered event
     * @param user The user profile
     */
    public void setUser(Profile user) {
        this.user = user;
    }
    
    /**
     * Gets the message for the event
     * @return Human-readable event message
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Sets the message for the event
     * @param msg Human-readable event message
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    @Override
    public String toString(){
        return this.user.getFirstName() + ' ' + this.user.getLastName() + ' ' + this.msg;
    }
    
}
