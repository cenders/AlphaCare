package ist412.alphacare;

import java.util.Date;

/**
 * Manages patient records
 * @author Collin
 */
public class Record {
    
    private String recordID;
    private Date recordDate;
    private String recordType;
    private String workerID;
    private String patientID;
    private String msg;
    
    public Record(){
        
    }
    
    public Record(String recordID, Date recordDate, String recordType,
            Profile worker, Profile patient, String msg){  
    }

    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getWorker() {
        return workerID;
    }

    public void setWorker(String workerID) {
        this.workerID = workerID;
    }

    public String getPatient() {
        return patientID;
    }

    public void setPatient(String patientID) {
        this.patientID = patientID;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
