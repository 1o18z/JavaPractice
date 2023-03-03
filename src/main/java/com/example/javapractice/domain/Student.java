class Student {
	private String name;
	private String birth;
	private String gender;
	private int height;
	private int weight;

	public Student(String name, String birth, String gender, int height, int weight) {
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	public String showStudentInfo() {
		return getName() + " 👉🏻 생일 : " + getBirth() + " | 성별 : " + getGender() + " | 키 : " + getHeigt() + "cm " + " | 몸무게 : " + getWeight() + "kg";
	}

	public String getName() {
		return this.name;
	}
	public String getGender(){
		return this.gender;
	}
	public String getBirth() {
		return this.birth;
	}
	public int getHeigt() {
		return this.height;
	}
	public int getWeight() {
		return this.weight;
	}
}