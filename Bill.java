import java.util.Date;

public class Bill {
	private int amount;
	private String currency;
	private int serialNumber;
	private boolean isTorn;
	private Date dateIssued;

	public Bill(int amount) {
		this.amount = amount;
		
		// a 10% chance the bill is torn
		if (Utilities.randNumber(1, 10) == 5) {
			this.isTorn = true;
		}
	}
	
	public int getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}

	public Date getDateIssued() {
		return dateIssued;
	}

	public boolean getIsTorn() {
		return isTorn;
	}

	public int getSerialNumber() {
		if (serialNumber == 0) {
			serialNumber = Utilities.randNumber(100000, 10000000);
		}
		return serialNumber;
	}
}