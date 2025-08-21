package com.modernjava.textblocks;

public class TextBlocks {



    public static String multiLineString() {

        var multiLine = "This is a\n" +
                "multiline string\n" +
                "with newlines inside";

        return  multiLine;
    }


     /* This method demonstrates the use of text blocks introduced in Java 13.
     * Text blocks allow for multi-line strings with better readability and formatting.
     *Indentation is determined by the end quotes, and based on that, indentation is applied to  each line of the string.
     * @return a multi-line string using text block syntax
     */

    public static String multiLineStringUsingTextBlock(){

        var multiLine = """
                This is a
                multiline string
                with newlines using text block
                """;
        return multiLine;
    }

    public static String multiLineStringUsingTextBlockWithIndentation(){

        var multiLine = """
                This is a
                    multiline string
                    with newlines using text block and indentation
                """;
        return multiLine;
    }

    public static String multiLineStringFormatted(String name){

        var multiLine = """
                Hello!
                My name is %s.
                """.formatted(name);
        return multiLine;
    }

    public static String sql(){
        var sqlQuery = """
                SELECT *
                FROM users
                WHERE age > 18
                ORDER BY name ASC
                """;
        return sqlQuery;
    }

    public static String json() {
        var jsonString = """
                {
                    "name": "Vaari",
                    "age": 30,
                    "city": "New York"
                }
                """;
        return jsonString;
    }
    public static void main(String[] args) {

        System.out.println("multiLineString = \n" + multiLineString());
        System.out.println("---------------------");
        System.out.println("multiLineStringUsingTextBlock = \n" + multiLineStringUsingTextBlock());
        System.out.println("---------------------");
        System.out.println("multiLineStringUsingTextBlockWithIndentation = \n" + multiLineStringUsingTextBlockWithIndentation());
        System.out.println("---------------------");
        System.out.println("multiLineStringFormatted = \n" + multiLineStringFormatted("Vaari"));
        System.out.println("---------------------");
        System.out.println("SQL Query = \n" + sql());
        System.out.println("---------------------");
        System.out.println("JSON String = \n" + json());
    }
}
