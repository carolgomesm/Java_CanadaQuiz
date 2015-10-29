import javax.swing.JOptionPane;
import java.util.*;

public class Test {
	
	String[] questions = {
			"What is the name of the subway West/East line in Toronto?\n(Enter a number as your answer)\n"
			+ "1. Bloor and Danforth\n"
			+ "2. Younge and University\n"
			+ "3. Bloor and Younge\n"
			+ "4. University and Bloor\n",
			"Which city in Canada you can visit the CN Tower?\n"
			+ "1. Vancouver\n"
			+ "2. Montreal\n"
			+ "3. Quebec\n"
			+ "4. Toronto\n",
			"Which province the city of Vancouver is located?\n"
			+ "1. Ontario\n"
			+ "2. Quebec\n"
			+ "3. British Columbia\n"
			+ "4. Alberta\n",
			"What is the name of the most famous Baseball Team?\n"
			+ "1. Marleys\n"
			+ "2. Blue Jays\n"
			+ "3. Raptors\n"
			+ "4. Maple Leafs"
			
					
	};
	
	int correctAnswer = 0;
	int wrongAnswer = 0;
	String message;
	float percentage;
	boolean check;
	String myAnswer;
	String confirmation;
	int questionNum;
	
	
	public void simulateQuestion(){
		
		JOptionPane.showConfirmDialog(null, "Hey! Welcome to Canada Quiz!!");
		
		confirmation = JOptionPane.showInputDialog("Are you ready to start?? \n (Yes or No)");
		
		if(confirmation.toLowerCase().equals("yes")){
			for(questionNum = 0; questionNum< questions.length; questionNum++){
				JOptionPane.showMessageDialog(null, questions[questionNum]);
				myAnswer = JOptionPane.showInputDialog(null, "Your Answer is...");
				checkAnswer();
			}
		}
		else{
			JOptionPane.showConfirmDialog(null, "So go study more about Canada and come back later!");
		}
			
	}
	
	public void checkAnswer(){
		
		if(questionNum == 0 ){
			if (myAnswer.equals("1")){
			check = true;
			JOptionPane.showConfirmDialog(null,simulateMessage());
			correctAnswer++;
			}
		
			else{
			check = false;
			JOptionPane.showConfirmDialog(null,simulateMessage());
			wrongAnswer += 1;
			}
		} 
		else if(questionNum == 1){
			if (myAnswer.equals("4")){
				check = true;
				JOptionPane.showConfirmDialog(null,simulateMessage());
				correctAnswer++;
				}
			
				else{
				check = false;
				JOptionPane.showConfirmDialog(null,simulateMessage());
				wrongAnswer += 1;
				}
		}
		else if(questionNum == 2){
			
			if (myAnswer.equals("3")){
				check = true;
				JOptionPane.showConfirmDialog(null,simulateMessage());
				correctAnswer++;
				}
				else{
				check = false;
				JOptionPane.showConfirmDialog(null,simulateMessage());
				wrongAnswer += 1;
				}
		}
		else if(questionNum == 3){
			
				if (myAnswer.equals("2")){
					check = true;
					JOptionPane.showConfirmDialog(null,simulateMessage());
					correctAnswer++;
					}
					else{
						check = false;
						JOptionPane.showConfirmDialog(null,simulateMessage());
						wrongAnswer += 1;
					}
		}
		else{
			
		}
		
		//percentage = (correctAnswer / questions.length) * 100;
		
	}
	
	public String simulateMessage(){
		
		Random response = new Random();

		if(check){
			switch(response.nextInt(4))
			{
				case 1: 
					return message = "You are smart!";
				case 2:
					return message = "You love Canada!";
				case 3:
					return message = "Here we go! Right answer!!";
				default:
					return message = "That's impresivelly correct!";			
			}
		}
		else{
			switch(response.nextInt(4)){
			case 1: 
				return message = "Baaad!";
			case 2:
				return message = "You hate Canada!";
			case 3:
				return message = "Nice try, but no...";
			default:
				return message = "Sooooo wrong!!";
			}
		}

	}
	
	public void inputAnswer(){
		simulateQuestion();
		JOptionPane.showConfirmDialog(null, "Your score is " + correctAnswer );
		JOptionPane.showConfirmDialog(null, "You made " + wrongAnswer + " mistake(s)!");
		
	}

	

}
