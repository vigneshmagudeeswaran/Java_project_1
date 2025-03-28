import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.nio.charset.StandardCharsets;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;

public class TimeTraveler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, Time Traveler! Please enter the year you want to travel to:");
        int desiredYear = scanner.nextInt();
      
        TimeMachine timeMachine = new TimeMachine();
        String event = timeMachine.getEventForDate(desiredYear);

        if (!event.isEmpty()) {
            System.out.println("You've arrived in the year " + desiredYear + ".");
            System.out.println("Here's a significant event that happening around  you" + desiredYear + ":");
            System.out.println(event);
            
            // Write the event to a file
            writeToFile(event, "event_" + desiredYear + ".txt");
            System.out.println("Event details written to file.");
        } else {
            System.out.println("Sorry, no significant event found for the year " + desiredYear + ".");
        }
    }
    
        private static void writeToFile(String content, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, StandardCharsets.UTF_8))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
}

class TimeMachine {
    public String getEventForDate(int year) {
        String url = "https://en.wikipedia.org/wiki/"+ year +"_in_India";
        StringBuilder event = new StringBuilder();

        try {
            Document doc = Jsoup.connect(url).get();
            Elements paragraphs = doc.select("body");
            for (Element paragraph : paragraphs) {
                // Consider the first non-empty paragraph as the event
                String text = paragraph.text().trim();
                if (!text.isEmpty()) {
                    event.append(text).append("\n\n");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return event.toString().trim();
    }
}

