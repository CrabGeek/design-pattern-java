package com.crabgeek.principle.dependenceInversionPrinciple;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class DrawControl {
    private IDraw draw;

    public List<BetUser> doDraw(List<BetUser> betUserList, int count) {
        return draw.prize(betUserList, count);
    }
}
