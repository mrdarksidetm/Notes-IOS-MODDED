package r0;

import ae.j;
import ae.r;
import java.util.List;
import nd.c0;
import nd.u;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f19143b;

    public d() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public d(boolean z10, List<c> list) {
        this.f19142a = z10;
        this.f19143b = list;
    }

    public /* synthetic */ d(boolean z10, List list, int i10, j jVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? u.m() : list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f19142a == dVar.f19142a && r.b(this.f19143b, dVar.f19143b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f19142a) * 31) + this.f19143b.hashCode();
    }

    public String toString() {
        return "Posture(isTabletop=" + this.f19142a + ", hinges=[" + c0.h0(this.f19143b, ", ", null, null, 0, null, null, 62, null) + "])";
    }
}
