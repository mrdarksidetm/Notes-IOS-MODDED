package cf;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<ye.f> f7017a = nd.y0.d(xe.a.B(md.a0.f15536b).getDescriptor(), xe.a.C(md.c0.f15542b).getDescriptor(), xe.a.A(md.y.f15587b).getDescriptor(), xe.a.D(md.f0.f15552b).getDescriptor());

    public static final boolean a(ye.f fVar) {
        ae.r.f(fVar, "<this>");
        return fVar.isInline() && ae.r.b(fVar, bf.i.p());
    }

    public static final boolean b(ye.f fVar) {
        ae.r.f(fVar, "<this>");
        return fVar.isInline() && f7017a.contains(fVar);
    }
}
