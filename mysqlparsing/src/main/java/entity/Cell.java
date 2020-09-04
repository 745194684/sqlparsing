package entity;

import lombok.Data;

import java.util.List;

@Data
public class Cell<V, T> {

    /**
     * 行索引
     */
    private int rowIndex;

    /**
     * 列索引
     */
    private int colIndex;

    /**
     * 值
     */
    private V value;

    /**
     * 类型
     */
    private T type;

    /**
     * 位置信息
     */
    private List<Integer> location;
}
