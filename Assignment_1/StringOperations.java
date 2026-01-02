class StringOperations {

    public static void main(String[] args) {

        String str = "  Java Programming  ";

        System.out.println("Length: " + str.length());
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Char At 2: " + str.charAt(2));
        System.out.println("Equals: " + str.equals("Java"));
        System.out.println("Compare To: " + str.compareTo("Java"));
        System.out.println("Contains: " + str.contains("Java"));
        System.out.println("Index Of: " + str.indexOf("a"));
        System.out.println("Last Index Of: " + str.lastIndexOf("a"));
        System.out.println("Starts With: " + str.startsWith("  "));
        System.out.println("Ends With: " + str.endsWith("  "));
        System.out.println("Substring: " + str.substring(2, 6));
        System.out.println("To Lowercase: " + str.toLowerCase());
        System.out.println("Trim: " + str.trim());
        System.out.println("Replace: " + str.replace("Java", "Core Java"));

        String[] parts = str.split(" ");
        System.out.println("Split Length: " + parts.length);

        String joined = String.join("-", "Java", "Is", "Easy");
        System.out.println("Join: " + joined);

        int num = 100;
        System.out.println("Value Of: " + String.valueOf(num));
    }
}
