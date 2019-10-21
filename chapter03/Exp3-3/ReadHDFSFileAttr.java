package hadoop.ch03.v17124080137;

import com.google.inject.internal.util.$Lists;
import com.google.inject.internal.util.$ToStringBuilder;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.xerces.impl.dv.util.Base64;

import java.lang.reflect.Type;
import java.net.URI;
import java.util.Arrays;

public class ReadHDFSFileAttr {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        //配置 NameNode 地址，具体根据你的 NameNode IP 配置
        URI uri = new URI("hdfs://192.168.30.130:8020");
        //指定用户名，获取FileSystem对象
        FileSystem fs = FileSystem.get(uri, conf, "hadoop");
        Path dfs = new Path("/17124080137/test5.txt");
        String st = "17124080137";
        byte[] b  =st.getBytes();
        fs.setXAttr(dfs,"user.id",b);
        System.out.println("属性设置成功！！！！");
        System.out.println("----------------华丽的分割线------------------");
        fs.getXAttr(dfs,"user.id");
        String str = new String(fs.getXAttr(dfs,"user.id"));
        System.out.println("test5.txt的拓展属性user.id:"+str);
    }
}
