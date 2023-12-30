
public class Hangout extends Entertaintment implements IDecember12, IDecember13, IDecember14, IDecember15, IDecember17, IDecember19{
	

	public Hangout() {
		super();
	}

	@Override
	public void december12() {
		System.out.println("\n------------------------------------------------------------------------");
		setEntertaintmentCounter(getEntertaintmentCounter()+1);
		if(getEntertaintmentCounter() == 2) {
			System.out.println("- Quick, spill the beans, whose secret agent are you? You've got to pass the security test to proceed. What book am I reading right now?"
					+ "\n  A. Sherlock Holmes"
					+ "\n  B. Harry Potter"
					+ "\n  C. The Great Gatsby"
					+ "\n  D. The Book Thief");
			
			System.out.printf("=> ");
			setAnswer(scan.next().toLowerCase());
			switch(getAnswer()) {
			case "a":
				System.out.println("\n- Looks like you still haven't figured me out. Did I code all that stuff for nothing? I'm crushed with sadness."
						+ "\n  Hint: Check out the Reading section!");
				return;
			case "b":
				System.out.println("\n- Nice job, you hit me right in the feels!\n");
				break;
			case "c":
				System.out.println("\n- Looks like you still haven't figured me out. Did I code all that stuff for nothing? I'm crushed with sadness."
						+ "\n  Hint: Check out the Reading section!");
				return;
			case "d":
				System.out.println("\n- Looks like you still haven't figured me out. Did I code all that stuff for nothing? I'm crushed with sadness."
						+ "\n  Hint: Check out the Reading section!");
				return;
			default:
				System.out.println("\n- Throw in a, b, c, or d like you're dropping wisdom bombs on a multiple-choice battlefield. Easy peasy, right?");
			}
		}
		
		if(getEntertaintmentCounter() >= 3)
			System.out.println("\n- Oh, it's you again! Hello. Hope you're doing well.\n");
		
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
		
	}

	@Override
	public void december13() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void december14() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void december15() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void december17() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void december19() {
		// TODO Auto-generated method stub
		
	}

}
