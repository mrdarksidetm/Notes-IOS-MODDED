package b2;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class o<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f5382a;

    public o(Comparator comparator) {
        this.f5382a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        int iCompare = this.f5382a.compare(t10, t11);
        return iCompare != 0 ? iCompare : pd.b.a(Integer.valueOf(((g2.p) t10).n()), Integer.valueOf(((g2.p) t11).n()));
    }
}
