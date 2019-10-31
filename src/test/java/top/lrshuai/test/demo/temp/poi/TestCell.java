package top.lrshuai.test.demo.temp.poi;

import com.alibaba.excel.metadata.CellData;
import lombok.Data;

import java.util.List;

/**
 * TODO
 *
 * @author 罗成
 **/
@Data
public class TestCell {
    private CellData c1;
    private CellData<List<String>> c2;
}
