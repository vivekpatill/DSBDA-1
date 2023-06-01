import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.lang.InterruptedException;
import java.lang.ClassNotFoundException;

public class main_A {

	public static void main(String[] args) throws IOException,InterruptedException,ClassNotFoundException{
		
	     Configuration conf=new Configuration();
	     Job job=Job.getInstance(conf,"Vaishnavi");
	     job.setJarByClass(main_A.class);
	     job.setMapperClass(mapper1.class);
	     job.setReducerClass(reducer1.class);
	     job.setOutputKeyClass(Text.class);
	     job.setOutputValueClass(IntWritable.class);
	     FileInputFormat.addInputPath(job, new Path(args[0]));
	     FileOutputFormat.setOutputPath(job, new Path(args[1]));
	     job.waitForCompletion(true);
	     
	    
	}

}

