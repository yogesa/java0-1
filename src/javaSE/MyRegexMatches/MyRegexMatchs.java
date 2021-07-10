package javaSE.MyRegexMatches;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegexMatchs {

    private static final  String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";

    private static final String REGEX1 = "foo";
    private static final String INPUT1 = "foooooooooooooooo";
    private static final String INPUT2 = "ooooooooooofooooo";

    private static String REGEX3 = "a*b";
    private static String INPUT3 = "aabfooaabfooabfoobkkk";
    private static String REPLACE = "-";


    public static void main(String[] args) {
        String line = "this order was placed for QT300! OK";
        String patten = "(\\D*)(\\d+)(.*)";
        Pattern r = Pattern.compile(patten);
        Matcher m = r.matcher(line);
        System.out.println("m.groupCount()"+m.groupCount());
        if(m.find())
        {
            System.out.println(m.group(0));
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
        }
        else
            System.out.println("No match");


        Pattern p = Pattern.compile(REGEX);
        Matcher mm = p.matcher(INPUT);
        int count = 0;

        while(mm.find())
        {
            count++;
            System.out.println("Mathch number:"+count);
            System.out.println("Start():"+mm.start());
            System.out.println("end():"+mm.end());
        }


        Pattern patte = Pattern.compile(REGEX1);
        Matcher matcher1 = patte.matcher(INPUT1);
        Matcher matcher2 = patte.matcher(INPUT2);

        System.out.println("REGEX1:"+REGEX1);
        System.out.println("INPUT1:"+INPUT1);
        System.out.println("INPUT2:"+INPUT2);

        System.out.println("lookingAt():"+matcher1.lookingAt());
        System.out.println("matcher():"+matcher1.matches());
        System.out.println("lookingAt():"+matcher2.lookingAt());



        Pattern p1 = Pattern.compile("(\\d(\\d(a)))\\2");
        Matcher mmm = p1.matcher("32a2a");
        System.out.println(mmm.matches());


        Pattern p3 = Pattern.compile(REGEX3);
        Matcher m4 = p3.matcher(INPUT3);
        StringBuffer sb123 = new StringBuffer();
        while(m4.find())
        {
            m4.appendReplacement(sb123,REPLACE);
            System.out.println(m4);
        }

        System.out.println(m4.toString());
        m4.appendTail(sb123);

        System.out.println(sb123.toString());






    }
}

