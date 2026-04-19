package t0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a2<T> extends u<T> {
    public a2(zd.a<? extends T> aVar) {
        super(aVar, null);
    }

    public final b2<T> c(T t10) {
        return new b2<>(this, t10, true);
    }

    public final b2<T> d(T t10) {
        return new b2<>(this, t10, false);
    }
}
