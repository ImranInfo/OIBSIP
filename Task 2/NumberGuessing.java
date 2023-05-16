import javax.swing.JOptionPane;

public class NumberGuessing {
  public static void main(String[] args) {

    int target = (int) (Math.random() * 100) + 1; 
    int tries = 0;

    while (tries < 8) {
      tries++;
      String input = JOptionPane.showInputDialog("Enter your guessing number (" + tries + "/8):");

      int number = Integer.parseInt(input);
      
      if (number == target) {
        JOptionPane.showMessageDialog(null, "Congratulations! You guessed in " + tries + " tries.");
        return;
      } else if (number > target) {
        JOptionPane.showMessageDialog(null, "Your guessed number is high! Try again.");
      } else {
        JOptionPane.showMessageDialog(null, "Your guessed number is low! Try again.");
      }
    }
    JOptionPane.showMessageDialog(null, "Sorry, you couldn't guess the number. The number was " + target + ".");
  }
}

