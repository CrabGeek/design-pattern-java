package com.crabgeek.principle.dependenceInversionPrinciple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DrawTest {
    @Test
    public void test_DrawControl() {
        List<BetUser> betUserList = new ArrayList<>();
        betUserList.add(new BetUser("花花", 65));
        betUserList.add(new BetUser("豆豆", 43));
        betUserList.add(new BetUser("小白", 72));
        betUserList.add(new BetUser("笨笨", 89));
        betUserList.add(new BetUser("丑蛋", 89));

        DrawControl drawControlRandom = new DrawControl(new DrawRandom());
        DrawControl drawControlWeight = new DrawControl(new DrawWeightRank());

        List<BetUser> betUserList1 = drawControlRandom.doDraw(betUserList, 3);
        System.out.println(String.format("随机抽奖, 中奖用户名单 %s", betUserList1.toString()));

        List<BetUser> betUserList2 = drawControlWeight.doDraw(betUserList, 3);
        System.out.println(String.format("权重抽奖，中奖用户名单 %s", betUserList2.toString()));
    }
}
