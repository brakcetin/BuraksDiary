
public class HomemadeFood extends Food implements IDecember13, IDecember16, IDecember17, IDecember18{

	public HomemadeFood() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void december13() {
		boolean answerCheck = false;
		System.out.println("\n- I had chickpea rice and tarhana soup today (December 13). What did you eat?");
		System.out.println("1. Soup\n2. Vegetable Food\n3. Meat Food\n4. Dessert");
		while(!answerCheck) {
			System.out.printf("=> ");
			setAnswer(scan.next());
			try {
				if(getAnswer().equalsIgnoreCase("1")) {
					System.out.println("\n- I love soup, especially lentil soup. Here is the recipe: ");
					System.out.println("- Pour vegetable oil into the pot for red lentil soup and sauté the finely chopped onions until they turn slightly pink.\r\n"
							+ "Then, add flour and continue sautéing over low heat.\r\n"
							+ "If using tomato paste, add it, and after sautéing, add diced carrots and well-rinsed lentils.\r\n"
							+ "Add water, mix well, and cover the pot. Let the soup simmer over medium heat until it boils, then, once boiling, stir occasionally and simmer over low heat until the lentils and carrots soften.\r\n"
							+ "After the soup is cooked, blend it well with a hand blender. If you don't have a blender, you can also use a sieve.\r\n"
							+ "Add black pepper, salt, and optionally cumin, and stir. Cook for an additional 5 minutes, then remove from the heat.\r\n"
							+ "If the consistency seems too thick, add some water and bring it to a boil.\r\n"
							+ "Meanwhile, take two tablespoons of butter in a small pan, heat it, add a teaspoon of red pepper flakes, and remove from the heat.\r\n"
							+ "After transferring the lentil soup to serving bowls, drizzle the red pepper sauce over it and serve with a slice of lemon.");
					answerCheck = true;
				}
				else if(getAnswer().equalsIgnoreCase("2")) {
					System.out.println("\n- I'm not a picky eater. A lot of people don't like veggies. What did you eat?\n1. Spinach\n2. Leeks\n3. Celery\n4. Something else");
					while(!answerCheck) {
						System.out.printf("=> ");
						setAnswer(scan.next());
						if(getAnswer().equalsIgnoreCase("1")) {
							System.out.println("\n- I love spinach and I think chard is very similar to spinach. I think they are both very good, especially with yogurt. "
									+ "\nBut I have heard that when yogurt and spinach are eaten together, it prevents the intake of vitamin D in spinach.");
							answerCheck = true;
						}
						else if(getAnswer().equalsIgnoreCase("2")) {
								System.out.println("\n- I also love leeks, although not as much as spinach.");
								answerCheck = true;
						}
						else if(getAnswer().equalsIgnoreCase("3")) {
							System.out.println("\n- Potato and celery dish is a delightful duo. If you're into veggies, I highly recommend it.");
							answerCheck = true;
						}
						else if(getAnswer().equalsIgnoreCase("4")) {
							System.out.println("\n- I'm curious about what else you ate; I can't think of anything. I hope it's tasty. Bon appétit!");
							answerCheck = true;
						}
						else
							System.out.println("\n- Hey champ, can you choose a number from 1, 2, 3, or 4?");
					}
				}
				
				else if(getAnswer().equalsIgnoreCase("3")) {
					System.out.println("\n- Who doesn't love meat dishes (shh, don't let the vegetarians and vegans hear)? So, What did you eat?\n1. Chicken dish\n2. Kebab\n3. Meatballs\n4. Something else");
					while(!answerCheck) {
						System.out.printf("=> ");
						setAnswer(scan.next());
						if(getAnswer().equalsIgnoreCase("1")) {
							System.out.println("\n- Almost everything with chicken is really good — chicken over rice, chicken wraps, grilled chicken, schnitzel, you name it. What's your favorite? "
									+ "My favorite is chicken over rice. Here, have the recipe!");
							System.out.println("Melt butter and vegetable oil in a pot. Washed chicken drumsticks are seared on both sides. Add hot water, salt, and whole black peppercorns, and let it come to a boil. Cook over medium heat until softened.\r\n"
									+ "\r\n"
									+ "Rinse the rice and soak it in lukewarm water. Add a teaspoon of salt with the tip of a teaspoon. Let it sit like this for 30 minutes. Take butter and vegetable oil into a suitable pot and melt.\r\n"
									+ "\r\n"
									+ "Drained and washed rice is added to the pot and sautéed over low heat for 4-5 minutes. This way, it will be fluffy. Strain the chicken broth and pour it over the rice.\r\n"
									+ "\r\n"
									+ "Add salt and let it come to a boil. When it boils, cover it and cook over low heat until the water is absorbed. (10-15 minutes) After that, do not open the lid and let it steep. Gently stir before serving.\r\n"
									+ "\r\n"
									+ "The softened chicken drumsticks are separated into large pieces. Add some vegetable oil to a pan. Transfer the chicken pieces. Sprinkle with spices. Fry by turning them. Serve hot on top of the pilaf. Enjoy your meal!");
							answerCheck = true;
						}
						else if(getAnswer().equalsIgnoreCase("2")) {
								System.out.println("\n- It's been a while since I had kebab. I'm craving for it, are you happy now?");
								answerCheck = true;
						}
						else if(getAnswer().equalsIgnoreCase("3")) {
							System.out.println("\n- I really like meatballs, especially when they're paired with oven-baked potatoes—it's a perfect combo. Everyone talks about how good the meatballs and potatoes are at IKEA."
									+ "My girlfriend couldn't believe it when I told her. Still haven't tried them, though.");
							answerCheck = true;
						}
						else if(getAnswer().equalsIgnoreCase("4")) {
							System.out.println("\n- If you had a meaty dish, it must have been yummy. There are so many options... What did you eat, hmm?");
							answerCheck = true;
						}
						else
							System.out.println("\n- Hey champ, can you choose a number from 1, 2, 3, or 4?");
					}
				}
				
				else if(getAnswer().equalsIgnoreCase("4")) {
					System.out.println("\n- Not all sweets are equally fantastic. Some are just perfect. Personally, I can't eat too many super sugary desserts, but I really love desserts with milk. Pick a side?\n1. Sweets with syrup\n2. Milky desserts");
					while(!answerCheck) {
						System.out.printf("=> ");
						setAnswer(scan.next());
						if(getAnswer().equalsIgnoreCase("1")) {
							System.out.println("\n- Welcome to the team of desserts with syrup. Just be cautious not to cause a sweet emergency, but I suggest trying şöbiyet dessert.");
							answerCheck = true;
						}
						else if(getAnswer().equalsIgnoreCase("2")) {
								System.out.println("\n- Welcome to the team of milky desserts. My advice for you is to definitely try trileçe dessert. Not everyone loves it, but I can finish a whole tray.");
								answerCheck = true;
						}
						else
							System.out.println("\n- Hey champ, can you choose a number from 1, 2, 3, or 4?");
						System.out.println("\n- If you expect me to share a dessert recipe with you, you're mistaken. \nI attempted making American cookies once, didn't quite succeed, but I assure you, the next batch of cookies will be perfect.");
					}
				}
				
				else
					System.out.println("\n- Hey champ, can you choose a number from 1, 2, 3, or 4?");
			}catch (NumberFormatException e) {
	            System.out.println("\n- Hey champ, can you choose a number from 1, 2, 3, or 4?");
	        }
		}
	}

	@Override
	public void december16() {
		setBreakfastName("Cheese omelette\t\t\t\t");
		setMealTime("09.30\t");
		setTasteOfFood("Normal");
		System.out.println("* December 16\n\t"+getBreakfastName()+getMealTime()+getTasteOfFood());
	}

	@Override
	public void december17() {
		setDinnerName("Spinach and tarhana soup\t\t");
		setMealTime("19.30\t");
		setTasteOfFood("Good");
		System.out.println("* December 17\n\t"+getDinnerName()+getMealTime()+getTasteOfFood());
	}
	
	@Override
	public void december18() {
		setDinnerName("Rice and tarhana soup\t\t\t");
		setMealTime("21.00\t");
		setTasteOfFood("Good");
		System.out.println("* December 18\n\t"+getDinnerName()+getMealTime()+getTasteOfFood());
	}

}