import java.util.Scanner;

public class Food{
	private String breakfastName;
	private String dinnerName;
	private String mealTime;
	private String tasteOfFood;
	private String answer;
	private int foodCounter=0;
	
	Scanner scan = new Scanner(System.in);
	
	public Food() {
		super();
	}

	public String getBreakfastName() {
		return breakfastName;
	}


	public void setBreakfastName(String breakfastName) {
		this.breakfastName = breakfastName;
	}


	public String getDinnerName() {
		return dinnerName;
	}


	public void setDinnerName(String dinnerName) {
		this.dinnerName = dinnerName;
	}


	public String getMealTime() {
		return mealTime;
	}

	public void setMealTime(String mealTime) {
		this.mealTime = mealTime;
	}

	public String getTasteOfFood() {
		return tasteOfFood;
	}

	public void setTasteOfFood(String tasteOfFood) {
		this.tasteOfFood = tasteOfFood;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getFoodCounter() {
		return foodCounter++;
	}

	public void setFoodCounter(int foodCounter) {
		this.foodCounter = foodCounter;
	}
	

}