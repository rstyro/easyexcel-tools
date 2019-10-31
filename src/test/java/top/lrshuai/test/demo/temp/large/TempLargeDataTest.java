package top.lrshuai.test.demo.temp.large;

import com.alibaba.easyexcel.test.core.large.LargeDataTest;
import com.alibaba.excel.EasyExcel;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;

/**
 *
 * @author Jiaju Zhuang
 */
@Ignore
public class TempLargeDataTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(LargeDataTest.class);

    @Test
    public void read() throws Exception {
        long start = System.currentTimeMillis();
        EasyExcel.read(new FileInputStream("D:\\test\\MRP生产视图(1).xlsx"), LargeData.class, new LargeDataListener())
            .headRowNumber(2).sheet().doRead();
        LOGGER.info("Large data total time spent:{}", System.currentTimeMillis() - start);
    }
}
