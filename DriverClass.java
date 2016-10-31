/**
 * Created by Rudik on 25.10.2016.
 */
public class DriverClass {

    public static void main(String[] args)
    {
        LazerPrinter myprinter = new LazerPrinter(true, false, true);
        myprinter.refill();
        Queue<String> docs = null;
        myprinter.printDoc(docs);

        StreamPrinter myprinter2 = new StreamPrinter(true, false, true);
        myprinter2.refill();
        Queue<String> docs2 = null;
        myprinter.printDoc(docs2);
    }


}
