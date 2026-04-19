package com.revenuecat.purchases.subscriberattributes;

import ae.j;
import ae.r;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.subscriberattributes.SpecialSubscriberAttributesKt;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Date;
import java.util.Map;
import md.x;
import nd.r0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberAttribute {
    private final DateProvider dateProvider;
    private final boolean isSynced;
    private final SubscriberAttributeKey key;
    private final Date setTime;
    private final String value;

    public SubscriberAttribute(SubscriberAttributeKey subscriberAttributeKey, String str, DateProvider dateProvider, Date date, boolean z10) {
        r.f(subscriberAttributeKey, SubscriberAttributeKt.JSON_NAME_KEY);
        r.f(dateProvider, "dateProvider");
        r.f(date, "setTime");
        this.key = subscriberAttributeKey;
        this.value = str;
        this.dateProvider = dateProvider;
        this.setTime = date;
        this.isSynced = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubscriberAttribute(SubscriberAttributeKey subscriberAttributeKey, String str, DateProvider dateProvider, Date date, boolean z10, int i10, j jVar) {
        DateProvider defaultDateProvider = (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider;
        this(subscriberAttributeKey, str, defaultDateProvider, (i10 & 8) != 0 ? defaultDateProvider.getNow() : date, (i10 & 16) != 0 ? false : z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriberAttribute(String str, String str2, DateProvider dateProvider, Date date, boolean z10) {
        this(SpecialSubscriberAttributesKt.getSubscriberAttributeKey(str), str2, (DateProvider) null, date, z10, 4, (j) null);
        r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        r.f(dateProvider, "dateProvider");
        r.f(date, "setTime");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubscriberAttribute(String str, String str2, DateProvider dateProvider, Date date, boolean z10, int i10, j jVar) {
        DateProvider defaultDateProvider = (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider;
        this(str, str2, defaultDateProvider, (i10 & 8) != 0 ? defaultDateProvider.getNow() : date, (i10 & 16) != 0 ? false : z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SubscriberAttribute(JSONObject jSONObject) throws JSONException {
        r.f(jSONObject, "jsonObject");
        String string = jSONObject.getString(SubscriberAttributeKt.JSON_NAME_KEY);
        r.e(string, "jsonObject.getString(JSON_NAME_KEY)");
        this(SpecialSubscriberAttributesKt.getSubscriberAttributeKey(string), JSONObjectExtensionsKt.getNullableString(jSONObject, "value"), (DateProvider) null, new Date(jSONObject.getLong(SubscriberAttributeKt.JSON_NAME_SET_TIME)), jSONObject.getBoolean(SubscriberAttributeKt.JSON_NAME_IS_SYNCED), 4, (j) null);
    }

    public static /* synthetic */ SubscriberAttribute copy$default(SubscriberAttribute subscriberAttribute, SubscriberAttributeKey subscriberAttributeKey, String str, DateProvider dateProvider, Date date, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            subscriberAttributeKey = subscriberAttribute.key;
        }
        if ((i10 & 2) != 0) {
            str = subscriberAttribute.value;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            dateProvider = subscriberAttribute.dateProvider;
        }
        DateProvider dateProvider2 = dateProvider;
        if ((i10 & 8) != 0) {
            date = subscriberAttribute.setTime;
        }
        Date date2 = date;
        if ((i10 & 16) != 0) {
            z10 = subscriberAttribute.isSynced;
        }
        return subscriberAttribute.copy(subscriberAttributeKey, str2, dateProvider2, date2, z10);
    }

    public final SubscriberAttributeKey component1() {
        return this.key;
    }

    public final String component2() {
        return this.value;
    }

    public final DateProvider component3() {
        return this.dateProvider;
    }

    public final Date component4() {
        return this.setTime;
    }

    public final boolean component5() {
        return this.isSynced;
    }

    public final SubscriberAttribute copy(SubscriberAttributeKey subscriberAttributeKey, String str, DateProvider dateProvider, Date date, boolean z10) {
        r.f(subscriberAttributeKey, SubscriberAttributeKt.JSON_NAME_KEY);
        r.f(dateProvider, "dateProvider");
        r.f(date, "setTime");
        return new SubscriberAttribute(subscriberAttributeKey, str, dateProvider, date, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r.b(SubscriberAttribute.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        r.d(obj, "null cannot be cast to non-null type com.revenuecat.purchases.subscriberattributes.SubscriberAttribute");
        SubscriberAttribute subscriberAttribute = (SubscriberAttribute) obj;
        return r.b(this.key, subscriberAttribute.key) && r.b(this.value, subscriberAttribute.value) && r.b(this.setTime, subscriberAttribute.setTime) && this.isSynced == subscriberAttribute.isSynced;
    }

    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final SubscriberAttributeKey getKey() {
        return this.key;
    }

    public final Date getSetTime() {
        return this.setTime;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        String str = this.value;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.setTime.hashCode()) * 31) + Boolean.hashCode(this.isSynced);
    }

    public final boolean isSynced() {
        return this.isSynced;
    }

    public final Map<String, Object> toBackendMap() {
        return r0.h(x.a("value", this.value), x.a(SubscriberAttributeKt.BACKEND_NAME_TIMESTAMP, Long.valueOf(this.setTime.getTime())));
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SubscriberAttributeKt.JSON_NAME_KEY, this.key.getBackendKey());
        String str = this.value;
        if (str == null || jSONObject.put("value", str) == null) {
            jSONObject.put("value", JSONObject.NULL);
        }
        jSONObject.put(SubscriberAttributeKt.JSON_NAME_SET_TIME, this.setTime.getTime());
        jSONObject.put(SubscriberAttributeKt.JSON_NAME_IS_SYNCED, this.isSynced);
        return jSONObject;
    }

    public String toString() {
        return "SubscriberAttribute(key=" + this.key + ", value=" + this.value + ", setTime=" + this.setTime + ", isSynced=" + this.isSynced + ')';
    }
}
