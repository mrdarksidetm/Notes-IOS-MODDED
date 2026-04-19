package rc;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f19264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f19265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sc.a<String> f19267d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19268a;

        static {
            int[] iArr = new int[b.values().length];
            f19268a = iArr;
            try {
                iArr[b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19268a[b.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19268a[b.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19268a[b.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19268a[b.DETACHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private enum b {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public g(fc.a aVar) {
        this((sc.a<String>) new sc.a(aVar, "flutter/lifecycle", sc.r.f20521b));
    }

    public g(sc.a<String> aVar) {
        this.f19264a = null;
        this.f19265b = null;
        this.f19266c = true;
        this.f19267d = aVar;
    }

    private void g(b bVar, boolean z10) {
        b bVar2 = this.f19264a;
        if (bVar2 == bVar && z10 == this.f19266c) {
            return;
        }
        if (bVar == null && bVar2 == null) {
            this.f19266c = z10;
            return;
        }
        b bVar3 = null;
        int i10 = a.f19268a[bVar.ordinal()];
        if (i10 == 1) {
            bVar3 = z10 ? b.RESUMED : b.INACTIVE;
        } else if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            bVar3 = bVar;
        }
        this.f19264a = bVar;
        this.f19266c = z10;
        if (bVar3 == this.f19265b) {
            return;
        }
        String str = "AppLifecycleState." + bVar3.name().toLowerCase(Locale.ROOT);
        cc.b.f("LifecycleChannel", "Sending " + str + " message.");
        this.f19267d.c(str);
        this.f19265b = bVar3;
    }

    public void a() {
        g(this.f19264a, true);
    }

    public void b() {
        g(b.DETACHED, this.f19266c);
    }

    public void c() {
        g(b.INACTIVE, this.f19266c);
    }

    public void d() {
        g(b.PAUSED, this.f19266c);
    }

    public void e() {
        g(b.RESUMED, this.f19266c);
    }

    public void f() {
        g(this.f19264a, false);
    }
}
