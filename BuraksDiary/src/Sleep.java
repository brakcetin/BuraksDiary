import java.util.Scanner;

public class Sleep implements IDecember12, IDecember13, IDecember14, IDecember15, IDecember16, IDecember17, IDecember18, IDecember19  {
	private String wakeUpTime;
	private String bedTime;
	private int sleepCounter=0;
	
	Scanner scan = new Scanner(System.in);

	public Sleep() {
		super();
	}

	public String getWakeUpTime() {
		return wakeUpTime;
	}

	public void setWakeUpTime(String wakeUpTime) {
		this.wakeUpTime = wakeUpTime;
	}

	public String getBedTime() {
		return bedTime;
	}

	public void setBedTime(String bedTime) {
		this.bedTime = bedTime;
	}

	public int getSleepCounter() {
		return sleepCounter;
	}

	public void setSleepCounter(int sleepCounter) {
		this.sleepCounter = sleepCounter;
	}
	
	public void sleepInfo() {
		System.out.println("\n------------------------------------------------------------------------");
		sleepCounter++;
		if(sleepCounter >= 2) {
			System.out.println("\n- Ah, déjà vu! You've asked this question before. I'm touched that you're really curious about my sleeping patterns.");
			System.out.println("- Here a word of wisdom:\n\t\"Quit being so hard on yourself. We are what we are; we love what we love. We don't need to justify it to anyone... not even to ourselves.\"\r\n"
					+ "\t― Scott Lynch, The Republic of Thieves");
		}
		System.out.println("- To be honest, I don't have a very regular sleep schedule. Do you?\n- Yes\n- No");
		boolean answerCheck = false;
		while(!answerCheck) {
			System.out.printf("=> ");
			String answer = scan.nextLine().toLowerCase();
			if(answer.equals("yes")) {
				System.out.println("\n- Getting your nightly beauty nap? Bravo, you're basically a discipline ninja.");
				answerCheck = true;
			}
			else if(answer.equals("no")) {
				System.out.println("\n- You're one of those irregular snoozers, aren't you? Do you have a busy life or are you just the laziest of them all?\n- Busy\n- Lazy");
				while(!answerCheck) {
					System.out.printf("=> ");
					String answer2 = scan.nextLine().toLowerCase();
					if(answer2.equals("busy")) {
						System.out.println("\n- I totally get you. For me, dealing with both boxing and math tutoring "
								+ "plus, university classes and exams - it's really hard to keep up with it all.");
						answerCheck = true;
					}
					else if(answer2.equals("lazy")) {
						System.out.println("\n- Don't be a couch potato; life is slipping away. Perhaps you're not doing what you love. "
								+ "What do you say we take a peek at your dreams and actions?");
						System.out.println("- \"Life's a sprint, not a sofa session. Check if your dreams are running the same race as your actions.\"");
						answerCheck = true;
					}
					else
						System.out.println("\n- I don't think that's an answer, sweetheart.");
				}
			}
			else
				System.out.println("\n- I don't think that's an answer, sweetheart.");
		}
		System.out.println("\n- Let me talk a little bit about my own sleep patterns. "
				+ "I usually go to bed at 1:00 a.m. and get up at 7:00 a.m. However, it is not possible for every day.");
	}

	@Override
	public void december12() {
		wakeUpTime = "07.30";
		bedTime = "00.00";
		System.out.println("\n- For example, tuesday (12th December) was a tiring day, I got up at " + wakeUpTime 
				+ " in the morning and went to sleep at " + bedTime + " in the evening.");
	}

	@Override
	public void december13() {
		wakeUpTime = "08.00";
		bedTime = "01.00";
		System.out.println("\n* 13th December 2023");
		System.out.println("\tI wake up at " + wakeUpTime);
		System.out.println("\tI slept at " + bedTime);
	}

	@Override
	public void december14() {
		wakeUpTime = "10.30";
		bedTime = "01.00";
		System.out.println("\n* 14th December 2023");
		System.out.println("\tI wake up at " + wakeUpTime);
		System.out.println("\tI slept at " + bedTime);
	}

	@Override
	public void december15() {
		wakeUpTime = "07.00";
		bedTime = "01.00";
		System.out.println("\n* 15th December 2023");
		System.out.println("\tI wake up at " + wakeUpTime);
		System.out.println("\tI slept at " + bedTime);
	}

	@Override
	public void december16() {
		wakeUpTime = "09.00";
		bedTime = "00.00";
		System.out.println("\n* 16th December 2023");
		System.out.println("\tI wake up at " + wakeUpTime);
		System.out.println("\tI slept at " + bedTime);
	}

	@Override
	public void december17() {
		wakeUpTime = "09.00";
		bedTime = "01.00";
		System.out.println("\n* 17th December 2023");
		System.out.println("\tI wake up at " + wakeUpTime);
		System.out.println("\tI slept at " + bedTime);
	}

	@Override
	public void december18() {
		wakeUpTime = "07.30";
		bedTime = "02.00";
		System.out.println("\n- Also, On the night of December 18th, my birthday;"
				+ " I didn't sleep much, but there wasn't a big party, just me trying to stay awake...\n"
				+ "- I would've invited you if there was a party, but it was a regular day with classes until 8:00 PM.\n"
				+ "- Nothing too exciting, just the usual routine. I fell asleep at "+bedTime+" a.m. and woke up at 07.30 the next morning");
		System.out.println("\n- If I had a party, would you want me to invite you?\n- Yes\n- No");
		System.out.printf("=> ");
		String answer = scan.nextLine();
		boolean answerCheck = false;
		while(!answerCheck) {
			if(answer.equalsIgnoreCase("yes")) {
				System.out.println("\n- Yeyy! Got myself a new buddy. You're officially in my mental VIP list.");
				answerCheck = true;
			}
			else if(answer.equalsIgnoreCase("no")) {
				System.out.println("\n- Well, you're on the losing side, my friend.");
				answerCheck = true;
			}
			else {
				System.out.println("\n- I don't think that's an answer, sweetheart.");
				System.out.printf("=> ");
				answer = scan.nextLine();
			}
		}
		
	}

	@Override
	public void december19() {
		wakeUpTime = "07.30";
		bedTime = "02.30";
		System.out.println("\n* 19th December 2023");
		System.out.println("\tI wake up at " + wakeUpTime);
		System.out.println("\tI slept at " + bedTime);
	}
	
	public void sleepList() {
		System.out.println("\n- Do you want to know what time I wake up every other day?\n- Yes\n- No");
		System.out.printf("=> ");
		String answer = scan.nextLine();
		boolean answerCheck = false;
		while(!answerCheck) {
			if(answer.equalsIgnoreCase("yes")) {
				december13();
				december14();
				december15();
				december16();
				december17();
				december19();
				answerCheck = true;
			}
			else if(answer.equalsIgnoreCase("no")) {
				System.out.println("\n- It's okay.");
				answerCheck = true;
			}
			else {
				System.out.println("\n- I don't think that's an answer, sweetheart.");
				System.out.printf("=> ");
				answer = scan.nextLine();
			}
		}
		
	}
	
	
	
}