/**
 * Created by Rudik on 25.10.2016.
 */
public class Printer implements PrintDevice {
    public boolean isHasPaper() {
        return hasPaper;
    }

    public void setHasPaper(boolean hasPaper) {
        this.hasPaper = hasPaper;
    }

    public boolean isColorPrint() {
        return isColorPrint;
    }

    public void setColorPrint(boolean colorPrint) {
        isColorPrint = colorPrint;
    }

    public double getInkLevel() {
        return inkLevel;
    }

    public void setInkLevel(double inkLevel) {
        this.inkLevel = inkLevel;
    }

    private boolean hasPaper;            // есть ли бумага?
    private boolean isColorPrint;       // цветная печать?
    private double inkLevel;

    public Printer() {
        this.hasPaper = true;
        this.isColorPrint = true;
        this.inkLevel = 0;
    }

    public Printer(boolean hasPaper, boolean isColorPrint)
    {
        this.hasPaper = hasPaper;
        this.isColorPrint = isColorPrint;
        this.inkLevel = 0;
    }

    public void printDoc(Queue<String> doc)   // печать документа
    {
        if(doc != null)
        {
            System.out.println("Document was printed");
        }
        else
        {
            System.out.println("Queue is empty");
        }
    }

    public void refill()              // заправка картриджа
    {
        if(inkLevel < 5)            // уровень чернил/тонера < 5%
        {
            System.out.println("Please, refill cartridge!");
        }
    }
}
