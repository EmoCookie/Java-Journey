
public class StringMethods {
    public static void main(String[] args) {

        String name = "Password";
        // String name1 = " Bro Code ";

        // int length = name.length();
        // char letter = name.charAt(0);
        // int index = name.indexOf(' ');
        // int lastIndex = name.lastIndexOf('o');

        // String upperName = name.toUpperCase();
        // String lowerName = name.toLowerCase();
        // String trimName = name1.trim();
        // String replaceName = name.replace("o", "a");

        // System.out.println(length);
        // System.out.println(letter);
        // System.out.println(index);
        // System.out.println(lastIndex);
        // System.out.println(upperName);
        // System.out.println(lowerName);
        // System.out.println(trimName);
        // System.out.println(replaceName);
        // System.out.println(name.isEmpty());

        // if (name.isEmpty()) {
        // System.out.println("Your name is empty.");
        // } else {
        // System.out.println("Your name is not empty.");
        // }

        // if (name.contains("")) {
        // System.out.println("Your name contains a space.");

        // } else {
        // System.out.println("Your name doesn't contain any space.");
        // }

        if (name.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be password.");
        } else {
            System.out.println("Hello " + name);
        }
    }
}
