package s6;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f20338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f20339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q3 f20340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f20341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o3 f20342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0 f20343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f20344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t1 f20345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s3 f20346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o1 f20347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f20348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f20349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u2 f20350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k1 f20351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m2 f20352o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h3 f20353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u6.k f20354q;

    public v1(Context context, w2 w2Var, h3 h3Var, g0 g0Var, u6.d dVar, u6.k kVar) {
        this.f20350m = null;
        this.f20351n = null;
        this.f20353p = h3Var;
        this.f20354q = kVar;
        u1 u1VarA = u1.a(context);
        this.f20338a = new d0(h3Var, w2Var, kVar, new h0(context));
        this.f20339b = new c1(h3Var, w2Var, kVar);
        this.f20340c = new q3(h3Var, w2Var, kVar);
        this.f20341d = new x(h3Var, w2Var, kVar);
        this.f20342e = new o3(h3Var, w2Var, kVar, g0Var.e(), dVar);
        this.f20343f = new x0(h3Var, w2Var, kVar, g0Var.e());
        this.f20344g = new d(h3Var, context);
        this.f20345h = new t1(h3Var, kVar, context, g0Var.c());
        this.f20351n = new k1(context, w2Var, kVar);
        this.f20346i = new s3(h3Var, kVar);
        if (u1VarA != null) {
            this.f20350m = new u2(u1VarA, w2Var, kVar);
        }
        this.f20347j = new o1(h3Var, kVar);
        this.f20348k = new f(h3Var, kVar);
        this.f20349l = new k(h3Var, kVar);
    }

    public void a(g2 g2Var, o oVar) {
        if (this.f20352o != null || g2Var == null) {
            return;
        }
        this.f20352o = new m2(this.f20353p, this.f20354q, g2Var, oVar);
    }

    public List<j1> b() {
        return new ArrayList(Arrays.asList(this.f20342e, this.f20339b, this.f20343f, this.f20340c, this.f20338a, this.f20341d, this.f20346i, this.f20351n, this.f20350m, this.f20345h, this.f20344g, this.f20347j, this.f20348k, this.f20349l));
    }
}
