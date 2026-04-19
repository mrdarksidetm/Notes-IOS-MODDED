package com.revenuecat.purchases.subscriberattributes;

import ae.r;
import ae.s;
import ie.m;
import ie.o;
import java.util.Iterator;
import java.util.Map;
import md.x;
import nd.r0;
import org.json.JSONException;
import org.json.JSONObject;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberAttributesFactoriesKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt$buildSubscriberAttributesMap$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<String, md.s<? extends String, ? extends SubscriberAttribute>> {
        final /* synthetic */ JSONObject $this_buildSubscriberAttributesMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JSONObject jSONObject) {
            super(1);
            this.$this_buildSubscriberAttributesMap = jSONObject;
        }

        @Override // zd.l
        public final md.s<String, SubscriberAttribute> invoke(String str) throws JSONException {
            Object obj = this.$this_buildSubscriberAttributesMap.get(str);
            r.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
            return x.a(str, new SubscriberAttribute((JSONObject) obj));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt$buildSubscriberAttributesMapPerUser$1, reason: invalid class name and case insensitive filesystem */
    static final class C06101 extends s implements l<String, md.s<? extends String, ? extends Map<String, ? extends SubscriberAttribute>>> {
        final /* synthetic */ JSONObject $attributesJSONObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06101(JSONObject jSONObject) {
            super(1);
            this.$attributesJSONObject = jSONObject;
        }

        @Override // zd.l
        public final md.s<String, Map<String, SubscriberAttribute>> invoke(String str) throws JSONException {
            Object obj = this.$attributesJSONObject.get(str);
            r.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
            return x.a(str, SubscriberAttributesFactoriesKt.buildSubscriberAttributesMap((JSONObject) obj));
        }
    }

    public static final Map<String, SubscriberAttribute> buildLegacySubscriberAttributes(JSONObject jSONObject) throws JSONException {
        r.f(jSONObject, "<this>");
        JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
        r.e(jSONObject2, "attributesJSONObject");
        return buildSubscriberAttributesMap(jSONObject2);
    }

    public static final Map<String, SubscriberAttribute> buildSubscriberAttributesMap(JSONObject jSONObject) {
        r.f(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        r.e(itKeys, "this.keys()");
        return r0.p(o.s(m.c(itKeys), new AnonymousClass1(jSONObject)));
    }

    public static final Map<String, Map<String, SubscriberAttribute>> buildSubscriberAttributesMapPerUser(JSONObject jSONObject) throws JSONException {
        r.f(jSONObject, "<this>");
        JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
        Iterator<String> itKeys = jSONObject2.keys();
        r.e(itKeys, "attributesJSONObject.keys()");
        return r0.p(o.s(m.c(itKeys), new C06101(jSONObject2)));
    }
}
