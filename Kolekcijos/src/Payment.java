import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Payment {

	private int id;
	private String name;
	private LocalDateTime date;
	private int reciepentId;
	private int payerId;

	public Payment(int id, String name, LocalDateTime date, int reciepentId, int payerId) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.reciepentId = reciepentId;
		this.payerId = payerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public int getReciepentId() {
		return reciepentId;
	}

	public void setReciepentId(int reciepentId) {
		this.reciepentId = reciepentId;
	}

	public int getPayerId() {
		return payerId;
	}

	public void setPayerId(int payerId) {
		this.payerId = payerId;
	}
	
	public String toString() {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
		return this.getId()+" "+this.getName()+" "+dateFormat.format(this.getDate())+" "+this.getPayerId()+" "+this.getReciepentId();
	}

}
