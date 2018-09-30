import javax.swing.JOptionPane;

public class U1L04GuessingGame {

	public static void main(String[] args) {
	
	int computerNum =  (int)(Math.random() * 100) + 1;
	int guess = 0;
	int guessNum = 0;
	
	JOptionPane.showMessageDialog(null, "This is a guessing game. Pick a number between 1 and 100.");
	 
	do {
		String answer = JOptionPane.showInputDialog("What's your guess?");
		double num = Double.parseDouble(answer);
		guess = (int)(num);
		if (guess < 1 || guess > 100) {
			JOptionPane.showMessageDialog(null, "That's not between 1 and 100. Pick another number.");
			continue;
		}
		guessNum++;
		if (computerNum - guess <= 10 && computerNum - guess != 0 && computerNum - guess >=-10){
			JOptionPane.showMessageDialog(null, "Your guess was ten points or less away.");
		}
		else if (guess < computerNum) {
			JOptionPane.showMessageDialog(null, "The guess is too low");
		}
		else if (guess >computerNum){
			JOptionPane.showMessageDialog(null, "The guess is too high.");
	}
	
	}while (computerNum != guess);
		
	JOptionPane.showMessageDialog(null, "You guessed the number! It was " + computerNum + ". You did it in " + guessNum + " guesses.");
	
	}
	
	
}
	


