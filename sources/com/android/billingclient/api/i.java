package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzai;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zzai f8164a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private zzai f8165a;

        /* synthetic */ a(v6.o0 o0Var) {
        }

        public i a() {
            return new i(this, null);
        }

        public a b(List<b> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (b bVar : list) {
                if (!"play_pass_subs".equals(bVar.c())) {
                    hashSet.add(bVar.c());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f8165a = zzai.zzj(list);
            return this;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8167b;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f8168a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f8169b;

            /* synthetic */ a(v6.p0 p0Var) {
            }

            public b a() {
                if ("first_party".equals(this.f8169b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f8168a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f8169b != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public a b(String str) {
                this.f8168a = str;
                return this;
            }

            public a c(String str) {
                this.f8169b = str;
                return this;
            }
        }

        /* synthetic */ b(a aVar, v6.q0 q0Var) {
            this.f8166a = aVar.f8168a;
            this.f8167b = aVar.f8169b;
        }

        public static a a() {
            return new a(null);
        }

        public final String b() {
            return this.f8166a;
        }

        public final String c() {
            return this.f8167b;
        }
    }

    /* synthetic */ i(a aVar, v6.r0 r0Var) {
        this.f8164a = aVar.f8165a;
    }

    public static a a() {
        return new a(null);
    }

    public final zzai b() {
        return this.f8164a;
    }

    public final String c() {
        return ((b) this.f8164a.get(0)).c();
    }
}
