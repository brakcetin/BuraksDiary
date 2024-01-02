
public class OutsideFood extends Food implements IDecember12, IDecember14, IDecember15, IDecember16, IDecember17, IDecember19{

	public OutsideFood() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void december12() {
		boolean answerCheck = false;
		
		System.out.println("\n------------------------------------------------------------------------");
		getFoodCounter();
		if(getFoodCounter() >= 2) {
			System.out.println("- Ah, déjà vu! You've asked this question before. Seems like you're curious about my food preferences. Well, there are a lot of choices, and you're right. So, I'm saying hi to you with a quote.");
			System.out.println("\t\"Life is uncertain. Eat dessert first.\"\r\n"
					+ "\t― Ernestine Ulmer\r\n");
		}
		
		System.out.println("- Do you like sushi? I like it a lot. I had sushi today (December 12) at 5:00 p.m. But I didn't like it this time, it tasted worse and they reduced the size. \r\n"
				+ "\r\n- Did I tell you that I had a cheese omelet almost every morning?");
		System.out.println("- Yes\n- No");
		while(!answerCheck) {
			System.out.printf("=> ");
			setAnswer(scan.next());
			if(getAnswer().equalsIgnoreCase("yes")) {
				System.out.println("\n- Hmm... interesting I don't remember saying it. ");
				answerCheck = true;
			}
			else if(getAnswer().equalsIgnoreCase("no")) {
				System.out.println("\n- Well, now you've got it figured out.");
				answerCheck = true;
			}
			else
				System.out.println("\n- I don't think that's an answer, sweetheart.");
		}
	}
	
	@Override
	public void december14() {
		setDinnerName("Chicken Wrap\t\t\t\t");
		setMealTime("17.30\t");
		setTasteOfFood("Good");
		System.out.println("\n* December 14\n\t"+getDinnerName()+getMealTime()+getTasteOfFood());
	}
	
	@Override
	public void december15() {
		setDinnerName("Cheese Burger\t\t\t\t");
		setMealTime("15.00\t");
		setTasteOfFood("Perfect");
		System.out.println("* December 15\n\t"+getDinnerName()+getMealTime()+getTasteOfFood());
	}

	@Override
	public void december16() {
		setDinnerName("Pita with minced meat (Kıymalı Pide)\t");
		setMealTime("18.00\t");
		setTasteOfFood("Delicious");
		System.out.println("* December 16\n\t"+getDinnerName()+getMealTime()+getTasteOfFood());
	}
	
	@Override
	public void december17() {
		setDinnerName("Chicken Burger\t\t\t\t");
		setMealTime("14.30\t");
		setTasteOfFood("Good");
		System.out.println("* December 17\n\t"+getDinnerName()+getMealTime()+getTasteOfFood());
	}
	
	@Override
	public void december19() {
		setDinnerName("Cheese and salami sandwich\t\t");
		setMealTime("16.00\t");
		setTasteOfFood("Good");
		System.out.println("* December 19\n\t"+getDinnerName()+getMealTime()+getTasteOfFood());
	}
	

}