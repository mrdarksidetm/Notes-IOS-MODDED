package l0;

import k1.l;
import l1.b1;
import l1.t1;
import w2.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f14479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f14480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f14481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f14482d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f14479a = bVar;
        this.f14480b = bVar2;
        this.f14481c = bVar3;
        this.f14482d = bVar4;
    }

    public static /* synthetic */ a b(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            bVar = aVar.f14479a;
        }
        if ((i10 & 2) != 0) {
            bVar2 = aVar.f14480b;
        }
        if ((i10 & 4) != 0) {
            bVar3 = aVar.f14481c;
        }
        if ((i10 & 8) != 0) {
            bVar4 = aVar.f14482d;
        }
        return aVar.a(bVar, bVar2, bVar3, bVar4);
    }

    public abstract a a(b bVar, b bVar2, b bVar3, b bVar4);

    public abstract b1 c(long j10, float f10, float f11, float f12, float f13, r rVar);

    @Override // l1.t1
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final b1 mo253createOutlinePq9zytI(long j10, r rVar, w2.d dVar) {
        float fA = this.f14479a.a(j10, dVar);
        float fA2 = this.f14480b.a(j10, dVar);
        float fA3 = this.f14481c.a(j10, dVar);
        float fA4 = this.f14482d.a(j10, dVar);
        float fH = l.h(j10);
        float f10 = fA + fA4;
        if (f10 > fH) {
            float f11 = fH / f10;
            fA *= f11;
            fA4 *= f11;
        }
        float f12 = fA4;
        float f13 = fA2 + fA3;
        if (f13 > fH) {
            float f14 = fH / f13;
            fA2 *= f14;
            fA3 *= f14;
        }
        if (fA >= 0.0f && fA2 >= 0.0f && fA3 >= 0.0f && f12 >= 0.0f) {
            return c(j10, fA, fA2, fA3, f12, rVar);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + f12 + ")!").toString());
    }

    public final b d() {
        return this.f14481c;
    }

    public final b e() {
        return this.f14482d;
    }

    public final b f() {
        return this.f14480b;
    }

    public final b g() {
        return this.f14479a;
    }
}
