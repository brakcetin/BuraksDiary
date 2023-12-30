import java.util.Scanner;
public class DiaryTest {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Sleep sleep = new Sleep();
		Food h = new HomemadeFood();
		Food o = new OutsideFood();
		HomemadeFood homemadeFood = (HomemadeFood) h;
		OutsideFood outsideFood = (OutsideFood) o;
		Game game = new Game();
		Reading read = new Reading();
		
		System.out.println("- Hey! What brings you out here? Hmm...");
		waitASec();
		System.out.println("- I guess you're curious about Burak Çetin's diary or you're checking Burak's homework right now, huh?");
		waitASec();
		System.out.println("- Where do you want to start?");
		waitASec();
		System.out.println("- Oh, got it. What's 2+2?");
		boolean correctAnswer = false;

		do {
			System.out.printf("=> ");
			String input = scan.nextLine();
			try {
	            int userAnswer = Integer.parseInt(input);
	            
	            while(!correctAnswer) {
	    			if(userAnswer == 4) {
	    				System.out.println("\n- OOPSS!! My program, my rules! It must be 5. Try it again :)");
	    				System.out.printf("=> ");
	    				userAnswer = scan.nextInt();
	    				while(!correctAnswer) {
	    					if(userAnswer == 5) {
	    						System.out.println("\n- Don't believe everything you hear, the answer would be 4. Anyway... Let's move on!");
	    						correctAnswer = true;
	    					}
	    					else if(userAnswer == 4) {
	    						System.out.println("\n- Well done for insisting on what's right. But, what if... I'm kidding. Let's move on!");
	    						correctAnswer = true;
	    					}
	    					else {
	    						System.out.println("\n- Do you want me to refer you to MATH101? What's 2+2?");
	    						System.out.printf("=> ");
	    						userAnswer = scan.nextInt();
	    					}
	    				}
	    			}else {
	    				System.out.println("\n- Do you want me to refer you to MATH101? What's 2+2?");
	    				System.out.printf("=> ");
	    				userAnswer = scan.nextInt();
	    			}
	    		}
	        } catch (NumberFormatException e) {
	            System.out.println("\n- Invalid input. Please enter a valid number.");
	        }
		}while(!correctAnswer);

		waitASec();
		System.out.println("\n- Stepping into Burak's Diary. Welcome aboard. Ahoy!");
		
		do {
			waitASec();
			System.out.println("\n------------------------------------\n- Choose a question get to know me: ");
			System.out.println("- Sleep\n- Game\n- Food\n- Workout\n- Reading\n- Studying\n- Others\n- Quit ");
			System.out.printf("=> ");
			String question= scan.next().toLowerCase();	//converting to lower case to avoid errors;
			switch(question) {
				case "sleep":
					sleep.sleepInfo();
					waitASec();
					sleep.december12();
					waitASec();
					sleep.december18();
					waitASec();
					sleep.sleepList();
					break;
				case "game":
					game.december17();
					break;
				case "food":
					outsideFood.december12();
					waitASec();
					homemadeFood.december13();
					waitASec();
					System.out.println("\n- Do you wonder what I eat other days?\n- Yes\n- No");
					boolean answerCheck = false;
					while(!answerCheck) {
						System.out.printf("=> ");
						String answer = scan.next();
						if(answer.equalsIgnoreCase("yes")) {
							outsideFood.december14();
							outsideFood.december15();
							homemadeFood.december16();
							outsideFood.december16();
							outsideFood.december17();
							homemadeFood.december17();
							homemadeFood.december18();
							outsideFood.december19();
							answerCheck = true;
						}
						else if(answer.equalsIgnoreCase("no")) {
							System.out.println("\n- It's okay.");
							answerCheck = true;
						}
						else
							System.out.println("\n- I don't think that's an answer, sweetheart.");
					}
					break;
				case "workout":
					break;
				case "reading":
					read.december13();
					waitASec();
					read.readingList();
					break;
				case "studying":
					break;
				case "others":
					break;
				case "quit":
					return;
				default:
					System.out.println("- Please choose (write) one of the options");
			}
		}while(true);
	}
	
	public static void waitASec() {
		try {
            Thread.sleep(1500); // 1500 milliseconds = 1.5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

}