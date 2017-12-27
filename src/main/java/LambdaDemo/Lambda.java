package LambdaDemo;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lambda {

    public static void main(String[] args) {
        //调用testThread1
        testThread1();

        //调用testThred2
        testThread2();
    }

    /**
     * 在Java中实现一个线程，只输出一个字符串Hello World!
     */
    public static void testThread1() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        }).start();
    }

    public static void testThread2() {
        new Thread((() -> System.out.println("Hello World!"))).start();
    }

    /**
     * Java中使用集合类对一个字符串按字典序列进行排序
     */
    public static void sortByTable() {
        String[] datas = new String[]{"zhang", "wang", "li", "zhao"};
        Arrays.sort(datas);
        Stream.of(datas).forEach(param -> System.out.println(param));
    }

    /**
     * Java中使用集合类对一个字符串按照字符串长度进行排序
     */
    public static void sortByLength() {
        String[] datas = new String[]{"zhang", "wang", "li", "zhao"};
        Arrays.sort(datas, (v1, v2) -> Integer.compare(v1.length(), v2.length()));
        Stream.of(datas).forEach(param -> System.out.println(param));
    }

    /**
     * Lambad表达式之for循环
     */
    public static void forEach1() {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> strings = Arrays.asList(atp);
        strings.forEach((s) -> System.out.println(s));
    }

    public static void forEach2() {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> strings = Arrays.asList(atp);
        strings.forEach(System.out::println);
    }


}
