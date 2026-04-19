package b2;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class n<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f5376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Comparator f5377b;

    public n(Comparator comparator, Comparator comparator2) {
        this.f5376a = comparator;
        this.f5377b = comparator2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        int iCompare = this.f5376a.compare(t10, t11);
        return iCompare != 0 ? iCompare : this.f5377b.compare(((g2.p) t10).p(), ((g2.p) t11).p());
    }
}
