package com.crabgeek.principle.singleprinciple.impl;

import com.crabgeek.principle.singleprinciple.IVideoUserService;

public class VipVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("VIP会员，1080P蓝光视频");
    }

    @Override
    public void advertisement() {
        System.out.println("VIP会员，视频无广告");
    }
}
