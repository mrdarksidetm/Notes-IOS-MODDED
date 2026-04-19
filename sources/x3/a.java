package x3;

import ae.r;
import android.view.View;
import o3.d2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f22953a = d.f22957b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f22954b = d.f22956a;

    public static final void a(View view, b bVar) {
        r.f(view, "<this>");
        r.f(bVar, "listener");
        b(view).a(bVar);
    }

    private static final c b(View view) {
        int i10 = f22953a;
        c cVar = (c) view.getTag(i10);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(i10, cVar2);
        return cVar2;
    }

    public static final boolean c(View view) {
        r.f(view, "<this>");
        Object tag = view.getTag(f22954b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(View view) {
        r.f(view, "<this>");
        for (Object obj : d2.a(view)) {
            if ((obj instanceof View) && c((View) obj)) {
                return true;
            }
        }
        return false;
    }

    public static final void e(View view, b bVar) {
        r.f(view, "<this>");
        r.f(bVar, "listener");
        b(view).b(bVar);
    }
}
