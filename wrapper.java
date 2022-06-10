public class wrapper {

    public static void main(String[] args) {

        int y = 92;

        cntWrap(y);

    }

    private static void cntWrap(int a) {
        Integer ob = Integer.valueOf(a);

        if (ob instanceof Integer) {
            System.out.println(ob);
        }

    }

}