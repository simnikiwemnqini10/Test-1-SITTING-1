//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
java.util.Scanner;
public static void main(String[]args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(" Enter console type: ");
    String consoleType= scanner.nextLine();
    System.out.print(" Enter store name: ");
    String consoleType= scanner.nextLine();
    System.out.print(" Enter total amount of sales: ");
    String consoleType= scanner.nextLine();

    ConsoleSales salesReport= new ConsoleSales( consoleType,Store,TotalSales);

    System.out.println();
    salesReport printReport();

    scanner.close();

}
