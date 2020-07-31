// File: Utils.java
// Utils class with stored pixel dimensions
package sample;

/**
 * This class holds the pixel dimensions of the Technical Order PDF table, which we pre-measured and confirmed was
 * standardized throughout Technical Orders
 *
 * @author Bernard Chan, Sonali Loomba
 */
public class Utils {
    /** Specifies the program user */
    static boolean bernard;

    /** Pre-measured X-Coordinate of left side of table for left-leaning pages */
    static int leftStart = 37;
    /** Pre-measured X-Coordinate of left side of table for right-leaning pages */
    static int rightStart = 72;
    /** Pre-measured X-Coordinate of first character for left-leaning pages */
    static int firstLeft = 39;
    /** Pre-measured X-Coordinate of first character for right-leaning pages */
    static int firstRight = 75;
    /** Pre-measured width of the index column of the table */
    static int indexWidth = 50;
    /** Pre-measured width of the part column of the table */
    static int partWidth = 94;
    /** Pre-measured width of the cage column of the table */
    static int cageWidth = 35;
    /** Pre-measured width of the description column of the table */
    static int descWidth = 200;
    /** Pre-measured width of the unit column of the table */
    static int unitWidth = 44;
    /** Pre-measured width of the usable column of the table */
    static int usableWidth = 38;
    /** Pre-measured width of the SMR column of the table */
    static int smrWidth = 40;
    /** Pre-measured Y-Coordinate position of the top of the first row */
    static int startHeight = 86;
    /** Pre-measured height of the entire table */
    static int tableHeight = 630;
    /** Pre-measured width of the entire page */
    static int pageWidth = 611;
    /** Pre-measured height of the header containing the Technical Order number and Volume */
    static int headerHeight = 44;

    //didn't do these as we will probably replace these
    static String bernardargs = "true 3";
    static String bernardConfig = "--module-path C:/Users/berna_000/Desktop/javafx-sdk-12/javafx-sdk-11.0.2/lib --add-modules javafx.controls,javafx.fxml";
    static String bernardFile = System.getProperty("user.dir") + "/Pages from 1C-17A-4-33 (2).pdf";
    static String bernard9006File = System.getProperty("user.dir") + "/my9006.pdf";
    static String bernardcsv = System.getProperty("user.dir") + "/Mock Warehouse.csv";
    static String sonaliFile = "/Users/ohsonali/Documents/X-Force/Pages from 1C-17A-4-33 (2).pdf";
    static String sonaliConfig = "--module-path /Applications/javafx/javafx-sdk-11.0.2/lib --add-modules javafx.controls,javafx.fxml";
    static String sonali9006File = "/Users/ohsonali/Documents/X-Force/my9006.pdf";
    static String sonalicsv = "/Users/ohsonali/Documents/X-Force/Mock Warehouse.csv";
}
