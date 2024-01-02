
public class Game extends Entertaintment implements IDecember17{
	

	public Game() {
		super();
	}

	@Override
	public void december17() {
		setActivityName("Fifa");
		setDuration("1 hour");
		setTime("21.30");
		System.out.println("\n------------------------------------------------------------------------");
		setEntertaintmentCounter(getEntertaintmentCounter()+1);
		//repeated visits
		if(getEntertaintmentCounter() == 2 || getEntertaintmentCounter() >=4) {
			System.out.println("\n- Ah, déjà vu! You've asked this question before. Enough with the game talk. Tell me, when was the last time you read a book?");
			System.out.println("\n1. 1 day before\n2. 2-3 days before\n3. 1 week before\n4. More than a month");
			
			setAnswerCheck(false);
			while(!isAnswerCheck()) {
				System.out.printf("=> ");
				setAnswer(scan.next());
				
				try {
					switch(getAnswer()) {
					case "1":
						System.out.println("\n- Nice, you must be a regular bookworm. Lately, I've been struggling to read consistently.");
						setAnswerCheck(true);
						break;
					case "2":
						System.out.println("\n- You're one of us. Not bad at all. Keep reading regularly.");
						setAnswerCheck(true);
						break;
					case "3":
						System.out.println("\n- Urgent Reminder: You've forgotten the joy of reading! Your neglected book is sitting on the shelf, feeling a bit sad, waiting for you to read it.");
						setAnswerCheck(true);
						break;
					case "4":
						System.out.println("\n- Hey! Wake up! I've got this figured out. Before you know it, you'll either have read one book a year or none at all. "
								+ "\n  Do you want to be just average, or do you want to be a bit different from the rest?");
						setAnswerCheck(true);
						break;
					default:
						System.out.println("\n- Hey champ, can you choose a number from 1, 2, 3, or 4?");	
					}
					
				}catch (NumberFormatException e) {
		            System.out.println("\n- Hey champ, can you choose a number from 1, 2, 3, or 4?");
		        }
			}
			
		}
		
		//repeated visits
		if(getEntertaintmentCounter() == 3) {
			System.out.println("\n- Are you still here? Come on, let's go outside. Look, there are plenty of options to get to know me better.");
			return;
		}
		System.out.printf("\n- I have not played games for a long time. I only played %s for %s at %s on my phone on December 17th and sometimes I play chess. "
				+ "\n  However, if you ask me what is my favourite game in general, my answer is definitely Europa Universalis IV. It is a perfect starategy game. "
				+ "\n  What kind of games do you play?"
				+ "\n1. Strategy\n2. FPS\n3. Survival\n4. Others\n", getActivityName(), getDuration(), getTime());

		setAnswerCheck(false);
		while(!isAnswerCheck()) {
			System.out.printf("=> ");
			setAnswer(scan.next());
			
			try {
				switch(getAnswer()) {
				case "1":
					System.out.println("\n- I'm crazy about strategy games. I've played a bunch of them, especially love the ones by Paradox Interactive. My top pick is Europa Universalis IV. "
							+ "\n  I played Europa Universalis III for a long time too. I highly recommend Europa Universalis IV to you.");
					setAnswerCheck(true);
					break;
				case "2":
					System.out.println("\n- I never had much interest in FPS games for some reason. Valorant and CS:GO are some of the most popular ones. "
							+ "\n  I also notice that The Finals is popular lately. If you chose this option, considering that a large percentage of gamers are into FPS games, \r\n"
							+ "you probably know more about it than I do.");
					setAnswerCheck(true);
					break;
				case "3":
					System.out.println("\n- There's a never-ending list of survival games, and of course, there's the famous Minecraft that everyone knows. I used to play it a lot back in the day; Sometimes it can be strangely comforting. "
							+ "\n  Besides that, some survival games I'd recommend are ARK, Terraria, RimWorld, Unturned, Project Zomboid, Don't Starve, and the list goes on.");
					setAnswerCheck(true);
					break;
				case "4":
					System.out.println("\n- No surprises there; the gaming world is huge, with arcade, puzzle, simulation games, and more. "
							+ "\n  The days when I had plenty of time for gaming are long gone. Ahh, we've grown old.");
					setAnswerCheck(true);
					break;
				default:
					System.out.println("\n- Hey champ, can you choose a number from 1, 2, 3, or 4?");	
				}
				
			}catch (NumberFormatException e) {
	            System.out.println("\n- Hey champ, can you choose a number from 1, 2, 3, or 4?");
	        }
		}
	}

}
