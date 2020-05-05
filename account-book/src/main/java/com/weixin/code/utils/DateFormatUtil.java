package com.weixin.code.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * @version 1.0.0
 * @Description 日期转换格式工具类
 * @author weixin
 * @Date 2019/5/16 17:34
 **/
public class DateFormatUtil {


    private static final ThreadLocal<Map<String,SimpleDateFormat>> DATE_THREAD_LOCAL = new ThreadLocal<Map<String,SimpleDateFormat>>() {
        @Override
        protected Map<String, SimpleDateFormat> initialValue() {
            return new WeakHashMap<String,SimpleDateFormat>();
        }
    };
    public static SimpleDateFormat getDateFormat(String format){
          Map<String,SimpleDateFormat> formatMap = DATE_THREAD_LOCAL.get();
          SimpleDateFormat simpleDateFormat = formatMap.get(format);
          if(simpleDateFormat == null){
              simpleDateFormat = new SimpleDateFormat(format);
              formatMap.put(format,simpleDateFormat);
          }
          return  simpleDateFormat;
    }

    public static Date parse(String date,String format) throws ParseException {
        return getDateFormat(format).parse(date);
    }

    public static String format(Date date,String format) {
        return getDateFormat(format).format(date);
    }


    /**
     * 计算两个日期之间相差的天数
     * @param begin 开始时间
     * @param end  结束时间
     * @return 相差天数
     * @throws ParseException
     */
    public static int daysBetween(Date begin,Date end)
    {
        long betweenDays=(end.getTime()-begin.getTime())/(1000*3600*24);
        return Integer.parseInt(String.valueOf(betweenDays));
    }


}
