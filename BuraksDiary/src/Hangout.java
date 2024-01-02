
public class Hangout extends Entertaintment implements IDecember12, IDecember13, IDecember14, IDecember15, IDecember16, IDecember17, IDecember19{
	

	public Hangout() {
		super();
	}
	
	@Override
	public void december12() {
		System.out.println("\n------------------------------------------------------------------------");
		setEntertaintmentCounter(getEntertaintmentCounter()+1);
		
		//repeated visits
		if(getEntertaintmentCounter() == 2) {
			System.out.println("- Quick, spill the beans, whose secret agent are you? You've got to pass the security test to proceed. What book am I reading right now?"
					+ "\n  A. Sherlock Holmes"
					+ "\n  B. Harry Potter"
					+ "\n  C. The Great Gatsby"
					+ "\n  D. The Book Thief");
			
			setAnswerCheck(false);
			while(!isAnswerCheck()) {
				System.out.printf("=> ");
				setAnswer(scan.next().toLowerCase());
				switch(getAnswer()) {
				case "a":
					System.out.println("\n- Looks like you still haven't figured me out. Did I code all that stuff for nothing? I'm crushed with sadness."
							+ "\n  Hint: Check out the Reading section!");
					setAnswerCheck(true);
					return;
				case "b":
					System.out.println("\n- Nice job, you hit me right in the feels! The door is opening!\n");
					waitASec();
					setAnswerCheck(true);
					break;
				case "c":
					System.out.println("\n- Looks like you still haven't figured me out. Did I code all that stuff for nothing? I'm crushed with sadness."
							+ "\n  Hint: Check out the Reading section!");
					setAnswerCheck(true);
					return;
				case "d":
					System.out.println("\n- Looks like you still haven't figured me out. Did I code all that stuff for nothing? I'm crushed with sadness."
							+ "\n  Hint: Check out the Reading section!");
					setAnswerCheck(true);
					return;
				default:
					System.out.println("\n- Throw in a, b, c, or d like you're dropping wisdom bombs on a multiple-choice battlefield. Easy peasy, right?");
				}
			}
		}
		
		//repeated visits
		if(getEntertaintmentCounter() >= 3)
			System.out.println("- Oh, it's you again! Hello. Hope you're doing well.\n");
		
		System.out.println("- On December 12, I attended the National Conference on Productive Artificial Intelligence Applications (Üretken Yapay Zeka Uygulamaları Ulusal Konferansı) at 09.30. "
				+ "\n  After having lunch, I attended the 2nd session of the conference. "
				+ "\n  At the end of the 2nd session, I had the opportunity to talk to Dr. Süleyman Özarslan, the VP of PICUS, and asked him what I was curious about. "
				+ "\n  Then I couldn't attend the 3rd session and met my girlfriend at 16.30. We had dinner together at IF at 17.00, sat in the café at 19.00 and walked around Tunali for a while at 20.00. "
				+ "\n  I returned home around 21.30.");
		System.out.println("\n- Still looking for an internship, no luck so far. How about you?\r\n"
				+ "\r\n"
				+ "1. Yeah, found one, loser!\r\n"
				+ "2. Nope, fate's not on my side, buddy.\r\n"
				+ "3. I'm the teacher :)");
		setAnswerCheck(false);
		while(!isAnswerCheck()) {
			try {
				System.out.printf("=> ");
				setAnswer(scan.next());
				switch(getAnswer()) {
				case "1":
					System.out.println("\n- Congratulations! I'd be really happy if you could help me find one too. Don't hesitate to get in touch."
							+ "\n  I might seem a bit distant, but I'm really friendly. Don't worry, I won't bite.");
					setAnswerCheck(true);
					break;
				case "2":
					System.out.println("\n- We're destiny buddies, my friend. Wishing both of us find a great internship soon.");
					setAnswerCheck(true);
					break;
				case "3":
					System.out.println("\n- Well, hello there, teacher! So, you're here to check my homework. Hope you enjoyed it. "
							+ "\n  I really tried to create something nice. Enjoy! Happy New Year!");
					setAnswerCheck(true);
					break;
				default:
					System.out.println("\n- Hey champ, can you choose a number from 1 , 2 or 3?");
				}
				
			}catch(NumberFormatException e) {
				System.out.println("\n- Hey champ, can you choose a number from 1 , 2 or 3?");
			}
			
		}
		waitASec();
		december13();
		waitASec();
		december14();
		waitASec();
		december15();
		waitASec();
		december16();
		waitASec();
		december17();
		waitASec();
		december19();
	}

	@Override
	public void december13() {
		System.out.println("\n- On December 13, In the morning, I opened the day with a cheese omelet again. I attended the OOP Lab class at 9.30 a.m. "
				+ "\n  I met my girlfriend and went to the library and studied Data Structures. After the library, we sat in Caribou cafe. "
				+ "\n  After drinking our tea, we walked around Kızılay for a while and went back home.");
		
		System.out.println("\n- Honestly, are you bored hearing about what I've been doing?\n- Yes\n- No");
		setAnswerCheck(false);
		while(!isAnswerCheck()) {
			System.out.printf("=> ");
			setAnswer(scan.next());
			switch(getAnswer().toLowerCase()) {
			case "yes":
				System.out.println("\n- How rude! Alright then, let's ask you a question.");
				System.out.println("\n- What is the largest Spanish-speaking city in the world?"
						+ "\n  A. Mexico City"
						+ "\n  B. Barcelona"
						+ "\n  C. Granada"
						+ "\n  D. São Paulo");
				
				setAnswerCheck(false);
				while(!isAnswerCheck()) {
					System.out.printf("=> ");
					setAnswer(scan.next().toLowerCase());
					switch(getAnswer()) {
					case "a":
						System.out.println("\n- Bravo! Your brain's like a trivia ninja – sharp, stealthy, and ready to impress.");
						setAnswerCheck(true);
						break;
					case "b":
						System.out.println("\n- Answer is A.\n  Every day, a fresh nugget of wisdom! "
								+ "\n\n- I know you're bored. Don't worry, we're almost there. Just be a little more patient.;)");
						setAnswerCheck(true);
						break;
					case "c":
						System.out.println("\n- Answer is A.\n  Every day, a fresh nugget of wisdom! "
								+ "\n\n- I know you're bored. Don't worry, we're almost there. Just be a little more patient.;)");
						setAnswerCheck(true);
						break;
					case "d":
						System.out.println("\n- Answer is A.\n  Every day, a fresh nugget of wisdom! "
								+ "\n\n- I know you're bored. Don't worry, we're almost there. Just be a little more patient.;)");
						setAnswerCheck(true);
						break;
					default:
						System.out.println("\n- Throw in a, b, c, or d like you're dropping wisdom bombs on a multiple-choice battlefield. Easy peasy, right?");
					}
				}
				break;
			case "no":
				System.out.println("\n-  You know what? You're awesome!");
				setAnswerCheck(true);
				break;
			default:
				System.out.println("\n- Buddy, it's a simple \"yes\" or \"no\" situation. Keep it simple!");
			}
		}
		
	}
	
	@Override
	public void december14() {
		System.out.println("\n- On December 14, I went to Differential Equations class at 13.30 in the morning. After class, I met my girlfriend at Panora Shopping Center at 15.30. "
				+ "\n  We had dinner together and I had a chicken wrap. Then we went to the last movie of The Hunger Games. I thought the movie was pretty good. "
				+ "\n  I had read the book of the whole series. I recommend it. I went back home after the movie.");
	}
	
	@Override
	public void december15() {
		System.out.println("\n- On December 15, I went to the Electrical and Electronic Circuits class at 9:45 a.m. I met my girlfriend after class. "
				+ "\n  We celebrated my birthday (normally December 18th, academic life pushed us to these conditions). Then we had a cheeseburger and it tasted very good. "
				+ "\n  I bought my presents and then we walked around the mall and went back home.");
	}
	
	@Override
	public void december16() {
		System.out.println("\n- On December 16, Had my must-have morning ritual: cheesy omelet! After boxing I went to give private math tutoring to my 11th grade student. "
				+ "\n  After class I went to my grandparents' house and took a shower there. In the evening we had pita bread with minced meat and "
				+ "\n  I think that was the most relaxing thing of the day. I was very tired.");
	}
	
	@Override
	public void december17() {
		System.out.println("\n- On December 17, At 11.00 in the morning I went boxing again for 2 hours. After boxing, I met my girlfriend at the library and studied Data Structures. "
				+ "\n  I had a chicken burger before class. After working until the evening, I came home around 19.30.");
	}
	
	@Override
	public void december19() {
		System.out.println("\n- The day before (December 18) was my birthday and I was at school from morning until 8 p.m. It was not a perfect day. "
				+ "\n  Today (December 19) I met my girlfriend in the library after my differential equations class. First we had a cheese and "
				+ "\n  salami sandwich and then we studied until 20.00 and went to Kızılay. After walking around a bit, we went back home.");
	}

	public static void waitASec() {
		try {
            Thread.sleep(1500); // 1500 milliseconds = 1.5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
