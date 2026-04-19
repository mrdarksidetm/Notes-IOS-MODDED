package e8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements y7.b<t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ld.a<Context> f10774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ld.a<String> f10775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ld.a<Integer> f10776c;

    public u0(ld.a<Context> aVar, ld.a<String> aVar2, ld.a<Integer> aVar3) {
        this.f10774a = aVar;
        this.f10775b = aVar2;
        this.f10776c = aVar3;
    }

    public static u0 a(ld.a<Context> aVar, ld.a<String> aVar2, ld.a<Integer> aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i10) {
        return new t0(context, str, i10);
    }

    @Override // ld.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c(this.f10774a.get(), this.f10775b.get(), this.f10776c.get().intValue());
    }
}
