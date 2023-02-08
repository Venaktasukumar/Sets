package org.example;
import java.util.*;
import java.util.logging.*;

public class Hashset{
    public static void main(String[] args){
        Logger l= Logger.getLogger("com.api.jar");
        HashSet<String> hashset=new HashSet<String>();
        hashset.add("Benz");
        hashset.add("BMW");
        hashset.add("Volvo");
        hashset.add("swift");
        l.log(Level.INFO,()->""+hashset);
        l.log(Level.INFO,()->""+hashset.contains("TATA"));
        hashset.remove("Benz");
        l.log(Level.INFO,()->""+hashset);
        l.log(Level.INFO,()->""+hashset.size());
        l.log(Level.INFO,()->""+hashset.clone());
        l.log(Level.INFO,()->""+hashset.isEmpty());
        l.info("printing elements");
        for(String i:hashset){
            l.info(i);
        }
        l.info("printing the elements By using iterator");
        Iterator<String> k=hashset.iterator();
        while(k.hasNext()){
            l.info(k.next());
        }
        hashset.clear();
        l.log(Level.INFO,()->""+hashset);
    }
}
