package com.amazon.device.iap.model;

/* JADX INFO: loaded from: classes.dex */
public final class CoinsReward {
    private final int amount;

    protected CoinsReward(int i10) {
        this.amount = i10;
    }

    protected static final CoinsReward from(int i10) {
        if (i10 > 0) {
            return new CoinsReward(i10);
        }
        return null;
    }

    public int getAmount() {
        return this.amount;
    }
}
