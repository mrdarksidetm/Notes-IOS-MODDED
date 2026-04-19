package androidx.compose.animation;

import ae.r;
import b0.b0;
import b0.n;
import b0.u;
import nd.r0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2176a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h f2177b = new i(new b0(null, null, null, null, false, null, 63, null));

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final h a() {
            return h.f2177b;
        }
    }

    private h() {
    }

    public /* synthetic */ h(ae.j jVar) {
        this();
    }

    public abstract b0 b();

    public final h c(h hVar) {
        n nVarC = b().c();
        if (nVarC == null) {
            nVarC = hVar.b().c();
        }
        n nVar = nVarC;
        b().f();
        hVar.b().f();
        b0.h hVarA = b().a();
        if (hVarA == null) {
            hVarA = hVar.b().a();
        }
        b0.h hVar2 = hVarA;
        u uVarE = b().e();
        if (uVarE == null) {
            uVarE = hVar.b().e();
        }
        return new i(new b0(nVar, null, hVar2, uVarE, false, r0.l(b().b(), hVar.b().b()), 16, null));
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && r.b(((h) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        if (r.b(this, f2177b)) {
            return "EnterTransition.None";
        }
        b0 b0VarB = b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("EnterTransition: \nFade - ");
        n nVarC = b0VarB.c();
        sb2.append(nVarC != null ? nVarC.toString() : null);
        sb2.append(",\nSlide - ");
        b0VarB.f();
        sb2.append((String) null);
        sb2.append(",\nShrink - ");
        b0.h hVarA = b0VarB.a();
        sb2.append(hVarA != null ? hVarA.toString() : null);
        sb2.append(",\nScale - ");
        u uVarE = b0VarB.e();
        sb2.append(uVarE != null ? uVarE.toString() : null);
        return sb2.toString();
    }
}
