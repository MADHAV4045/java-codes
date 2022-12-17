package Exception;

public class illustration {
    public static void main(String[] args) {
        // Taking an empty string
        //String str = null;
        try {
            String str = null;
        }
        catch (NullPointerException e) {
            System.out.println("\033[1;32m"+e);
        }
        //System.out.println(str.length());
    }
}
