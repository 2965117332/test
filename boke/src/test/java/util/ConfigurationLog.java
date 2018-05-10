package util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by DuanJiangtao on 2018/5/7.
 */
public class ConfigurationLog {
    public static  void  inform(){
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        String data=dateFormat.format(new Date());
        String filepath="./log/"+data+".log";
        Properties pro=new Properties();
        pro.setProperty("log4j.rootLogger","info,toConsole,toFile");
        pro.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
        pro.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");
        pro.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        pro.setProperty("log4j.appender.toFile","org.apache.log4j.DailyRollingFileAppender");
        pro.setProperty("log4j.appender.toFile.layout","org.apache.log4j.PatternLayout");
        pro.setProperty("log4j.appender.toFile.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        pro.setProperty("log4j.appender.toFile.file",filepath);
        PropertyConfigurator.configure(pro);
}
}
