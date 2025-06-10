public class ageCheck{
    void checkAge(int age) {
        if (age < 18) {
            System.out.println("You are not old enough to vote.");
        } else {
            System.out.println("You are old enough to vote.");
        }
    }

    public static void main(String[] args) {
        ageCheck ac = new ageCheck();
        ac.checkAge(19
        );
    }
}