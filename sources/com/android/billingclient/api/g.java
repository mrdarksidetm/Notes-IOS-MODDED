package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f8116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f8117b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f8118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f8119b;

        private a() {
        }

        public g a() {
            if (this.f8118a) {
                return new g(true, this.f8119b);
            }
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }

        public a b() {
            this.f8118a = true;
            return this;
        }

        public a c() {
            this.f8119b = true;
            return this;
        }
    }

    private g(boolean z10, boolean z11) {
        this.f8116a = z10;
        this.f8117b = z11;
    }

    public static a c() {
        return new a();
    }

    boolean a() {
        return this.f8116a;
    }

    boolean b() {
        return this.f8117b;
    }
}
