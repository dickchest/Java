package book_ImproveJava.methods.varargsMethods;

public class Table_Ex4b {
    final String SIGN = "*";
    final String SPACE = " ";

    public void display(String... titles) {
        String titleText = "";
        String underTitle = "";
        String newLine = "\n";

        for (String title : titles) {
            titleText += title + SPACE;
            underTitle += SIGN.repeat(title.length()) + SPACE;
        }

        System.out.print(titleText + SPACE + newLine);
        System.out.print(underTitle);
    }

    public static void main(String[] args) {
        Table_Ex4b table = new Table_Ex4b();
        System.out.println("...Three arguments...\n");
        table.display("Product", "Brand", "Price");
        System.out.println();
        table.display("Product", "Brand");
    }
}

