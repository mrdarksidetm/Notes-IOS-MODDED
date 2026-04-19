package k6;

import ae.r;
import android.content.Context;
import android.util.DisplayMetrics;
import k6.c;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f14407b;

    public d(Context context) {
        this.f14407b = context;
    }

    @Override // k6.j
    public Object c(qd.d<? super i> dVar) {
        DisplayMetrics displayMetrics = this.f14407b.getResources().getDisplayMetrics();
        c.a aVarA = a.a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new i(aVarA, aVarA);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && r.b(this.f14407b, ((d) obj).f14407b);
    }

    public int hashCode() {
        return this.f14407b.hashCode();
    }
}
