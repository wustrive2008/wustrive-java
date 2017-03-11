package org.wustrive.java.common.string;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 补充的字符串工具类
 * 
 * @Title: MyStringUtil.java
 * @ClassName: org.wustrive.java.common.string.MyStringUtil
 * @Description: TODO
 *
 *               Copyright 2015-2017 维创盈通 - Powered By 研发中心 V1.0.0
 * @author wustrive
 * @date 2017年3月11日 下午12:08:06
 */
public class MyStringUtil {
    protected static final Logger log = LoggerFactory.getLogger(MyStringUtil.class);

    /**
     * 字符串编码转换
     * 
     * @param param
     * @return
     */
    public static String convertEncode(String sourceCharsetName, String targetCharsetName,
            String str) {
        String ret = "";
        if (StringUtils.isNotBlank(str)) {
            try {
                ret = new String(str.getBytes(sourceCharsetName), targetCharsetName).trim();
            } catch (UnsupportedEncodingException e) {
                log.error("字符串编码转换异常:原编码{},目标编码{}", sourceCharsetName, targetCharsetName, e);
                ret = "";
            }
        }
        return ret;
    }

    /**
     * 不带中划线的UUID
     * 
     * @return
     */
    public static String getUUID() {
        String uuid = UUID.randomUUID().toString();
        return uuid.substring(0, 8) + uuid.substring(9, 13) + uuid.substring(14, 18)
                + uuid.substring(19, 23) + uuid.substring(24);
    }


    /**
     * List转换为string 分隔符分割
     * 
     * @param list
     * @param separator
     * @return
     */
    public static String listToString(List<String> list, String separator) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : list) {
            stringBuffer.append(separator).append(str);
        }
        stringBuffer.deleteCharAt(0);
        return stringBuffer.toString();
    }


    /**
     * 过滤emoji表情
     * 
     * @param str
     * @return
     */
    public static String filterEmojiCharacter(String str) {
        if (str == null)
            return null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isEmojiCharacter(c))
                sb.append(c);
        }
        return sb.toString();
    }

    /**
     * 判断是否是emoji表情
     * 
     * @param code
     * @return
     */
    private static boolean isEmojiCharacter(char code) {
        return (code == 0x0) || (code == 0x9) || (code == 0xA) || (code == 0xD)
                || ((code >= 0x20) && (code <= 0xD7FF)) || ((code >= 0xE000) && (code <= 0xFFFD))
                || ((code >= 0x10000) && (code <= 0x10FFFF));
    }


    /**
     * 替换字符串后几位
     * 
     * @param str
     * @param len
     * @param replaceChar
     * @return
     */
    public static String replayStrOfEnd(String str, int len, String replaceChar) {
        if (StringUtils.isBlank(str)) {
            return "";
        }
        if (str.length() <= len) {
            
            len = str.length();
        }
        String preStr = str.substring(0, str.length() - len);
        String hideStr = copyStr(replaceChar, len);
        return preStr + hideStr;
    }


    /**
     * 复制字符串 a->aaaa
     * 
     * @param srcStr
     * @param num
     * @return
     */
    public static String copyStr(String srcStr, int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(srcStr);
        }
        return sb.toString();
    }

}
