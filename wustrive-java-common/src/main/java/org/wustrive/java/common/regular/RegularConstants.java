package org.wustrive.java.common.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 常用的正则表达式
 * @Title: RegularConstants.java
 * @ClassName: org.wustrive.java.common.regular.RegularConstants
 * @Description: TODO
 *
 * Copyright  2015-2017 维创盈通 - Powered By 研发中心 V1.0.0
 * @author wustrive
 * @date 2017年3月11日 上午11:43:38
 */
public class RegularConstants {

    //数字
    public static final String REGULAR_NUMBER = "^[0-9]*$";
    
    //单位元 金额
    public static final String REGULAR_AMOUNT = "^([1-9][0-9]*)+(.[0-9]{1,2})?$";
    
    //汉字
    public static final String REGULAR_CHINESE = "^[\u4e00-\u9fa5]{0,}$";
    
    //英文与数字
    public static final String REGULAR_ENG_NUM = "^[A-Za-z0-9]+$";
    
    //域名
    public static final String REGULAR_DOMAIN = "[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(/.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+/.?";
    
    //URL
    public static final String REGULAR_URL = "[a-zA-z]+://[^\\s]*";
    
    //邮箱
    public static final String REGULAR_EMAIL = "^((([a-z]|\\d|[!#\\$%&'\\*\\+\\-\\/=\\?\\^_`{\\|}~]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])+(\\.([a-z]|\\d|[!#\\$%&'\\*\\+\\-\\/=\\?\\^_`{\\|}~]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])+)*)|((\\x22)((((\\x20|\\x09)*(\\x0d\\x0a))?(\\x20|\\x09)+)?(([\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x7f]|\\x21|[\\x23-\\x5b]|[\\x5d-\\x7e]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])|(\\\\([\\x01-\\x09\\x0b\\x0c\\x0d-\\x7f]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]))))*(((\\x20|\\x09)*(\\x0d\\x0a))?(\\x20|\\x09)+)?(\\x22)))@((([a-z]|\\d|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])|(([a-z]|\\d|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])([a-z]|\\d|-|\\.|_|~|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])*([a-z]|\\d|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])))\\.)+(([a-z]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])|(([a-z]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])([a-z]|\\d|-|\\.|_|~|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])*([a-z]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])))$";
    
    //特殊字符
    public static final String REGULAR_SPECIALCHAR = "^([^`~!@$^&':;,?~！……&；：。，、？=]).*";
    
    //手机号
    public static final String REGULAR_PHONE = "^(0|86|17951)?(13[0-9]|15[012356789]|16[0-9]|17[0-9]|18[0-9]|14[57])[0-9]{8}$";
    
    //固话
    public static final String REGULAR_TEL = "(^[0-9]{3,4}\\-[0-9]{7,8}$)|(^[0-9]{7,8}$)|(^[0-9]{3,4}\\-[0-9]{7,8}\\-[0-9]{3,5}$)|(^[0-9]{7,8}\\-[0-9]{3,5}$)|(^\\([0-9]{3,4}\\)[0-9]{7,8}$)|(^\\([0-9]{3,4}\\)[0-9]{7,8}\\-[0-9]{3,5}$)|(^1[3,4,5,7,8]{1}[0-9]{9}$)";
    
}
