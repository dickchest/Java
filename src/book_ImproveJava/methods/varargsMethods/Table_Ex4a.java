package book_ImproveJava.methods.varargsMethods;

public class Table_Ex4a {
    final String SIGN = "*";
    final String SPACE = " ";

    public void display(String title1, String title2, String title3) {
        String titleText = "";
        String underTitle = "";
        String newLine = "\n";

        titleText+= title1 +  SPACE;
        underTitle += SIGN.repeat(title1.length()) + SPACE;

        titleText+= title2 +  SPACE;
        underTitle += SIGN.repeat(title2.length()) + SPACE;

        titleText+= title3 +  SPACE;
        underTitle += SIGN.repeat(title3.length()) + SPACE;

        System.out.print(titleText + SPACE + newLine);
        System.out.print(underTitle);
    }

    public static void main(String[] args) {
        Table_Ex4a table = new Table_Ex4a();
        System.out.println("...Three arguments...\n");
        table.display("Product", "Brand", "Price");
    }
}

