package chap14.sec05.t03;

public class Student {
	private String name;
	private int englishScore;
	private int mathScore;
	
	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	public String getName() { return name; }
	public int getEnglisScore() { return englishScore; }
	public int getMathScore() { return mathScore; }

}
