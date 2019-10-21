package hadoop.ch03.v17124080137;
import java.net.URI;
import java.util.Arrays;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
public class DeleteHDFSFile {
    public static void main(String[] args) throws Exception {
        Configuration conf =new Configuration();
        //配置 NameNode 地址，具体根据你的 NameNode IP 配置
        URI uri = new URI("hdfs://192.168.30.130:8020");
        //指定用户名，获取FileSystem对象
        FileSystem fs = FileSystem.get(uri, conf, "hadoop");
        //define new file
        Path path = new Path("/17124080137/test2.txt");

        fs.delete(path);
        fs.close();
        System.out.println("Delete file sucessfully!");
    }
}
