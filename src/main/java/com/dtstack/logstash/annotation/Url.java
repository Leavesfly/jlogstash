package com.dtstack.logstash.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 
 * Reason: TODO ADD REASON(可选)
 * Date: 2016年9月07日 下午1:24:57
 * Company: www.dtstack.com
 * @author sishu.yss
 *
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Url {

}
