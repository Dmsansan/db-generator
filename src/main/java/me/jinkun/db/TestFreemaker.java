package me.jinkun.db;

import javafx.collections.ObservableMap;
import me.jinkun.db.utils.FtUtil;
import org.omg.CORBA.OBJECT_NOT_EXIST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description: HelloWorld！ <br/>
 * Autor: Created by jinkun on 2017/1/16.
 */
public class TestFreemaker {
    public static void main(String[] args) throws Exception {

        //模拟2个列ID、AGE
        Map<String, Object> column1 = new HashMap<String, Object>();
        column1.put("NAME", "ID");
        Map<String, Object> column2 = new HashMap<String, Object>();
        column2.put("NAME", "AGE");

        //模拟一个列集合
        List<Map<String, Object>> columnList = new ArrayList<Map<String, Object>>();
        columnList.add(column1);
        columnList.add(column2);

        //模拟一张表
        Map<String, Object> table = new HashMap<String, Object>();
        table.put("NAME", "T_USER");
        table.put("COLUMNS", columnList);

        //模拟一个表集合
        List<Map<String, Object>> tableList = new ArrayList<Map<String,Object>>();
        tableList.add(table);

        Map map = new HashMap<String, Object>();
        //map.put("table", "123");
        map.put("table", tableList);


        FtUtil ftUtil = new FtUtil();
        ftUtil.generateFile("/", "test.ftl", map, "D:/", "test.txt");
    }
}
