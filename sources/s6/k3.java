package s6;

import u6.d;

/* JADX INFO: loaded from: classes.dex */
public class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f20177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f20178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f20179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f20181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20182g;

    public k3(String str, d.a aVar, String str2, String str3) {
        this.f20176a = str;
        this.f20177b = aVar.b();
        this.f20180e = str2;
        String[] strArrC = aVar.c();
        this.f20178c = strArrC;
        this.f20179d = aVar.a() == null ? new String[0] : aVar.a();
        this.f20181f = str3;
        this.f20182g = strArrC.length > 0 ? strArrC[0] : null;
    }

    public String[] a() {
        return this.f20177b;
    }

    public String[] b() {
        return this.f20178c;
    }

    public String[] c() {
        return this.f20179d;
    }

    public String d() {
        return this.f20181f;
    }

    public String e() {
        return this.f20176a;
    }

    public String f() {
        return this.f20182g;
    }

    public String g() {
        return this.f20180e;
    }
}
