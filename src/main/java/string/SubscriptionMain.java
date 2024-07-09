package string;

import java.sql.Date;

class Subscription{
	int subscriptionID;
    String subscriptionType; // "Normal", "Privilege"
    Date subscriptionDate;
    double subscriptionAmt; // 200, 500
    
    
    public Subscription(int subscriptionID, String subscriptionType, Date subscriptionDate, double subscriptionAmt) {
        this.subscriptionID = subscriptionID;
        this.subscriptionType = subscriptionType;
        this.subscriptionDate = subscriptionDate;
        this.subscriptionAmt = subscriptionAmt;
    }


	public int getSubscriptionID() {
		return subscriptionID;
	}


	public void setSubscriptionID(int subscriptionID) {
		this.subscriptionID = subscriptionID;
	}


	public String getSubscriptionType() {
		return subscriptionType;
	}


	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}


	public Date getSubscriptionDate() {
		return subscriptionDate;
	}


	public void setSubscriptionDate(Date subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}


	public double getSubscriptionAmt() {
		return subscriptionAmt;
	}


	public void setSubscriptionAmt(double subscriptionAmt) {
		this.subscriptionAmt = subscriptionAmt;
	}
    
    
}

public class SubscriptionMain {
	public static void main(String[] args) {
		
	}
    
}
