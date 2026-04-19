package x3;

import ae.r;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<b> f22955a = new ArrayList<>();

    public final void a(b bVar) {
        r.f(bVar, "listener");
        this.f22955a.add(bVar);
    }

    public final void b(b bVar) {
        r.f(bVar, "listener");
        this.f22955a.remove(bVar);
    }
}
