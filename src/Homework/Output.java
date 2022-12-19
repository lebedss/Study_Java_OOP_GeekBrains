package Homework;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Output {
    static GeoTree tree;

    public static void showInConsole(Person person, Relationship relationship) {
        System.out.println(new Reserch(tree).spend(person,
                relationship));
    }

    public static void loadFromFile() {
        File file = new File("text.txt");
        try {
            char[] buf = new char[1024];
            int c;
            FileReader fileReader = new FileReader(file);
            while ((c = fileReader.read(buf)) > 0) {
                if (c < 1024) {
                    buf = Arrays.copyOf(buf, c);
                }// Parent1 parent Son1\n
                String[] values = new String(buf).split("[\s,\n]+");
                for (int i = 0; i < values.length; i += 3) {
                    tree.getTree().add(new Node(new Person(values[i]), Relationship.valueOf(values[i + 1]),
                            new Person(values[i + 2])));
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void saveInFile() {
        File file = new File("text.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (Node node : tree.getTree()) {
                fileWriter.write(node.getP1().getFullName() + " " + node.getRe() + " " +
                        node.getP2().getFullName() + "\n");
            }
            fileWriter.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static GeoTree getTree() {
        return tree;
    }

    public static void setTree(GeoTree tree) {
        Output.tree = tree;
    }
}
