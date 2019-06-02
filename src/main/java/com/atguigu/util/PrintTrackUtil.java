package com.atguigu.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;

/**打印当前线程的堆栈信息
 * Created by daynew on 2019/6/1.
 */
public class PrintTrackUtil {
   /* public static void main(String[] args) {
        printTrack("test");
    }*/
    //private static final Logger logger = LoggerFactory.getLogger(PrintTrackUtil.class);
    //打印当前线程堆栈信息
    public static void printTrack(String prefix){
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if(null == stackTrace){
            System.out.println("无效的堆栈内信息。。。");
            return;
        }

        StringBuffer sbf = new StringBuffer();
        for(StackTraceElement e:stackTrace){
            if(sbf.length() > 0){
                sbf.append("<-");
                sbf.append(System.getProperty("line.separator"));
            }
            sbf.append(MessageFormat.format("{0}.{1}(){2}",
                    e.getClassName(),
                    e.getMethodName(),
                    e.getLineNumber()));
        }
        System.out.println(prefix
                     + "\n*****************************************\n"
                     + sbf.toString()
                     + "\n******************************************");
    }
}
