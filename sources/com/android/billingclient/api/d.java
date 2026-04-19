package com.android.billingclient.api;

import android.text.TextUtils;
import com.android.billingclient.api.h;
import com.google.android.gms.internal.play_billing.zzaa;
import com.google.android.gms.internal.play_billing.zzai;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f8060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private zzai f8061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f8062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8063g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f8064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f8065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f8066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ArrayList f8067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f8068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c.a f8069f;

        /* synthetic */ a(v6.v vVar) {
            c.a aVarA = c.a();
            c.a.e(aVarA);
            this.f8069f = aVarA;
        }

        public d a() {
            ArrayList arrayList = this.f8067d;
            boolean z10 = true;
            boolean z11 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f8066c;
            boolean z12 = (list == null || list.isEmpty()) ? false : true;
            if (!z11 && !z12) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z11 && z12) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            v6.b0 b0Var = null;
            if (!z11) {
                b bVar = (b) this.f8066c.get(0);
                for (int i10 = 0; i10 < this.f8066c.size(); i10++) {
                    b bVar2 = (b) this.f8066c.get(i10);
                    if (bVar2 == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                    if (i10 != 0 && !bVar2.b().e().equals(bVar.b().e()) && !bVar2.b().e().equals("play_pass_subs")) {
                        throw new IllegalArgumentException("All products should have same ProductType.");
                    }
                }
                String strH = bVar.b().h();
                for (b bVar3 : this.f8066c) {
                    if (!bVar.b().e().equals("play_pass_subs") && !bVar3.b().e().equals("play_pass_subs") && !strH.equals(bVar3.b().h())) {
                        throw new IllegalArgumentException("All products must have the same package name.");
                    }
                }
            } else {
                if (this.f8067d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f8067d.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f8067d.get(0);
                    String strB = skuDetails.b();
                    ArrayList arrayList2 = this.f8067d;
                    int size = arrayList2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i11);
                        if (!strB.equals("play_pass_subs") && !skuDetails2.b().equals("play_pass_subs") && !strB.equals(skuDetails2.b())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String strF = skuDetails.f();
                    ArrayList arrayList3 = this.f8067d;
                    int size2 = arrayList3.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i12);
                        if (!strB.equals("play_pass_subs") && !skuDetails3.b().equals("play_pass_subs") && !strF.equals(skuDetails3.f())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            d dVar = new d(b0Var);
            if ((!z11 || ((SkuDetails) this.f8067d.get(0)).f().isEmpty()) && (!z12 || ((b) this.f8066c.get(0)).b().h().isEmpty())) {
                z10 = false;
            }
            dVar.f8057a = z10;
            dVar.f8058b = this.f8064a;
            dVar.f8059c = this.f8065b;
            dVar.f8060d = this.f8069f.a();
            ArrayList arrayList4 = this.f8067d;
            dVar.f8062f = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
            dVar.f8063g = this.f8068e;
            List list2 = this.f8066c;
            dVar.f8061e = list2 != null ? zzai.zzj(list2) : zzai.zzk();
            return dVar;
        }

        public a b(boolean z10) {
            this.f8068e = z10;
            return this;
        }

        public a c(String str) {
            this.f8064a = str;
            return this;
        }

        public a d(List<b> list) {
            this.f8066c = new ArrayList(list);
            return this;
        }

        public a e(c cVar) {
            this.f8069f = c.c(cVar);
            return this;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f8070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8071b;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private h f8072a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f8073b;

            /* synthetic */ a(v6.w wVar) {
            }

            public b a() {
                zzaa.zzc(this.f8072a, "ProductDetails is required for constructing ProductDetailsParams.");
                if (this.f8072a.f() != null) {
                    zzaa.zzc(this.f8073b, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
                return new b(this, null);
            }

            public a b(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f8073b = str;
                return this;
            }

            public a c(h hVar) {
                this.f8072a = hVar;
                if (hVar.c() != null) {
                    hVar.c().getClass();
                    h.b bVarC = hVar.c();
                    if (bVarC.d() != null) {
                        this.f8073b = bVarC.d();
                    }
                }
                return this;
            }
        }

        /* synthetic */ b(a aVar, v6.x xVar) {
            this.f8070a = aVar.f8072a;
            this.f8071b = aVar.f8073b;
        }

        public static a a() {
            return new a(null);
        }

        public final h b() {
            return this.f8070a;
        }

        public final String c() {
            return this.f8071b;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f8074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f8075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8076c = 0;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f8077a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f8078b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f8079c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f8080d = 0;

            /* synthetic */ a(v6.y yVar) {
            }

            static /* synthetic */ a e(a aVar) {
                aVar.f8079c = true;
                return aVar;
            }

            public c a() {
                v6.z zVar = null;
                boolean z10 = (TextUtils.isEmpty(this.f8077a) && TextUtils.isEmpty(null)) ? false : true;
                boolean zIsEmpty = true ^ TextUtils.isEmpty(this.f8078b);
                if (z10 && zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f8079c && !z10 && !zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                c cVar = new c(zVar);
                cVar.f8074a = this.f8077a;
                cVar.f8076c = this.f8080d;
                cVar.f8075b = this.f8078b;
                return cVar;
            }

            public a b(String str) {
                this.f8077a = str;
                return this;
            }

            public a c(String str) {
                this.f8078b = str;
                return this;
            }

            public a d(int i10) {
                this.f8080d = i10;
                return this;
            }

            @Deprecated
            public final a f(String str) {
                this.f8077a = str;
                return this;
            }
        }

        /* synthetic */ c(v6.z zVar) {
        }

        public static a a() {
            return new a(null);
        }

        static /* bridge */ /* synthetic */ a c(c cVar) {
            a aVarA = a();
            aVarA.f(cVar.f8074a);
            aVarA.d(cVar.f8076c);
            aVarA.c(cVar.f8075b);
            return aVarA;
        }

        final int b() {
            return this.f8076c;
        }

        final String d() {
            return this.f8074a;
        }

        final String e() {
            return this.f8075b;
        }
    }

    private d() {
        throw null;
    }

    /* synthetic */ d(v6.b0 b0Var) {
    }

    public static a a() {
        return new a(null);
    }

    public final int b() {
        return this.f8060d.b();
    }

    public final String c() {
        return this.f8058b;
    }

    public final String d() {
        return this.f8059c;
    }

    public final String e() {
        return this.f8060d.d();
    }

    public final String f() {
        return this.f8060d.e();
    }

    public final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f8062f);
        return arrayList;
    }

    public final List h() {
        return this.f8061e;
    }

    public final boolean p() {
        return this.f8063g;
    }

    final boolean q() {
        return (this.f8058b == null && this.f8059c == null && this.f8060d.e() == null && this.f8060d.b() == 0 && !this.f8057a && !this.f8063g) ? false : true;
    }
}
