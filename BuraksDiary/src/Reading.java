
public class Reading extends Entertaintment implements IDecember13, IDecember17, IDecember18 {
	
	@Override
	public void december13() {
		setActivityName("Harry Potter and the Philosopher's Stone");
		setDuration("1 hour");
		setTime("00.00");
		System.out.println("\n------------------------------------------------------------------------");
		setEntertaintmentCounter(getEntertaintmentCounter()+1);
		
		//repeated visits
		if(getEntertaintmentCounter() == 2) {
			System.out.println("- Hey, it's you again! our interest in books has really impressed me. I've got a surprise for you on your next visit!\n");
		}
		
		//repeated visits
		if(getEntertaintmentCounter() == 3) {
			System.out.println("-  So, you couldn't resist the curiosity and rushed here to find out what my surprise is. You're quite the curious one!"
					+ "\n  Get ready for a brain teaser! I've crafted a question so nice, even your brain cells will high-five each other. Easy peasy, though!"
					+ "\n\n  Why did the tomato turn red?\r\n"
					+ "\r\n"
					+ "  A) It saw the salad dressing undressing.\r\n"
					+ "  B) It heard the vegetable gossip.\r\n"
					+ "  C) It wanted to be ketchup on the latest news.\r\n"
					+ "  D) It realized it was in a jam.");
			
			setAnswerCheck(false);
			while(!isAnswerCheck()) {
				System.out.printf("=> ");
				setAnswer(scan.next().toLowerCase());
				
				switch(getAnswer()) {
				case "a":
					System.out.println("\n- Nope, the answer is C) It wanted to be ketchup on the latest news.\n");
					setAnswerCheck(true);
					break;
				case "b":
					System.out.println("\n- Nope, the answer is C) It wanted to be ketchup on the latest news.\n");
					setAnswerCheck(true);
					break;
				case "c":
					System.out.println("\n- Congratulations, you got it right! Well done to you.\n");
					setAnswerCheck(true);
					break;
				case "d":
					System.out.println("\n- Nope, the answer is C) It wanted to be ketchup on the latest news.\n");
					setAnswerCheck(true);
					break;
				default:
					System.out.println("\n- Throw in a, b, c, or d like you're dropping wisdom bombs on a multiple-choice battlefield. Easy peasy, right?");
				}
			}
		}
		
		if(getEntertaintmentCounter() >=4) {
			System.out.println("- Looks like you're back; hey there, sweetie!\n");
		}
		
		System.out.printf("- On the night of December 13, at %s, I read \"%s\" in English for %s. "
				+ "\n  I'm trying to read books I know in their original language to improve my English. "
				+ "\n  I can say it's going well, but finding time is a bit challenging these days."
				+ "\n\n- I love reading books. Do you like reading books too?\n- Yes\n- No\n", getTime(), getActivityName(), getDuration());
		setAnswerCheck(false);
		while(!isAnswerCheck()) {
			System.out.printf("=> ");
			setAnswer(scan.next().toLowerCase());
			switch(getAnswer()) {
			case "yes":
				System.out.println("\n- I'm glad to hear that. What kind of books do you want to recommend? \n1. Sci-fi\n2. Romance\n3. Philosophy\n4. Adventure\n5. Other");
				while(!isAnswerCheck()) {
					System.out.printf("=> ");
					setAnswer(scan.next());
					try {
						switch(getAnswer()) {
						case "1":
							System.out.println("\n- I love science fiction books. It seems we have similar tastes. Have you read Isaac Asimov's Foundation series?"
									+ "\n  I read \"Foundation (1951)\" and was planning to read \"End of Eternity (1955)\" to better understand Asimov's universe, but the English was a bit heavy"
									+ "\n  After finishing Harry Potter, my next goal is to read that one.");
							System.out.println("\n- They've arranged the books in order to understand Isaac Asimov's created universe based on readers' opinions. "
									+ "\n  Wanna check out the list?\n- Yes\n- No");
							
							while(!isAnswerCheck()) {
								System.out.printf("=> ");
								setAnswer(scan.next().toLowerCase());
								switch(getAnswer()) {
								case "yes":
									System.out.println("\n- Here's the list:\r\n"
											+ "\r\n"
											+ "  1- End Of Eternity\r\n"
											+ "\r\n"
											+ "    (End of Eternity, singular book)\r\n"
											+ "\r\n"
											+ " Foundation Series:\r\n"
											+ "\r\n"
											+ "  2- Foundation\r\n"
											+ "\r\n"
											+ "  3- Foundation and Empire\r\n"
											+ "\r\n"
											+ "  4- Second Foundation\r\n"
											+ "\r\n"
											+ "  5- Foundation’s Edge (the first big shock)\r\n"
											+ "\r\n"
											+ " Robot Series:\r\n"
											+ "\r\n"
											+ "  6- Caves of Steel\r\n"
											+ "\r\n"
											+ "  7- The Naked Sun\r\n"
											+ "\r\n"
											+ "  8- The Robots of Dawn (the second big shock)\r\n"
											+ "\r\n"
											+ "  9- Robots and Empire\r\n"
											+ "\r\n"
											+ " Back to Foundation Series:\r\n"
											+ "\r\n"
											+ " 10- Prelude to Foundation (the final shock, and now other books might seem empty and meaningless to you)\r\n"
											+ "\r\n"
											+ " 11- Forward to Foundation\r\n"
											+ "\r\n"
											+ " 12- Foundation and Earth\r\n"
											+ "\r\n"
											+ " After reading all these, there are some Short Robot Stories that are not crucial to the series but are set in the same realities:\r\n"
											+ "\r\n"
											+ " *  The Complete Robot\r\n"
											+ " *  Robot Dreams\r\n"
											+ " *  Robot Visions\r\n"
											+ " *  Gold: The Final Science Fiction Collection\r\n"
											+ "\r\n"
											+ " Empire Novels:\r\n"
											+ "\r\n"
											+ " *  The Stars, Like Dust\r\n"
											+ " *  The Currents of Space\r\n"
											+ " *  Pebble in the Sky"
											+ "\n\n  ~This entry was mentioned in the Mycogen blog by Don Quijote on June 17, 2005.");
									setAnswerCheck(true);
									break;
								case "no":
									System.out.println("\n- So, it looks like it didn't really interest you that much.");
									setAnswerCheck(true);
									break;
								default:
									System.out.println("\n- Buddy, it's a simple \"yes\" or \"no\" situation. Keep it simple!");
								}
							}
							break;
						case "2":
							System.out.println("\n- Romantic books are lovely. If the storyline is good, it pulls you in. "
									+ "\n  Can't say I've read too many romantic books, but I recommend \"The Fault in Our Stars\" by John Green. "
									+ "\n  I've read the book and watched the movie, and it really impressed me.");
							setAnswerCheck(true);
							break;
						case "3":
							System.out.println("\n- Look at the little philosopher over here. Just kidding, you're not offended, are you? "
									+ "\n  I'm not big on philosophy books, but once I start reading, it's hard to stop. Mark Twain's \"What is Man?\" changed my perspective; I recommend it.");
							setAnswerCheck(true);
							break;
						case "4":
							System.out.println("\n- Look, when you mention adventure, things get exciting. There are so many books out there. "
									+ "\n  If it's a genre you love, I don't think you'll ever get bored. You absolutely must read the Harry Potter series if you haven't already.");
							setAnswerCheck(true);
							break;
						case "5":
							System.out.println("\n- I get it, there are loads of options—crime, horror, science, psychology... "
									+ "\n  Who's ever been harmed by reading? Keep going, who's gonna stop you?");
							System.out.println("\n\t\"Wisdom flows through the pages of books; in each word, a drop of insight, in every story, a reservoir of knowledge. "
									+ "\n\t Dive into the vast sea of literature, and you'll emerge richer, wiser, and forever changed.\"");
							setAnswerCheck(true);
							break;
						default:
							System.out.println("\n- Hey champ, can you choose a number from 1, 2, 3, 4 or 5?");
						}
					}catch (NumberFormatException e) {
			            System.out.println("\n- Hey champ, can you choose a number from 1, 2, 3, 4 or 5?");
			        }
				}
				break;
			case "no":
				System.out.println("\n- If books aren't your thing, what's your story doing in the reading room? Let me guide you to the chit-chat section.");
				setAnswerCheck(true);
				break;
			default:
				System.out.println("\n- Buddy, it's a simple \"yes\" or \"no\" situation. Keep it simple!");
			}
		}
		
	}
	
	public void readingList() {
		System.out.println("\n- Do you wonder how much I read the other days?\n- Yes\n- No");
		
		setAnswerCheck(false);
		while(!isAnswerCheck()) {
			System.out.printf("=> ");
			setAnswer(scan.next().toLowerCase());
			
			switch(getAnswer()) {
			case "yes":
				System.out.println("\n- Here is the list:\n");
				december17();
				december18();
				setAnswerCheck(true);
				break;
			case "no":
				System.out.println("\n- It's okay.");
				setAnswerCheck(true);
				break;
			default:
				System.out.println("\n- Buddy, it's a simple \"yes\" or \"no\" situation. Keep it simple!");
			}
		}
	}
	
	@Override
	public void december17() {
		setActivityName("Harry Potter and the Philosopher's Stone (English version)");
		setDuration("1 hour");
		setTime("23.30");		
		System.out.println("* December 17\n"
				+ "\t" + getActivityName() + "\t" + getDuration() + "\tat " + getTime());
	}

	@Override
	public void december18() {
		setActivityName("Harry Potter and the Philosopher's Stone (English version)");
		setDuration("1 hour");
		setTime("01.00");
		System.out.println("* December 18\n"
				+ "\t" + getActivityName() + "\t" + getDuration() + "\tat " + getTime());
	}
}
