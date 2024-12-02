package application;

public class NewTypeFor {

    public static void main(String[] arg) {

        String[] vect = new String[]{"João " + "\nMaria " + "\nEduarda "};

        for (String obj : vect) {  // obj do tipo string contido em vect
            System.out.println(obj);
        }
    }
}