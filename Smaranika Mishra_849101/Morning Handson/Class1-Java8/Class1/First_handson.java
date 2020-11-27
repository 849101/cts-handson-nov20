package Class1;

public class First_handson {
	private int Id;
	private String name;
	private String password;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public First_handson(int id, String name, String password) {
		super();
		Id = id;
		this.name = name;
		this.password = password;
	}
	public First_handson() {
		super();
	}
	
}
