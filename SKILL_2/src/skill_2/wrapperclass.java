package skill_2;

public class wrapperclass {
	public static void main(String[] args) {
        int num = 50;
        Integer wrappedNum = Integer.valueOf(num);
        Double wrappedDouble = Double.valueOf(12.34);
        char letter = 'A';
        Character wrappedChar = Character.valueOf(letter);

        System.out.println("Wrapped Integer: " + wrappedNum);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Wrapped Character: " + wrappedChar);

        int unwrappedNum = wrappedNum.intValue();
        System.out.println("Unwrapped Integer: " + unwrappedNum);
    }
}
