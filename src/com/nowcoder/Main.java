package com.nowcoder;

import com.sun.javafx.collections.MappingChange;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Amy on 2017/6/12.
 */
public class Main{

    public static void print(int index,Object object){
        System.out.println(String.format("{%d},%s",index,object.toString()));
    }


    public static void demoMapTable(){
        Map<String,String> map = new HashMap<String,String>();
        for (int i=0;i<4;++i){
            map.put(String.valueOf(i),String.valueOf(i*i));
        }
        print(1,map);

        for (Map.Entry<String,String> entry : map.entrySet()){
            print(2,entry.getKey() + "|" + entry.getValue());
        }

    }

    public static void demoSet(){
        Set<String> set = new HashSet<String>();

            set.add(String.valueOf(2));
        set.add(String.valueOf(6));
        set.add(String.valueOf(4));
        print(3,set);
    }

    public static void demoData(){
        Date date = new Date();
        print(4,date);
        print(5,date.getTime());

        DateFormat demo = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        print(6,demo.format(date));

    }



    public static void main(String[] args){
       // demoData();
        demoSet();
        //demoMapTable();
        //System.out.print("hello world!");

    }
}
