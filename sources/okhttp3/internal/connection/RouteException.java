package okhttp3.internal.connection;

import ae.r;
import java.io.IOException;
import md.f;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IOException f17247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f17248b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException iOException) {
        super(iOException);
        r.f(iOException, "firstConnectException");
        this.f17247a = iOException;
        this.f17248b = iOException;
    }

    public final void a(IOException iOException) {
        r.f(iOException, "e");
        f.a(this.f17247a, iOException);
        this.f17248b = iOException;
    }

    public final IOException b() {
        return this.f17247a;
    }

    public final IOException c() {
        return this.f17248b;
    }
}
