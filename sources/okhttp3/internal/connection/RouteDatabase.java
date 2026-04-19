package okhttp3.internal.connection;

import ae.r;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.Route;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<Route> f17246a = new LinkedHashSet();

    public final synchronized void a(Route route) {
        r.f(route, "route");
        this.f17246a.remove(route);
    }

    public final synchronized void b(Route route) {
        r.f(route, "failedRoute");
        this.f17246a.add(route);
    }

    public final synchronized boolean c(Route route) {
        r.f(route, "route");
        return this.f17246a.contains(route);
    }
}
