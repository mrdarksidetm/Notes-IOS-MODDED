package i6;

import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public final class d extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Response f12583a;

    public d(Response response) {
        super("HTTP " + response.w() + ": " + response.I());
        this.f12583a = response;
    }
}
