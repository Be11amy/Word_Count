package test_01;

import java.io.*;

/**
 * @author Bellamy
 * @date 2022-05-12 15:06
 */
public class Word_Count {

    public static void main(String[] args) {
        File file = new File("D:\\大学\\大二\\现代软件工程\\个人实践作业1\\test.txt");

        // 按行数获取
        try {
            String name = file.getName();
            System.out.println("File:" + name);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            int i = 0;
            while (br.readLine() != null) {
                i++; //累计行数
            }
            System.out.println("Lines:" + i);
            fr.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 按字符获取
        try {
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            char ch;
            char fch = 'A';
            int countch = 0;
            int countwd = 0;
            while ((ch = (char) bf.read()) != (char) -1) { //按字符获取文本内容
                if (ch != '\n' && ch != '\r') {
                    countch++; //累计字符数
                }
                if(!(ch>='a'&&ch<='z')&&!(ch>='A'&&ch<='Z')&&((fch>='a'&&fch<='z')||(fch>='A'&&fch<='Z'))) {
                    countwd++;//累计单词数
                }
                fch=ch;
            }
            System.out.println("Words:"+countwd);
            System.out.println("Chars:"+countch);
            bf.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
