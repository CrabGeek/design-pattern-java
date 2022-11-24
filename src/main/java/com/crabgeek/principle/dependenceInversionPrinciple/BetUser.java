package com.crabgeek.principle.dependenceInversionPrinciple;

import lombok.*;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class BetUser {
    @NonNull
    private String userName;
    @NonNull
    private int userWeight;
}
