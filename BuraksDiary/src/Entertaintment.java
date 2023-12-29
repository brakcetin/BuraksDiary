import java.util.Scanner;

public class Entertaintment {
	private String activityName;
	private String duration;
	private String time;
	private String answer;
	private boolean answerCheck = false;
	private int entertaintmentCounter = 0;
	
	Scanner scan = new Scanner(System.in);
	
	public Entertaintment() {
		super();
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public boolean isAnswerCheck() {
		return answerCheck;
	}

	public void setAnswerCheck(boolean answerCheck) {
		this.answerCheck = answerCheck;
	}

	public int getEntertaintmentCounter() {
		return entertaintmentCounter;
	}

	public void setEntertaintmentCounter(int entertaintmentCounter) {
		this.entertaintmentCounter = entertaintmentCounter;
	}
	
	
}
