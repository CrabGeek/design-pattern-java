package com.crabgeek.principle.singleprinciple.impl;

import com.crabgeek.principle.singleprinciple.IVideoUserService;

public class GustVideoUserServiceImpl implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("访问客户，480p高清视频");
    }

    @Override
    public void advertisement() {
        System.out.println("访问客户，视频有广告");
    }
}
