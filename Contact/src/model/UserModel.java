package model;

public class UserModel {

	private int id;
	private String name;
	private String family;
	private int age;
		
	public UserModel() {

	}

	public UserModel(String name, String family, int age) {
		this.name = name;
		this.family = family;
		this.age = age;
	}
	
	public UserModel(int id,String name, String family, int age) {
		this.id = id;
		this.name = name;
		this.family = family;
		this.age = age;
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

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
