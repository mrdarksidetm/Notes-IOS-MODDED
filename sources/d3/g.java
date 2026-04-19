package d3;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f9473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Configuration f9474b;

    public g(boolean z10) {
        this.f9473a = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(boolean z10, Configuration configuration) {
        this(z10);
        ae.r.f(configuration, "newConfig");
        this.f9474b = configuration;
    }

    public final boolean a() {
        return this.f9473a;
    }
}
