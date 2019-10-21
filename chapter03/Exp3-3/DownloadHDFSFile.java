package hadoop.ch03.v17124080137;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import java.net.URI;
public class DownloadHDFSFile {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        //配置 NameNode 地址，具体根据你的 NameNode IP 配置
        URI uri = new URI("hdfs://192.168.30.130:8020");
        //指定用户名，获取FileSystem对象
        FileSystem fs = FileSystem.get(uri, conf, "hadoop");
        Path src = new Path("/17124080137/test5.txt");
        Path dst = new Path("D:\\mypro\\test5.txt");
        //linux
        fs.copyToLocalFile(src,dst);
        //windows
        fs.copyToLocalFile(false,src,dst,true);
        fs.close();
        System.out.println("Download file sucessfully!");

    }
}
