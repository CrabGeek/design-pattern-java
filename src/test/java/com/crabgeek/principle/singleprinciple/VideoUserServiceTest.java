package com.crabgeek.principle.singleprinciple;

import com.crabgeek.principle.singleprinciple.impl.GustVideoUserServiceImpl;
import com.crabgeek.principle.singleprinciple.impl.OrdinaryVideoUserService;
import com.crabgeek.principle.singleprinciple.impl.VipVideoUserService;
import org.junit.Test;

public class VideoUserServiceTest {

    @Test
    public void gustUserTest() {
        GustVideoUserServiceImpl gustVideoUserService = new GustVideoUserServiceImpl();
        gustVideoUserService.definition();
        gustVideoUserService.advertisement();
    }

    @Test
    public void ordinaryUserTest() {
        OrdinaryVideoUserService ordinaryVideoUserService = new OrdinaryVideoUserService();
        ordinaryVideoUserService.definition();
        ordinaryVideoUserService.advertisement();
    }

    @Test
    public void vipUserTest() {
        VipVideoUserService vipVideoUserService = new VipVideoUserService();
        vipVideoUserService.definition();
        vipVideoUserService.advertisement();
    }
}
