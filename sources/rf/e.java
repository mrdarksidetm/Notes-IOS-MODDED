package rf;

import uf.a0;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f19480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf.l f19481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sf.l f19482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f19484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f19485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19486g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19487h = false;

    private e(a0 a0Var, sf.l lVar, sf.l lVar2, e eVar, f fVar, boolean z10) {
        this.f19480a = a0Var;
        this.f19481b = lVar;
        this.f19482c = lVar2;
        this.f19483d = z10;
        this.f19484e = eVar;
        this.f19485f = fVar;
    }

    public static e a(a0 a0Var, sf.l lVar, sf.l lVar2, e eVar, f fVar) {
        return new e(a0Var, lVar, lVar2, eVar, fVar, true);
    }

    public static e b(a0 a0Var, sf.l lVar, sf.l lVar2, e eVar, f fVar) {
        return new e(a0Var, lVar, lVar2, eVar, fVar, false);
    }
}
