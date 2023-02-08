package org.example;
import java.util.*;
import java.util.logging.*;

public class Hashmap {
    public static void main(String[] args){
        Logger l= Logger.getLogger("com.api.jar");
        HashMap<String, String> hash=new HashMap<String, String>();
        hash.put("England","London");
        hash.put("India","NewDelhi");
        hash.put("USA","Washington DC");
        hash.put("Germany","Berlin");
        l.log(Level.INFO,()->""+hash);
        l.info(hash.get("England"));
        l.info(hash.get("India"));
        hash.remove("Germany");
        l.log(Level.INFO,()->""+hash);
        l.log(Level.INFO,()->""+hash.size());
        l.info("Printing Keys:");
        for(String i:hash.keySet()){
            l.info(i);
        }
        l.info("Printing values:");
        for(String i:hash.values()){
            l.info(i);
        }
        l.info("Printing values and keys:");
        for(String i:hash.keySet()){
            l.info("Key:"+i+" Value:"+hash.get(i));
        }
        hash.replace("England","Britan");
        l.log(Level.INFO,()->""+hash);
        Iterator<String> it=hash.keySet().iterator();
        while(it.hasNext()){
            l.info(it.next());
        }
        hash.clear();
        l.log(Level.INFO,()->""+hash);
    }
}
