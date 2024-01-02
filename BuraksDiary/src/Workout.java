import java.util.Scanner;

public class Workout implements IDecember16, IDecember17{
	
	private String answer;
	private boolean answerCheck = false;
	private int workoutCounter = 0;
	Scanner scan = new Scanner(System.in);

	public Workout() {
		super();
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

	public int getWorkoutCounter() {
		return workoutCounter;
	}

	public void setWorkoutCounter(int workoutCounter) {
		this.workoutCounter = workoutCounter;
	}

	@Override
	public void december16() {
		
		System.out.println("\n------------------------------------------------------------------------");
		workoutCounter = (workoutCounter+1);
		
		
		//repeated visits
		if(workoutCounter >=2)
			System.out.println("- Exercise is the key to health. Your repeated visits here really meant a lot to me. You're making me feel like a digital cheerleader here!\r\n"
					+ "  You're not just a visitor; you're the reigning champ in my heart.\r\n");
		
		System.out.println("- Hey, the sports fan! Welcome aboard. It's nice to see you here. How often do you work out?\r\n"
				+ "  1. 1-2 days a week\r\n"
				+ "  2. 3-4 days a week\r\n"
				+ "  3. 4-7 days a week\r\n"
				+ "  4. Wait, is this about food?");
		
		answerCheck = false;
		while(!answerCheck) {
			try {
				System.out.printf("=> ");
				answer = scan.next();
				
				switch(answer) {
				case "1":
					System.out.println("\r\n- Doing any exercise is better than none, my friend. Hopefully, you're not skipping workouts out of laziness but because of a busy schedule.\r\n"
							+ "  I managed to squeeze in 2 days of exercise this week. But, just so you know, I'm not hitting the gym for muscle building.\r\n"
							+ "  I've been going to the Şefik Tetik Boxing Gym to box for 2 hours for about 3 months.\r\n"
							+ "  I can go every day of the week, but this week on Saturday, December 16, I went to boxing training at 11 a.m. and then I went to give math tutoring. \r\n"
							+ "  It was a tiring day.");
					answerCheck = true;
					break;
				case "2":
					System.out.println("\r\n- You're doing great, buddy! Flexibility matters too; don't just bulk up, be a nimble powerhouse.\r\n"
							+ "  So I've been boxing instead of just bodybuilding. This week, on Saturday, December 16, I went to training at 11 o'clock.");
					answerCheck = true;
					break;
				case "3":
					System.out.println("\r\n- Getting ready for matches, Rocky? If you find the time, keep it up. Your discipline game is strong – something I aspire to, but, you know, life happens...\r\n"
							+ "  So I've been boxing instead of just bodybuilding. This week, on Saturday, December 16, I went to training at 11 o'clock.\r\n\r\n\t"
							+ "\"One thing we all adore\r\n\t"
							+ " Something worth dying for\r\n\t"
							+ " Nothing but pain\r\n\t"
							+ " Stuck in this game\r\n\t"
							+ " Searching for fortune and fame\"");
					answerCheck = true;
					break;
				case "4":
					System.out.println("\r\n- No, my friend, this isn't about food. I know meals are delightful, but our current chat is all about sports. Are you that far off the topic?\r\n"
							+ "  I don't have a lot of time because I'm busy, but this Saturday, December 16th at 11 a.m. I went to boxing training. It's better than nothing. I recommend it to you. \r\n\r\n\t"
							+ "\"Unlock the potential of your body; each workout is a brushstroke on the canvas of your health, painting a masterpiece that only you can create.\"");
					answerCheck = true;
					break;
				default:
					System.out.println("\n- Hey champ, can you choose a number from 1 , 2, 3 or 4?");
				}
			}catch(NumberFormatException e){
				System.out.println("\n- Hey champ, can you choose a number from 1 , 2, 3 or 4?");
			}
		}
	}

	@Override
	public void december17() {
		System.out.println("\r\n- By the way, have you ever watched the Rocky series? It's truly motivating, not just about boxing but also offers some life lessons from Rocky's perspective.\r\n"
				+ "  Of course, if you fully embrace Rocky and expect real life to be just like the movie, I should warn you; you might end up a bit disappointed.\r\n"
				+ "  Anyway, let's stay on topic. On Sunday, December 17th, at 11 o'clock, I went to the last boxing workout of the week.");
		
	}
	

}
