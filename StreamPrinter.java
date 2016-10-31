/**
 * Created by Rudik on 25.10.2016.
 */
public class StreamPrinter {
    private boolean isSwitchOff;

    private boolean hasPaper;            // есть ли бумага?
    private boolean isColorPrint;       // цветная печать?
    private double inkLevel;

    LazerPrinter(boolean hasPaper, boolean isColorPrint, boolean isSwitchOff)
    {
        super(hasPaper, isColorPrint);
        this.isSwitchOff = true;
    }


    @override
    public void printDoc(Queue<String> doc)   // печать документа
    {
        if(doc != null)
        {
            System.out.println("Document was printed");
        }
        else
        {
            String adress = doc.deque(); //
            System.out.println("Queue is empty");
        }
    }

    @override
    public void refill()              // заправка картриджа
    {
        if(inkLevel < 15 && isSwitchOff == false)            // уровень чернил/тонера < 15%
        {
            System.out.println("Please, refill cartridge!");
        }
        for(int i = 15; i<90; i++)
            inkLevel++;

    }
}
