/**
 * Created by Rudik on 25.10.2016.
 */
public interface PrintDevice {

    void printDoc(Queue<String> doc);   // печать документа
    void refill();              // заправка картриджа
}
