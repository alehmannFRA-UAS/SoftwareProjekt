import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class GZipProgram {

    private static Scanner scanner;

    public static void main(String[] args) {
        printUsage();
        scanner = new Scanner(System.in);
        String command = scanner.next();
        if (command.equals("compress")) {
            System.out.println("Enter source file:"); // z.B. README.md
            String source = scanner.next();
            System.out.println("Enter target file:"); // z.B. README.md.gz
            String target = scanner.next();
            compress(source, target);
        } else if (command.equals("decompress")) {
            System.out.println("Enter source file:");
            String source = scanner.next();
            System.out.println("Enter target file:");
            String target = scanner.next();
            decompress(source, target);
        } else {
            System.out.println("Ungültiger Befehl.");
        }
        scanner.close();
    }

    private static void compress(String source, String target) {
        try {
            File sourceFile = new File(source);
            File targetFile = new File(target);
            checkIfFileExists(sourceFile);
            InputStream in = new FileInputStream(sourceFile);
            OutputStream out = new FileOutputStream(targetFile);
            GZIPOutputStream gzipOut = new GZIPOutputStream(out);
            writeOutput(in, gzipOut);
            gzipOut.close();
            out.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void decompress(String source, String target) {
        try {
            File sourceFile = new File(source);
            File targetFile = new File(target);
            checkIfFileExists(sourceFile);
            InputStream in = new FileInputStream(sourceFile);
            OutputStream out = new FileOutputStream(targetFile);
            GZIPInputStream gzipIn = new GZIPInputStream(in);
            writeOutput(gzipIn, out);            
            out.close();
            gzipIn.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printUsage() {
        System.out.println("Usage: <compress|decompress>");
    }

    private static void checkIfFileExists(File file) {
        if(!file.exists()) {
            System.out.println("Die Datei " + file.getName() + " existiert nicht.");
            System.exit(1);
        }
    }

    private static void writeOutput(InputStream in, OutputStream out) throws Exception {
        byte[] buffer = new byte[1024];
        int len;
        while((len = in.read(buffer)) > 0) {
            out.write(buffer, 0, len);
        }
    }

}
