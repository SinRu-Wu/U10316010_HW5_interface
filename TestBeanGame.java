import java.util.Scanner;

public class TestBeanGame{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of balls to drops :");
		int numberOfBalls = input.nextInt();
		System.out.println("Enter the number of slots in the bean machine :");
		int numberOfSlots = input.nextInt();
		
		int [] slots = new int[numberOfSlots];
		
		BeanGame user  = new BeanGame();
		user.ball(balls, slots);
		user.display(balls, slots);
	}
	
}

class BeanGame{
	
	int balls;
	int slots;
	int [] slots = new int[slots];
	
	BeanGame(){
		
	}
	
	void takeTurns(int balls, int slots){
		
		for(int i = 0; i <= slots; i++){
			
			int rand = (int)(Math.random() * 100) + 1;
			if(rand % 2 == 1){
				place++;
				System.out.print("R");
			}
			else
				System.out.print("L");
		}
	}
	
	void ball(int balls, int slots){
		
		for(int i = 0; i < balls; i++){
			
			method(balls, slots);
		}
	}
	
	void display(int balls, int slots){
		
		for(int i = 0; i < balls; i++){
			
			System.out.println(array[i]);
			
		}
		
		
	}
	
}