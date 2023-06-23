package section11.exercise11;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

class Record {
    String name;
    String gender;

    Record(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
}

public class Demerging {
    public static void main(String[] args) {
        Queue<Record> femaleQueue = new LinkedList<>();
        Queue<Record> maleQueue = new LinkedList<>();

        // Đọc dữ liệu từ file input và đưa vào queue tương ứng
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                String name = tokens[0];
                String gender = tokens[1];

                Record record = new Record(name, gender);
                if (gender.equalsIgnoreCase("female")) {
                    femaleQueue.add(record);
                } else if (gender.equalsIgnoreCase("male")) {
                    maleQueue.add(record);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ghi dữ liệu từ queue vào file output
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            while (!femaleQueue.isEmpty()) {
                Record record = femaleQueue.poll();
                writer.write(record.name + "," + record.gender);
                writer.newLine();
            }

            while (!maleQueue.isEmpty()) {
                Record record = maleQueue.poll();
                writer.write(record.name + "," + record.gender);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

