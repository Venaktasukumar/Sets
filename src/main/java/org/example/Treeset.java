package org.example;
import java.util.*;
import java.util.logging.*;

public class Treeset {
    public static void main(String[] args){
        Logger l= Logger.getLogger("com.api.jar");
        TreeSet<String> t =new TreeSet<String>();
        t.add("C");
        t.add("Java");
        t.add("Python");
        t.add("C++");
        t.add("Javascript");
        l.log(Level.INFO,()->""+t);
        l.log(Level.INFO,()->""+t.size());
        t.remove("C");
        l.log(Level.INFO,()->""+t);
        l.log(Level.INFO,()->""+t.isEmpty());
        l.log(Level.INFO,()->""+t.contains("C"));
        l.log(Level.INFO,()->""+t.clone());
        l.info("Printing elements");
        for(String i:t){
            l.info(i);
        }
        l.info("Printing the elements by using iterator");
        Iterator<String> k=t.iterator();
        while(k.hasNext()){
            String s=k.next();
            l.info(s);
        }
        t.clear();
        l.log(Level.INFO,()->""+t);

    }
}
