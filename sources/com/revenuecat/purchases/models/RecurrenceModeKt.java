package com.revenuecat.purchases.models;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public final class RecurrenceModeKt {
    public static final RecurrenceMode toRecurrenceMode(Integer num) {
        RecurrenceMode recurrenceMode;
        RecurrenceMode[] recurrenceModeArrValues = RecurrenceMode.values();
        int length = recurrenceModeArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                recurrenceMode = null;
                break;
            }
            recurrenceMode = recurrenceModeArrValues[i10];
            if (r.b(recurrenceMode.getIdentifier(), num)) {
                break;
            }
            i10++;
        }
        return recurrenceMode == null ? RecurrenceMode.UNKNOWN : recurrenceMode;
    }
}
