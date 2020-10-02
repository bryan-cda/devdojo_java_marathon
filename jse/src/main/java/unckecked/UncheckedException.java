package unckecked;

public class UncheckedException {
    public static void main(String[] args, int i) {
        System.out.println(args[i]);
    }
}

class IndexOutOfBoundExceptionTest{
    static String[] words = {"word","wide","web"};

    public static void main(String[] args) {
     UncheckedException.main(words, 3);
    }
}