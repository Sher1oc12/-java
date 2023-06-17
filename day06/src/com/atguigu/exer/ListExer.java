package com.atguigu.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class ListExer {
    @Test
    public void testListRemove(){
        List list =new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updataList(list);
        System.out.println(list);
    }

    private void updataList(List list) {
        list.remove(2);
    }
}
