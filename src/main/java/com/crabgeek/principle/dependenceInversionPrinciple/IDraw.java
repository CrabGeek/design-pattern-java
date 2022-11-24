package com.crabgeek.principle.dependenceInversionPrinciple;

import java.util.List;

public interface IDraw {
    List<BetUser> prize(List<BetUser> list, int count);
}
