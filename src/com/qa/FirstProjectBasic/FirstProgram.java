package com.qa.FirstProjectBasic;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

import other.Other;

public class FirstProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");

        int i=3;
        int j=6;
        Double l=Double.valueOf(i)/Double.valueOf(j);
        System.out.println(l);
		String hello = "Hello", lo = "lo";
		System.out.print((hello == "Hello") + " ");
		//System.out.print((Other.hello == hello) + " ");
		//System.out.print((other.Other.hello == hello) + " ");
		System.out.print((hello == ("Hel"+"lo")) + " ");
		System.out.println(hello);
		System.out.print((hello == ("Hel"+lo)) + " ");
		System.out.println(hello);
		System.out.println(hello == ("Hel"+lo).intern());
        
		double a[] =new double[10];
		a[0]=1;
		
		double []b={0,1,2,3,4,5,6,7,8,9};
		for (double d : b) {
			System.out.print(d);
		}
		Double[]c;
		c=new Double[5];
          
		
		String path= System.getProperty("user.dir");
		File directory = new File(path);
		System.out.println(path);
/*       
		if (isEmptyDirectory(directory)) {
            System.out.println("The directory "
                               + directory.getPath()
                               + " is Empty!");
        }
        else {
            System.out.println("The directory "
                               + directory.getPath()
                               + " is Not Empty!");
        }

		if (directory.isDirectory()) 
		{

			// creating a String Array
			// store name of files
			String arr[] = directory.list();

			// check if length is greater than 0 or not
			if (arr.length > 0) {
				System.out.println("The directory "
						+ directory.getPath()
						+ " is not Empty!");
			}
			else {
				System.out.println("The directory "
						+ directory.getPath()
						+ " is Empty!");
			}
		}
	}
	public static boolean isEmptyDirectory(File directory)

			throws IOException
	{
		// check if given path is a directory
		if (directory.exists()) 
		{
			if (!directory.isDirectory()) 
			{

				// throw exception if given path is a
				// file
				throw new IllegalArgumentException(
						"Expected directory, but was file: "
								+ directory);
			}
			else 
			{
				// create a stream and check for files
				try (DirectoryStream<Path> directoryStream
						= Files.newDirectoryStream(
								directory.toPath())) {
					// return false if there is a file
					return !directoryStream.iterator()
							.hasNext();
				}
			}
		}
		// return true if no file is present
		return true;
		 */
	}
}


