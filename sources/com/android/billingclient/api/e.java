package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzb;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8083b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f8085b = "";

        /* synthetic */ a(v6.c0 c0Var) {
        }

        public e a() {
            e eVar = new e();
            eVar.f8082a = this.f8084a;
            eVar.f8083b = this.f8085b;
            return eVar;
        }

        public a b(String str) {
            this.f8085b = str;
            return this;
        }

        public a c(int i10) {
            this.f8084a = i10;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f8083b;
    }

    public int b() {
        return this.f8082a;
    }

    public String toString() {
        return "Response Code: " + zzb.zzh(this.f8082a) + ", Debug Message: " + this.f8083b;
    }
}
