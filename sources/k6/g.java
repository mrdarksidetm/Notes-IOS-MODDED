package k6;

import ae.r;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class g<T extends View> implements l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f14413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f14414c;

    public g(T t10, boolean z10) {
        this.f14413b = t10;
        this.f14414c = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (r.b(getView(), gVar.getView()) && n() == gVar.n()) {
                return true;
            }
        }
        return false;
    }

    @Override // k6.l
    public T getView() {
        return this.f14413b;
    }

    public int hashCode() {
        return (getView().hashCode() * 31) + Boolean.hashCode(n());
    }

    @Override // k6.l
    public boolean n() {
        return this.f14414c;
    }
}
