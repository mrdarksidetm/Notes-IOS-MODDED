package g;

import ae.r;
import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<b> f11234a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Context f11235b;

    public final void a(b bVar) {
        r.f(bVar, "listener");
        Context context = this.f11235b;
        if (context != null) {
            bVar.a(context);
        }
        this.f11234a.add(bVar);
    }

    public final void b() {
        this.f11235b = null;
    }

    public final void c(Context context) {
        r.f(context, "context");
        this.f11235b = context;
        Iterator<b> it = this.f11234a.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }

    public final Context d() {
        return this.f11235b;
    }

    public final void e(b bVar) {
        r.f(bVar, "listener");
        this.f11234a.remove(bVar);
    }
}
