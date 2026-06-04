package dsa.strings;

public class stringMethods {

    public static void main(String[] args) {

        String text = "elephant";

        System.out.println(text.charAt(0));
        System.out.println(text.length());
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.substring(5));
        System.out.println(text.substring(5, 7));
        System.out.println(text.replace("t", "T"));
        System.out.println(text.replaceFirst("t", "T"));
        System.out.println(text.startsWith("ele"));
        System.out.println(text.endsWith("ant"));
        System.out.println(text.indexOf("t"));
        System.out.println(text.lastIndexOf("t"));
        System.out.println(text.contains("ant"));
        System.out.println(text.equals("elephant"));
        System.out.println(text.equalsIgnoreCase("elephant"));

    }

}