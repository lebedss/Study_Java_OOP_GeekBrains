package Homework;

import java.util.ArrayList;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.getP1().getFullName().equals(p.getFullName()) && t.getRe() == re) {
                result.add(t.getP2().getFullName());
            }
        }
        return result;
    }

}
