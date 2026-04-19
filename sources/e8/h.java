package e8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class h implements y7.b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ld.a<Context> f10724a;

    public h(ld.a<Context> aVar) {
        this.f10724a = aVar;
    }

    public static h a(ld.a<Context> aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) y7.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ld.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f10724a.get());
    }
}
