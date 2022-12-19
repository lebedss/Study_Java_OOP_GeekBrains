package Homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void showNames() {
        Set<String> set = new HashSet<>();
        for (Node node : tree) {
            set.add(node.getP1().getFullName());
            set.add(node.getP2().getFullName());
        }
        List<String> array = new ArrayList<>();
        for (String s : set) {
            System.out.println(s);
        }
    }

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void appendBrothers(Person brotherOne, Person brotherTwo) {
        tree.add(new Node(brotherOne, Relationship.brother, brotherTwo));
        tree.add(new Node(brotherTwo, Relationship.brother, brotherOne));
    }

    public void appendBrotherAndSister(Person brother, Person sister) {
        tree.add(new Node(brother, Relationship.brother, sister));
        tree.add(new Node(sister, Relationship.sister, brother));
    }

    public void appendSisters(Person sisterOne, Person sisterTwo) {
        tree.add(new Node(sisterOne, Relationship.sister, sisterTwo));
        tree.add(new Node(sisterTwo, Relationship.sister, sisterOne));
    }

    public void appendMotherInLaw(Person motherInLaw, Person sonInLaw) {
        tree.add(new Node(motherInLaw, Relationship.motherInLaw, sonInLaw));
        tree.add(new Node(sonInLaw, Relationship.sonInLaw, motherInLaw));
    }

}
