import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class mapper1 extends Mapper<Object,Text,Text,IntWritable>{

	public void map(Object offset,Text key,Context con) throws IOException,InterruptedException {
		
		StringTokenizer token=new StringTokenizer(key.toString()," ");
		
		con.write(new Text(token.nextToken()),new IntWritable(1));
	}

}

