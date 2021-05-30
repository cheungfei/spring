package com.cnos.springboot.stream;

import com.google.common.io.CharStreams;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
public class InputStream01 {
    public static void main(String[] args) {
        File file;
        try (InputStream inputStream = new FileInputStream("C:\\Users\\zhangfei\\Documents\\房产信息.txt")) {
            char[] buffer = new char[1024];
            StringBuilder sb = new StringBuilder();

            // InputStreamReader && StringBuilder
//            Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
//            for (int numRead; (numRead = reader.read(buffer, 0, buffer.length)) > 0; ) {
//                sb.append(buffer, 0, numRead);
//            }

            // InputStream && StringBuilder
//            for (int ch; (ch = inputStream.read()) != -1; ) {
//                sb.append((char) ch);
//            }

            //
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//            byte[] buffer1 = new byte[1024];
//            for (int length; (length = inputStream.read(buffer1)) != -1; ) {
//                byteArrayOutputStream.write(buffer1, 0, length);
//            }
//            String myString1 = byteArrayOutputStream.toString("UTF-8");
//            System.out.println("myString1 = \n" + myString1);

            //
//            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
//            ByteArrayOutputStream bu = new ByteArrayOutputStream();
//            for (int result = bufferedInputStream.read(); result != -1; result = bufferedInputStream.read()) {
//                    bu.write((byte) result);
//            }
//            String resultString = bu.toString("UTF-8");
//            System.out.println("resultString = " + resultString);

            //
//            String newLine = System.getProperty("line.separator");
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//            StringBuilder result = new StringBuilder();
//            for (String line; (line = bufferedReader.readLine()) != null; ) {
//                if (result.length() > 0) {
//                    result.append(newLine);
//                }
//                result.append(line);
//            }
//            String myString = result.toString();
//            System.out.println("myString is = " + myString);

            //
            StringWriter stringWriter = new StringWriter();
            IOUtils.copy(inputStream, stringWriter, "UTF-8");
            System.out.println("stringWriter: " + stringWriter.toString());

            //
            String result = CharStreams.toString(new InputStreamReader(inputStream, Charsets.UTF_8));

            //
            String myString = new BufferedReader(new InputStreamReader(inputStream))
                    .lines().collect(Collectors.joining("\n"));
//            String myString1 = new BufferedReader(new InputStreamReader(inputStream))
//                    .lines().parallel().collect(Collectors.joining("\n"));


//            String myString = sb.toString();
//            System.out.println("myString = \n" + myString);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
