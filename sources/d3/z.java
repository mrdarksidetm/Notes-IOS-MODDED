package d3;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f9477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Configuration f9478b;

    public z(boolean z10) {
        this.f9477a = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(boolean z10, Configuration configuration) {
        this(z10);
        ae.r.f(configuration, "newConfig");
        this.f9478b = configuration;
    }

    public final boolean a() {
        return this.f9477a;
    }
}
