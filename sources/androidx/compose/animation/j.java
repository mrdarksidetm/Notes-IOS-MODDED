package androidx.compose.animation;

import ae.r;
import b0.b0;
import b0.n;
import b0.u;
import b0.x;
import java.util.Map;
import nd.r0;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2179a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j f2180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j f2181c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final j a() {
            return j.f2180b;
        }
    }

    static {
        n nVar = null;
        x xVar = null;
        b0.h hVar = null;
        u uVar = null;
        Map map = null;
        ae.j jVar = null;
        f2180b = new k(new b0(nVar, xVar, hVar, uVar, false, map, 63, jVar));
        f2181c = new k(new b0(nVar, xVar, hVar, uVar, true, map, 47, jVar));
    }

    private j() {
    }

    public /* synthetic */ j(ae.j jVar) {
        this();
    }

    public abstract b0 b();

    public final j c(j jVar) {
        n nVarC = b().c();
        if (nVarC == null) {
            nVarC = jVar.b().c();
        }
        n nVar = nVarC;
        b().f();
        jVar.b().f();
        b0.h hVarA = b().a();
        if (hVarA == null) {
            hVarA = jVar.b().a();
        }
        b0.h hVar = hVarA;
        u uVarE = b().e();
        if (uVarE == null) {
            uVarE = jVar.b().e();
        }
        return new k(new b0(nVar, null, hVar, uVarE, b().d() || jVar.b().d(), r0.l(b().b(), jVar.b().b())));
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && r.b(((j) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        if (r.b(this, f2180b)) {
            return "ExitTransition.None";
        }
        if (r.b(this, f2181c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        b0 b0VarB = b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExitTransition: \nFade - ");
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
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(b0VarB.d());
        return sb2.toString();
    }
}
