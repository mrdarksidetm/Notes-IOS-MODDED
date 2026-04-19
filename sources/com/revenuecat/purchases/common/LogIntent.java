package com.revenuecat.purchases.common;

import com.revenuecat.purchases.strings.Emojis;
import java.util.List;
import nd.t;
import nd.u;

/* JADX INFO: loaded from: classes2.dex */
public enum LogIntent {
    DEBUG(t.d(Emojis.INFO)),
    GOOGLE_ERROR(u.p(Emojis.ROBOT, Emojis.DOUBLE_EXCLAMATION)),
    GOOGLE_WARNING(u.p(Emojis.ROBOT, Emojis.DOUBLE_EXCLAMATION)),
    INFO(t.d(Emojis.INFO)),
    PURCHASE(t.d(Emojis.MONEY_BAG)),
    RC_ERROR(u.p(Emojis.SAD_CAT_EYES, Emojis.DOUBLE_EXCLAMATION)),
    RC_PURCHASE_SUCCESS(u.p(Emojis.HEART_CAT_EYES, Emojis.MONEY_BAG)),
    RC_SUCCESS(t.d(Emojis.HEART_CAT_EYES)),
    USER(t.d(Emojis.PERSON)),
    WARNING(t.d(Emojis.WARNING)),
    AMAZON_WARNING(u.p(Emojis.BOX, Emojis.DOUBLE_EXCLAMATION)),
    AMAZON_ERROR(u.p(Emojis.BOX, Emojis.DOUBLE_EXCLAMATION));

    private final List<String> emojiList;

    LogIntent(List list) {
        this.emojiList = list;
    }

    public final List<String> getEmojiList() {
        return this.emojiList;
    }
}
