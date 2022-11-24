package com.crabgeek.principle.dependenceInversionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class DrawWeightRank implements IDraw{
    @Override
    public List<BetUser> prize(List<BetUser> list, int count) {
        list.sort((o1, o2) ->{
            int e = o1.getUserWeight() - o2.getUserWeight();
            if (0 == e) return 0;
            return e > 0 ? 1 : -1;
        });
        List<BetUser> prizeList = new ArrayList<>(count);
        for (int i = 0; i < list.size(); i++) {
            prizeList.add(list.get(i));
        }
        return prizeList;
    }
}
