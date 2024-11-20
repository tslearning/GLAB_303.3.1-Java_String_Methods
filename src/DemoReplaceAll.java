public class DemoReplaceAll {
    public static void main(String[] args) {
        //14.	Java String replaceAll()
        //
        //●	The replaceAll() method replaces each substring that matches the
        // regex of the string with the specified text.
        //●	The syntax of the replaceAll() method is:
        //
        //string.replaceAll(String regex, String replacement)
        //●	regex - a regex (can be a typical string) that is to be replaced
        //●	replacement - matching substrings are replaced with this string
        String str1 = "Java123is456fun";

        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(str1.replaceAll(regex, " "));

    }
}
