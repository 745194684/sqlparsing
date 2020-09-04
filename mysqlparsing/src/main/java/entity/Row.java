package entity;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
public class Row {

    /**
     * 所有单元格
     */
    private List<Cell> cells;

    /**
     * 列名和对应cell的映射
     */
    private Map<String,Cell> cellMap = new LinkedHashMap<>();

    /**
     * 名称与行索引
     */
    private Map<String,Integer> rowNamesMap = new LinkedHashMap<>();

    /**
     * 名称与列索引
     */
    private Map<String,Integer> colNamesMap = new LinkedHashMap<>();
}
