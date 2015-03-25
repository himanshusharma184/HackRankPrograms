package mapReduce;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class WordFinder {

	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
	    Job job = new Job(conf, "word count");
	    job.setJarByClass(WordFinder.class);
	    job.setMapperClass(WordMapper.class);
	    job.setCombinerClass(WordReducer.class);
	    job.setReducerClass(WordReducer.class);
	    job.setOutputKeyClass(Text.class);
	    job.setOutputValueClass(LongWritable.class);
	    FileInputFormat.addInputPath(job, new Path(args[0]));
	    FileOutputFormat.setOutputPath(job, new Path(args[1]));
	    System.exit(job.waitForCompletion(true) ? 0 : 1);

	}



}
