import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
        String text = "hello";
        text = text + " world";
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.append(" world");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        System.out.println(text);
        System.out.println(stringBuilder);



        try {
            FileWriter fileWriter = new FileWriter("newText.txt");
            fileWriter.write("hello world!");
            fileWriter.close();




            FileHandler fileHandler = new FileHandler("log.txt");
            LOGGER.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

            // Пример логгирования
            LOGGER.info("Пример записи в лог.");
            LOGGER.warning("Это предупреждение!");


            String fileName = "text.txt"; // Путь к файлу
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                // Здесь можно проводить дополнительную обработку каждой строки,
                // например, анализ или обработка данных
            }
        }catch (Exception e){


        }
        System.out.println("ничего же не случилось, программа работает!");



    }
}
