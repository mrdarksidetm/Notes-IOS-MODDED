package s6;

import android.content.Context;
import u6.d;

/* JADX INFO: loaded from: classes.dex */
public class k0 implements g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile k0 f20159h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k3 f20163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f2 f20165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f20166g = new a0();

    public k0(String str, String str2, String str3, k3 k3Var, String str4, f2 f2Var) {
        this.f20160a = str;
        this.f20161b = str2;
        this.f20162c = str3;
        this.f20163d = k3Var;
        this.f20164e = str4;
        this.f20165f = f2Var;
    }

    public static k0 c(e3 e3Var, t6.e eVar, Context context, d.a aVar) {
        if (f20159h == null) {
            synchronized (k0.class) {
                if (f20159h == null) {
                    String strA = y0.a();
                    k2 k2VarA = k2.f20169e.a(context);
                    k3 k3Var = new k3(context.getPackageName(), aVar, g0.a(context), g0.b(context));
                    d1 d1VarB = e3Var.b();
                    d1VarB.getClass();
                    f20159h = new k0(d1VarB.f20043h, e3Var.a().l(), strA, k3Var, eVar.h(), k2VarA);
                }
            }
        }
        return f20159h;
    }

    @Override // s6.g0
    public a0 a() {
        return this.f20166g;
    }

    @Override // s6.g0
    public String b() {
        return this.f20162c;
    }

    @Override // s6.g0
    public f2 c() {
        return this.f20165f;
    }

    @Override // s6.g0
    public String d() {
        return this.f20160a;
    }

    @Override // s6.g0
    public k3 e() {
        return this.f20163d;
    }

    @Override // s6.g0
    public String f() {
        return this.f20164e;
    }

    @Override // s6.g0
    public String g() {
        return this.f20161b;
    }
}
