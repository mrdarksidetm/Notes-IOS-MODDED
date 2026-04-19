package b0;

import a2.r0;
import androidx.compose.ui.e;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f5037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f5038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f5039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f5040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Object, r0<? extends e.c>> f5041e;

    public b0() {
        this(null, null, null, null, false, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(n nVar, x xVar, h hVar, u uVar, boolean z10, Map<Object, ? extends r0<? extends e.c>> map) {
        this.f5037a = nVar;
        this.f5038b = hVar;
        this.f5039c = uVar;
        this.f5040d = z10;
        this.f5041e = map;
    }

    public /* synthetic */ b0(n nVar, x xVar, h hVar, u uVar, boolean z10, Map map, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? null : nVar, (i10 & 2) != 0 ? null : xVar, (i10 & 4) != 0 ? null : hVar, (i10 & 8) == 0 ? uVar : null, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? nd.r0.e() : map);
    }

    public final h a() {
        return this.f5038b;
    }

    public final Map<Object, r0<? extends e.c>> b() {
        return this.f5041e;
    }

    public final n c() {
        return this.f5037a;
    }

    public final boolean d() {
        return this.f5040d;
    }

    public final u e() {
        return this.f5039c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return ae.r.b(this.f5037a, b0Var.f5037a) && ae.r.b(null, null) && ae.r.b(this.f5038b, b0Var.f5038b) && ae.r.b(this.f5039c, b0Var.f5039c) && this.f5040d == b0Var.f5040d && ae.r.b(this.f5041e, b0Var.f5041e);
    }

    public final x f() {
        return null;
    }

    public int hashCode() {
        n nVar = this.f5037a;
        int iHashCode = (((nVar == null ? 0 : nVar.hashCode()) * 31) + 0) * 31;
        h hVar = this.f5038b;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        u uVar = this.f5039c;
        return ((((iHashCode2 + (uVar != null ? uVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f5040d)) * 31) + this.f5041e.hashCode();
    }

    public String toString() {
        return "TransitionData(fade=" + this.f5037a + ", slide=" + ((Object) null) + ", changeSize=" + this.f5038b + ", scale=" + this.f5039c + ", hold=" + this.f5040d + ", effectsMap=" + this.f5041e + ')';
    }
}
