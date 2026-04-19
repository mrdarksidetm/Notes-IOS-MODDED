package x7;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class l implements y7.b<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ld.a<Context> f23077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ld.a<i> f23078b;

    public l(ld.a<Context> aVar, ld.a<i> aVar2) {
        this.f23077a = aVar;
        this.f23078b = aVar2;
    }

    public static l a(ld.a<Context> aVar, ld.a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // ld.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f23077a.get(), this.f23078b.get());
    }
}
