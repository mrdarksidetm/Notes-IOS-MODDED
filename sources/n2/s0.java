package n2;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import n2.h0;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {
    public static final p0 a() {
        return Build.VERSION.SDK_INT >= 28 ? new q0() : new r0();
    }

    public static final String b(String str, i0 i0Var) {
        StringBuilder sb2;
        String str2;
        int iT = i0Var.t() / 100;
        if (iT >= 0 && iT < 2) {
            sb2 = new StringBuilder();
            sb2.append(str);
            str2 = "-thin";
        } else {
            if (2 <= iT && iT < 4) {
                sb2 = new StringBuilder();
                sb2.append(str);
                str2 = "-light";
            } else {
                if (iT == 4) {
                    return str;
                }
                if (iT == 5) {
                    sb2 = new StringBuilder();
                    sb2.append(str);
                    str2 = "-medium";
                } else {
                    if (6 <= iT && iT < 8) {
                        return str;
                    }
                    if (!(8 <= iT && iT < 11)) {
                        return str;
                    }
                    sb2 = new StringBuilder();
                    sb2.append(str);
                    str2 = "-black";
                }
            }
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public static final Typeface c(Typeface typeface, h0.d dVar, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? y0.f15905a.a(typeface, dVar, context) : typeface;
    }
}
