package com.atguigu.java1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */

public @interface MyAnnotations {

    MyAnnotation[] value();
}
