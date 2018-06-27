package gz;

import org.junit.Test;

import java.io.*;
import java.util.zip.GZIPInputStream;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/26 10:45
 */
public class Ungz {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            /*File tempFile = new File("e:\\userinfo.20180619.txt.gz");
            fileInputStream = new FileInputStream(tempFile);
            GZIPInputStream Zin = new GZIPInputStream(fileInputStream);
            File outdir = new File("e:\\");
            extractFile(Zin, outdir, tempFile.getName().substring(0, tempFile.getName().lastIndexOf(".")));
            fileInputStream.close();*/

            insertStringInFile( new File("e:\\1.txt"),1,"hhh");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void extractFile(GZIPInputStream in, File outdir, String name) throws IOException {
        byte[] buffer = new byte[1024];
        BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream(new File(outdir, name)));
        int count = -1;
        while ((count = in.read(buffer)) != -1) {
            out.write(buffer, 0, count);
        }

        in.close();
        out.close();
    }

    private static void extractFile(FileInputStream in, File outdir, String name) throws IOException {
        byte[] buffer = new byte[1024];
        BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream(new File(outdir, name)));
        int count = -1;
        while ((count = in.read(buffer)) != -1) {
            out.write(buffer, 0, count);
        }

        in.close();
        out.close();
    }

    @Test
    public void insertHeader() {
        try {
            RandomAccessFile raf = new RandomAccessFile("e:\\1.txt", "rw");
            int targetLineNum = 1;
            int currentLineNum = 1;
            /*while(raf.readLine() != null){
                if(currentLineNum == targetLineNum){ // 定位到目标行时结束
                    break;
                }
                currentLineNum++;
            }*/
            raf.write("insert2\r".getBytes());
            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void insertStringInFile(File inFile, int lineno,
                                          String lineToBeInserted) throws Exception {
        // 临时文件
        File outFile = File.createTempFile("name", ".tmp");

        // 输入
        FileInputStream fis = new FileInputStream(inFile);
        BufferedReader in = new BufferedReader(new InputStreamReader(fis));

        // 输出
        FileOutputStream fos = new FileOutputStream(outFile);
        PrintWriter out = new PrintWriter(fos);

        // 保存一行数据
        String thisLine;
        // 行号从1开始
        int i = 1;
        while ((thisLine = in.readLine()) != null) {
            // 如果行号等于目标行，则输出要插入的数据
            if (i == lineno) {
                out.println(lineToBeInserted);
            }
            // 输出读取到的数据
            out.println(thisLine);
            // 行号增加
            i++;
        }
        out.flush();
        out.close();
        in.close();

        // 删除原始文件
        inFile.delete();
        // 把临时文件改名为原文件名
        outFile.renameTo(inFile);

    }

}
