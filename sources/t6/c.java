package t6;

import android.content.Context;
import com.aheaditec.talsec_security.security.api.Natives;
import s6.f1;
import s6.p0;
import u6.g;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {
    public static void a(Context context, String str) {
        if (str == null) {
            throw new IllegalArgumentException(f1.a("67250C63A8244A6F85195814326C123CF0160A4D79503C7D5CB535"));
        }
        p0 p0Var = p0.f20248a;
        p0Var.b(context);
        p0Var.c(str);
    }

    public static void b(Context context, e eVar) {
        if (context == null) {
            throw new IllegalArgumentException(f1.a("742B017CAC3B5B018715535A3E795C30FA42445A701C7C"));
        }
        if (d.f21271a == null && eVar == null) {
            throw new IllegalArgumentException(f1.a("6325037BAC200F628B1A5B5D362D1F33F10C455B3C1237285EAC777626"));
        }
        Natives.f7025a.a(context);
        d.f21271a = g.a(context, eVar);
    }
}
