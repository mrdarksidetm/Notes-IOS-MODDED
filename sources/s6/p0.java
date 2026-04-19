package s6;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f20248a = new p0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static s f20249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static s f20250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static s f20251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f20252e;

    public final void a() {
        s sVar = f20249b;
        if (sVar == null) {
            ae.r.t(f1.a("542C0A6BA2264B7381045246257E"));
            sVar = null;
        }
        sVar.c();
    }

    public final synchronized void b(Context context) {
        ae.r.f(context, f1.a("542B017CAC3B5B"));
        if (!f20252e) {
            f20249b = new s(context, f1.b(f1.c("6D051B47AA09554AA13F")), new String[]{f1.b(f1.c("45341B39")), f1.b(f1.c("65341B39")), f1.b(f1.c("45141B39")), f1.b(f1.c("65141B39")), f1.b(f1.c("45343B39")), f1.b(f1.c("65343B39")), f1.b(f1.c("45143B39")), f1.b(f1.c("65143B39")), f1.b(f1.c("45341B3A")), f1.b(f1.c("65341B3A")), f1.b(f1.c("45141B3A")), f1.b(f1.c("65141B3A")), f1.b(f1.c("45343B3A")), f1.b(f1.c("65343B3A")), f1.b(f1.c("45143B3A")), f1.b(f1.c("65143B3A")), f1.b(f1.c("45341B3B")), f1.b(f1.c("65341B3B")), f1.b(f1.c("45141B3B")), f1.b(f1.c("65141B3B")), f1.b(f1.c("45343B3B")), f1.b(f1.c("65343B3B")), f1.b(f1.c("45143B3B")), f1.b(f1.c("65143B3B")), f1.b(f1.c("45341B3C")), f1.b(f1.c("65341B3C")), f1.b(f1.c("45141B3C")), f1.b(f1.c("65141B3C")), f1.b(f1.c("45343B3C")), f1.b(f1.c("65343B3C")), f1.b(f1.c("45143B3C")), f1.b(f1.c("65143B3C"))});
            f20250c = new s(context, f1.b(f1.c("6D033B52831243478A36")), new String[]{f1.b(f1.c("40281B39")), f1.b(f1.c("60281B39")), f1.b(f1.c("40081B39")), f1.b(f1.c("60081B39")), f1.b(f1.c("40283B39")), f1.b(f1.c("60283B39")), f1.b(f1.c("40083B39")), f1.b(f1.c("60083B39")), f1.b(f1.c("40281B3A")), f1.b(f1.c("60281B3A")), f1.b(f1.c("40081B3A")), f1.b(f1.c("60081B3A")), f1.b(f1.c("40283B3A")), f1.b(f1.c("60283B3A")), f1.b(f1.c("40083B3A")), f1.b(f1.c("60083B3A")), f1.b(f1.c("40281B3B")), f1.b(f1.c("60281B3B")), f1.b(f1.c("40081B3B")), f1.b(f1.c("60081B3B")), f1.b(f1.c("40283B3B")), f1.b(f1.c("60283B3B")), f1.b(f1.c("40083B3B")), f1.b(f1.c("60083B3B")), f1.b(f1.c("40281B3C")), f1.b(f1.c("60281B3C")), f1.b(f1.c("40081B3C")), f1.b(f1.c("60081B3C")), f1.b(f1.c("40283B3C")), f1.b(f1.c("60283B3C")), f1.b(f1.c("40083B3C")), f1.b(f1.c("60083B3C"))});
            f20251d = new s(context, f1.b(f1.c("660F1A60912D49748016")), new String[]{f1.b(f1.c("51321D39")), f1.b(f1.c("71321D39")), f1.b(f1.c("51121D39")), f1.b(f1.c("71121B39")), f1.b(f1.c("51323D39")), f1.b(f1.c("71363939")), f1.b(f1.c("51123D39")), f1.b(f1.c("71123D39")), f1.b(f1.c("51321D3A")), f1.b(f1.c("71321D3A")), f1.b(f1.c("51121D3A")), f1.b(f1.c("71121B3A")), f1.b(f1.c("51323D3A")), f1.b(f1.c("7136393A")), f1.b(f1.c("51123D3A")), f1.b(f1.c("71123D3A")), f1.b(f1.c("51321D3B")), f1.b(f1.c("71321D3B")), f1.b(f1.c("51121D3B")), f1.b(f1.c("71121B3B")), f1.b(f1.c("51323D3B")), f1.b(f1.c("7136393B")), f1.b(f1.c("51123D3B")), f1.b(f1.c("71123D3B")), f1.b(f1.c("51321D3C")), f1.b(f1.c("71321D3C")), f1.b(f1.c("51121D3C")), f1.b(f1.c("71121B3C")), f1.b(f1.c("51323D3C")), f1.b(f1.c("7136393C")), f1.b(f1.c("51123D3C")), f1.b(f1.c("71123D3C"))});
            f20252e = true;
        }
    }

    public final void c(String str) {
        ae.r.f(str, f1.a("47250C63A8244A6F851958"));
        s sVar = f20250c;
        if (sVar == null) {
            ae.r.t(f1.b(f1.c("402C067CAC2F465290")));
            sVar = null;
        }
        sVar.f(str, f1.b(f1.c("06")));
    }

    public final void d(String str, long j10) {
        ae.r.f(str, f1.a("47250C63A8244A6F851958"));
        s sVar = f20249b;
        if (sVar == null) {
            ae.r.t(f1.b(f1.c("542C0A6BA2264B7381045246257E")));
            sVar = null;
        }
        sVar.f(str, String.valueOf(j10));
    }

    public final String e(String str) {
        ae.r.f(str, f1.a("53251B69"));
        s sVar = f20251d;
        if (sVar == null) {
            ae.r.t(f1.b(f1.c("51360A6DBB225C51A6185C573A611521EB344F5D6F193D66")));
            sVar = null;
        }
        return sVar.k(str);
    }

    public final void f() {
        s sVar = f20250c;
        if (sVar == null) {
            ae.r.t(f1.a("402C067CAC2F465290"));
            sVar = null;
        }
        sVar.c();
    }

    public final boolean g(String str, long j10) {
        ae.r.f(str, f1.a("47250C63A8244A6F851958"));
        s sVar = f20249b;
        if (sVar == null) {
            ae.r.t(f1.b(f1.c("542C0A6BA2264B7381045246257E")));
            sVar = null;
        }
        return ae.r.b(sVar.k(str), String.valueOf(j10));
    }

    public final boolean h(String str) {
        ae.r.f(str, f1.a("47250C63A8244A6F851958"));
        s sVar = f20250c;
        if (sVar == null) {
            ae.r.t(f1.b(f1.c("402C067CAC2F465290")));
            sVar = null;
        }
        return sVar.h(str);
    }

    public final void i(String str) {
        ae.r.f(str, f1.a("53251B69"));
        s sVar = f20251d;
        s sVar2 = null;
        if (sVar == null) {
            ae.r.t(f1.b(f1.c("51360A6DBB225C51A6185C573A611521EB344F5D6F193D66")));
            sVar = null;
        }
        sVar.c();
        s sVar3 = f20251d;
        if (sVar3 == null) {
            ae.r.t(f1.b(f1.c("51360A6DBB225C51A6185C573A611521EB344F5D6F193D66")));
        } else {
            sVar2 = sVar3;
        }
        sVar2.f(str, f1.b(f1.c("06")));
    }
}
