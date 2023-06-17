package com.itheima.Stream.a01mysteam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-男-15","周芷若-女-14","赵敏-女-13","张强-男-20","张三丰-男-100","张翠山-男-40","张良-男-40","王二麻子-男-37","谢广坤-男-37");
//        collect(Collector collector)          收集流中的数据，放到集合中(List Set Map)
//        收集List集合当中
//        求:
//        我要把所有的男性收集起来
        List<String> newlist = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(newlist);

        Set<String> newlist2 = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(newlist2);

    }
}
