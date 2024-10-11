package edu.fra.uas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class AppStreamIO {

    static PrintStream out = System.out;

    public static void main(String[] args) throws Exception {
        fileExample();
        //fileOutputStreamExample();
        //fileInputStreamExample();
        //filterStreamExample();
        //fileWriterExample();
        //fileReaderExample();
    }

    public static void fileExample() {
        File file = new File("README.md");
        //File file = new File(".");

        out.println("File exists: " + file.exists());
        out.println("File name: " + file.getName());
        out.println("Path: " + file.getPath());
        out.println("Absolute path: " + file.getAbsolutePath());
        out.println("Writeable: " + file.canWrite());
        out.println("Readable: " + file.canRead());
        out.println("File?: " + file.isFile());
        out.println("File size in bytes: " + file.length());

        if (file.isDirectory()) {
            out.println("Directory?: " + file.isDirectory());
            String[] files = file.list();
            for (String f : files) {
                out.println("-- " + f);
            }
        }        
    }

    public static void fileOutputStreamExample() {
        try{
            FileOutputStream fos = new FileOutputStream("./Streams/test.txt", true);
            for (int i = 65; i < 91; ++i) { // A-Z in ASCII
                fos.write(i);
            }
            fos.close();
        } catch (IOException e) {
            System.err.println(e);
			System.exit(1);
        }
    }

    public static void fileInputStreamExample() {
        try {
            FileInputStream fis = new FileInputStream("./Streams/src/edu/fra/uas/AppStreamIO.java");
            FileOutputStream fos = new FileOutputStream("./Streams/code.txt");
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
    }

    public static void filterStreamExample() {
        // Create a file with some content to read from
        File file = new File("./Streams/test.txt");
        if (!file.exists()) {
            fileOutputStreamExample();
        }

        try{
            FileInputStream fis = new FileInputStream("./Streams/test.txt");
            FileOutputStream fos = new FileOutputStream("./Streams/encoded.txt");

            EncoderOutputStream eos = new EncoderOutputStream(fos);

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                eos.write(buffer, 0, bytesRead);
            }
            eos.close();
            fis.close();
            fos.close();
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
    }

    public static void fileWriterExample() {
        String text = "Hello, World!";
        String fileName = "./Streams/hello.txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(text);
            writer.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
            System.exit(1);
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
    }

    public static void fileReaderExample() {
        String fileName = "./Streams/src/edu/fra/uas/AppStreamIO.java";
        try {
            FileReader reader = new FileReader(fileName);
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
            System.exit(1);
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
    }

}
