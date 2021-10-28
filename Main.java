
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static public int[] U = {1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] set = setParser(input);
        isSet(set);
        inUniverse(set);
    }

    static int[] setParser(String strSet) {
        String[] strSetArr = strSet.split(" ");
        int[] userSet = new int[strSetArr.length];
        for (int i = 0; i < userSet.length; i++) {
            userSet[i] = Integer.parseInt(strSetArr[i]);
        }
        return userSet;
    }

    static void isSet(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    throw new NotSetException();
            }
        }
    }

    static void inUniverse(int[] set){
        for(int ints : set){
            if(!Arrays.toString(U).contains(String.valueOf(ints)))
                    throw new SetOutOfBoundsUniverse();
        }
    }
}


class SetOutOfBoundsUniverse extends RuntimeException {
    public SetOutOfBoundsUniverse(String msg) {
        super(msg);
    }

    public SetOutOfBoundsUniverse(Throwable cause) {
        super(cause);
    }

    public SetOutOfBoundsUniverse() {
        super("Out of bounds Universe");
    }
}

class NotSetException extends RuntimeException {
    NotSetException(String msg) {
        super(msg);
    }

    NotSetException(Throwable cause) {
        super(cause);
    }

    NotSetException() {
        super("Not a Set");
    }
}
