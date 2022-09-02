package arrayList;

public class Programmer {
	private String name;
	private String role;
	private String codingLanguage;
	private boolean isMale;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setRole(String role) {
		this.role=role;
	}
	public String getRole() {
		return role;
	}

	public void setCodingLanguage(String codingLanguage) {
		this.codingLanguage=codingLanguage;
	}
	public String getCodingLanguage() {
		return codingLanguage;
	}

	public void setIsMale(boolean isMale) {
		this.isMale= isMale;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public Programmer(String name,String role,String codingLanguage,boolean isMale) {
		this.name=name;
		this.role=role;
		this.codingLanguage=codingLanguage;
		this.isMale= isMale;
	}
	public String toString() {
		return "Name = "+name+", Role = "+role+", CodingLanguage = "+codingLanguage+", IsMale = "+isMale;
	}


}
