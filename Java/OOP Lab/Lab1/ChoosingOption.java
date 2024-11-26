package lab1;
import javax.swing.JOptionPane;

class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "You've choosen: " + (option==JOptionPane.YES_OPTION?"YES": "NO"));
        System.exit(0);
    }
}