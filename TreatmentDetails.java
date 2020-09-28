/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicmanagementsystem;

/**
 *
 * @author hp
 */
public class TreatmentDetails {
    int record_Id;
    String visiting_date;
    String Treatment_reason;
    double treament_fees;
    double total_Payment;

    public TreatmentDetails(int record_Id, String visiting_date, String Treatment_reason, double treament_fees, double total_Payment) {
        this.record_Id = record_Id;
        this.visiting_date = visiting_date;
        this.Treatment_reason = Treatment_reason;
        this.treament_fees = treament_fees;
        this.total_Payment = total_Payment;
    }

    public int getRecord_Id() {
        return record_Id;
    }

    public void setRecord_Id(int record_Id) {
        this.record_Id = record_Id;
    }

    public String getVisiting_date() {
        return visiting_date;
    }

    public void setVisiting_date(String visiting_date) {
        this.visiting_date = visiting_date;
    }

    public String getTreatment_reason() {
        return Treatment_reason;
    }

    public void setTreatment_reason(String Treatment_reason) {
        this.Treatment_reason = Treatment_reason;
    }

    public double getTreament_fees() {
        return treament_fees;
    }

    public void setTreament_fees(double treament_fees) {
        this.treament_fees = treament_fees;
    }

    public double getTotal_Payment() {
        return total_Payment;
    }

    public void setTotal_Payment(double total_Payment) {
        this.total_Payment = total_Payment;
    }
    
    
}
