package com.crabgeek.principle.demterlow;

import com.crabgeek.principle.demeterlow.Principal;
import org.junit.Test;

import java.util.Map;

public class DemeterLowTest {

    @Test
    public void test_Principal() {
        Principal principal = new Principal();
        Map<String, Object> map = principal.queryClazzInfo("3年级1班");
        System.out.println(map.toString());
    }
}
