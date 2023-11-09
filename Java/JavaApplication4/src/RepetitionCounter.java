
import javax.swing.JOptionPane;

    public class RepetitionCounter {
     public static void main(String[] args) {
        int counter = 0;
        while (true) {
            String answer = JOptionPane.showInputDialog(null, "Enter your answer:");
            if (answer == null) {
                break;
            }
            counter++;
            JOptionPane.showMessageDialog(null, "Your answer is: " + answer + "\nRepetitions: " + counter);
        }
    }
}