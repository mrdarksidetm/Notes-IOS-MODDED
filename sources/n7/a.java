package n7;

import ae.r;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15934a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseArray<o7.a> f15935b = new SparseArray<>();

    private a() {
    }

    public final o7.a a(int i10) {
        return f15935b.get(i10);
    }

    public final void b(o7.a aVar) {
        r.f(aVar, "handler");
        f15935b.append(aVar.getType(), aVar);
    }
}
