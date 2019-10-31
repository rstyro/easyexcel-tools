package top.lrshuai.test.demo.temp.simple;

import com.alibaba.excel.EasyExcel;
import net.sf.cglib.beans.BeanMap;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.lrshuai.test.demo.temp.large.LargeData;
import top.lrshuai.test.demo.util.TestFileUtil;
import top.lrshuai.test.demo.write.DemoData;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 测试poi
 *
 * @author Jiaju Zhuang
 **/
@Ignore
public class Wirte {
    private static final Logger LOGGER = LoggerFactory.getLogger(Wirte.class);

//    @Test
//    public void simpleWrite1() {
//        LargeData ss = new LargeData();
//        ss.setStr23("ttt");
//        Map map = BeanMap.create(ss);
//        System.out.println(map.containsKey("str23"));
//        System.out.println(map.containsKey("str22"));
//        System.out.println(map.get("str23"));
//        System.out.println(map.get("str22"));
//    }

    @Test
    public void simpleWrite() {
        // 写法1
        String fileName = TestFileUtil.getPath() + "t22" + System.currentTimeMillis() + ".xlsx";
        // 这里 需要指定写用哪个class去读，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        EasyExcel.write(fileName, DemoData.class).sheet("模板").doWrite(data());
    }

    private List<List<String>> head() {
        List<List<String>> list = new ArrayList<List<String>>();
        List<String> head0 = new ArrayList<String>();
        head0.add("字符串" + System.currentTimeMillis());
        List<String> head1 = new ArrayList<String>();
        head1.add("数字" + System.currentTimeMillis());
        List<String> head2 = new ArrayList<String>();
        head2.add("日期" + System.currentTimeMillis());
        list.add(head0);
        list.add(head1);
        list.add(head2);
        return list;
    }

    private List<DemoData> data() {
        List<DemoData> list = new ArrayList<DemoData>();
        for (int i = 0; i < 10; i++) {
            DemoData data = new DemoData();
            data.setString("字符串" + i);
            data.setDate(new Date());
            data.setDoubleData(null);
            list.add(data);
        }
        return list;
    }

}
