package hadoop.ch03.v17124080137;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.yarn.webapp.hamlet.Hamlet;

public class UploadHDFSFile {
    public static void main(String[] args) throws Exception {
        Configuration conf =new Configuration();
        //配置 NameNode 地址，具体根据你的 NameNode IP 配置
        URI uri = new URI("hdfs://192.168.30.130:8020");
        //指定用户名，获取FileSystem对象
        FileSystem fs = FileSystem.get(uri, conf, "hadoop");
        Path src = new Path("D:\\mypro\\test4.txt");
        Path dst = new Path("/17124080137/test4.txt");
        fs.copyFromLocalFile(src,dst);
        fs.close();
        System.out.println("Upload file Sucessfully!");

    }
}

