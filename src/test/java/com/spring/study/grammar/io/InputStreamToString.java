package com.spring.study.grammar.io;

import com.google.common.io.CharStreams;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-05-30 15:05
 */
public class InputStreamToString {
    public static void main(String[] args) {
        try {
            //1、使用 InputStreamReader 和 StringBuilder (JDK)
            InputStream inputStream = new FileInputStream("C:\\Users\\zhangfei\\Documents\\房产信息.txt");
            char[] charBuffer = new char[1024]; //根据需要的数组大小进行自定义
            StringBuilder sb = new StringBuilder();
            Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            // Reads characters into a portion of an array.
            for (int numRead; (numRead = reader.read(charBuffer, 0, charBuffer.length)) > 0; ) {
                sb.append(charBuffer, 0, numRead);
            }
            String myString1 = sb.toString();
            System.out.println("myString1 = \n" + myString1);

            //2、使用 inputStream.read() and StringBuilder
            for (int ch; (ch = inputStream.read()) != -1; ) {
                sb.append((char) ch);
            }
            String myString2 = sb.toString();
            System.out.println("myString2 = \n" + myString2);

            //3、使用 ByteArrayOutputStream and inputStream.read
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] byteBuffer = new byte[1024];
            for (int length; (length = inputStream.read(byteBuffer)) != -1; ) {
                // Writes len bytes from the specified byte array starting at offset off
                // to this byte array output stream.
                byteArrayOutputStream.write(byteBuffer, 0, length);
            }
            String myString3 = byteArrayOutputStream.toString("UTF-8");
            System.out.println("myString3 = \n" + myString3);

            //4、使用BufferedInputStream
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            ByteArrayOutputStream bu = new ByteArrayOutputStream();
            for (int result = bufferedInputStream.read(); result != -1; result = bufferedInputStream.read()) {
                // Writes the specified byte to this byte array output stream
                bu.write((byte) result);
            }
            String myString4 = bu.toString("UTF-8");
            System.out.println("myString4 = \n" + myString4);

            //5、使用 BufferedReader
            String newLine = System.getProperty("line.separator");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder result = new StringBuilder();
            // Reads a line of text
            for (String line; (line = bufferedReader.readLine()) != null; ) {
                if (result.length() > 0) {
                    result.append(newLine);
                }
                result.append(line);
            }
            String myString5 = result.toString();
            System.out.println("myString5 = \n" + myString5);

            //6、使用 StringWriter 和IOUtils.copy (Apache Commons)
            StringWriter stringWriter = new StringWriter();
            IOUtils.copy(inputStream, stringWriter, "UTF-8");
            System.out.println("myString6 = \n" + stringWriter.toString());

            //7、使用CharStreams (Google Guava)
            String myString7 = CharStreams.toString(new InputStreamReader(inputStream, Charsets.UTF_8));

            //8、使用 Stream API 或 parallel Stream API
            String myString8 = new BufferedReader(new InputStreamReader(inputStream))
                    .lines().collect(Collectors.joining("\n"));
            String myString9 = new BufferedReader(new InputStreamReader(inputStream))
                    .lines().parallel().collect(Collectors.joining("\n"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
