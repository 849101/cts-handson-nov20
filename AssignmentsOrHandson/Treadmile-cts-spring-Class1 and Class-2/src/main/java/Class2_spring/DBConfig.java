package Class2_spring;

import org.springframework.stereotype.Repository;

@Repository
public class DBConfig {
	
	private String dbname;
	private String dbUrl;
	
	public String getDbname() {
		return dbname;
	}
	public void setDbname(String dbname) {
		this.dbname = dbname;
	}
	public String getDbUrl() {
		return dbUrl;
	}
	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}
	@Override
	public String toString() {
		return "DBConfig [dbname=" + dbname + ", dbUrl=" + dbUrl + "]";
	}
	public void print() {
		System.out.println("dbname=Smaranika");
	}
	
}
