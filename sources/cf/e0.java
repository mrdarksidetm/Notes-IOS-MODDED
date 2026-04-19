package cf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {
    public static final a0 a(Number number, String str, String str2) {
        ae.r.f(number, "value");
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(str2, "output");
        return e(-1, k(number, str, str2));
    }

    public static final c0 b(Number number, String str) {
        ae.r.f(number, "value");
        ae.r.f(str, "output");
        return new c0("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(str, 0, 1, null)));
    }

    public static final c0 c(Number number, String str, String str2) {
        ae.r.f(number, "value");
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(str2, "output");
        return new c0(k(number, str, str2));
    }

    public static final c0 d(ye.f fVar) {
        ae.r.f(fVar, "keyDescriptor");
        return new c0("Value of type '" + fVar.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + fVar.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final a0 e(int i10, String str) {
        ae.r.f(str, "message");
        if (i10 >= 0) {
            str = "Unexpected JSON token at offset " + i10 + ": " + str;
        }
        return new a0(str);
    }

    public static final a0 f(int i10, String str, CharSequence charSequence) {
        ae.r.f(str, "message");
        ae.r.f(charSequence, "input");
        return e(i10, str + "\nJSON input: " + ((Object) h(charSequence, i10)));
    }

    public static final a0 g(String str, String str2) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(str2, "input");
        return e(-1, "Encountered an unknown key '" + str + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) i(str2, 0, 1, null)));
    }

    private static final CharSequence h(CharSequence charSequence, int i10) {
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i10 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i11 = i10 - 30;
        int i12 = i10 + 30;
        return (i11 <= 0 ? "" : ".....") + charSequence.subSequence(ge.o.d(i11, 0), ge.o.h(i12, charSequence.length())).toString() + (i12 >= charSequence.length() ? "" : ".....");
    }

    static /* synthetic */ CharSequence i(CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        return h(charSequence, i10);
    }

    public static final Void j(a aVar, Number number) {
        ae.r.f(aVar, "<this>");
        ae.r.f(number, "result");
        a.y(aVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new md.i();
    }

    private static final String k(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(str2, 0, 1, null));
    }
}
