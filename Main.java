import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String mageName = JOptionPane.showInputDialog("Enter Mage’s name:");
        String warriorName = JOptionPane.showInputDialog("Enter Warrior’s name:");

        GameCharacter mage = new Mage(mageName, 100);
        GameCharacter warrior = new Warrior(warriorName, 100);
        GameCharacter current = mage;
        GameCharacter opponent = warrior;
        while (mage.isAlive() && warrior.isAlive()) {

            String choice = JOptionPane.showInputDialog(
                    current.name + "'s turn!\nChoose a move:\n1. Basic Attack\n2. Special Move\n3. Secret Power");
            int damage = 0;
            String moveName = "";
            switch (choice) {
                case "1":
                    damage = current.basicAttack(opponent);
                    moveName = current instanceof Mage ? "Magic Missile" : "Lightning Slash";
                    break;
                case "2":
                    damage = current.specialMove(opponent);
                    moveName = current instanceof Mage ? "Lightning Storm" : "Divine Judgement";
                    break;
                case "3":
                    damage = current.secretPower(opponent);
                    moveName = current instanceof Mage ? "Meteor Fall" : "Heaven's Ruin";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice! You missed your turn.");
                    continue;
            }

            JOptionPane.showMessageDialog(null,
                    current.name + " used " + moveName + " and dealt (" + damage + " damage)\n\n"
                            + mage.getStatus() + "\n" + warrior.getStatus());

            if (!opponent.isAlive()) {
                JOptionPane.showMessageDialog(null, "🎉 " + current.name + " wins!!!");
                break;
            }

            GameCharacter temp = current;
            current = opponent;
            opponent = temp;
        }
    }
}
