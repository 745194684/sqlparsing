package entity;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Column {

    /**
     * 所有单元格
     */
    private List<Cell> cells;

    /**
     * 列名
     */
    private String colName;

    /**
     * 名称与行索引
     */
    private Map<String, Integer> rowNamesMap = new LinkedHashMap<>();

    /**
     * 名称与列索引
     */
    private Map<String, Integer> colNamesMap = new LinkedHashMap<>();

}
