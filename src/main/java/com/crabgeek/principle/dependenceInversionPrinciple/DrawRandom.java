package com.crabgeek.principle.dependenceInversionPrinciple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrawRandom implements IDraw{
    @Override
    public List<BetUser> prize(List<BetUser> list, int count) {
        if (list.size() < count) {
            return list;
        }
        Collections.shuffle(list);
        List<BetUser> prizeList = new ArrayList<>(count);
        for (int i = 0; i < list.size(); i++) {
            prizeList.add(list.get(i));
        }
        return prizeList;
    }
}
