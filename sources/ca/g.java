package ca;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class g extends ba.a0 {
    public static final Parcelable.Creator<g> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zzagl f6663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e2 f6664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f6666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<e2> f6667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f6668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f6669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f6670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i f6671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f6672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ba.x1 f6673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private o0 f6674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<ba.n1> f6675m;

    g(zzagl zzaglVar, e2 e2Var, String str, String str2, List<e2> list, List<String> list2, String str3, Boolean bool, i iVar, boolean z10, ba.x1 x1Var, o0 o0Var, List<ba.n1> list3) {
        this.f6663a = zzaglVar;
        this.f6664b = e2Var;
        this.f6665c = str;
        this.f6666d = str2;
        this.f6667e = list;
        this.f6668f = list2;
        this.f6669g = str3;
        this.f6670h = bool;
        this.f6671i = iVar;
        this.f6672j = z10;
        this.f6673k = x1Var;
        this.f6674l = o0Var;
        this.f6675m = list3;
    }

    public g(x9.f fVar, List<? extends ba.b1> list) {
        w8.m.k(fVar);
        this.f6665c = fVar.p();
        this.f6666d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f6669g = "2";
        S(list);
    }

    @Override // ba.a0
    public /* synthetic */ ba.h0 A() {
        return new k(this);
    }

    @Override // ba.a0
    public List<? extends ba.b1> B() {
        return this.f6667e;
    }

    @Override // ba.a0
    public String C() {
        Map map;
        zzagl zzaglVar = this.f6663a;
        if (zzaglVar == null || zzaglVar.zzc() == null || (map = (Map) k0.a(this.f6663a.zzc()).b().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // ba.a0
    public boolean D() {
        ba.c0 c0VarA;
        Boolean bool = this.f6670h;
        if (bool == null || bool.booleanValue()) {
            zzagl zzaglVar = this.f6663a;
            String strE = "";
            if (zzaglVar != null && (c0VarA = k0.a(zzaglVar.zzc())) != null) {
                strE = c0VarA.e();
            }
            boolean z10 = true;
            if (B().size() > 1 || (strE != null && strE.equals("custom"))) {
                z10 = false;
            }
            this.f6670h = Boolean.valueOf(z10);
        }
        return this.f6670h.booleanValue();
    }

    @Override // ba.a0
    public final synchronized ba.a0 S(List<? extends ba.b1> list) {
        w8.m.k(list);
        this.f6667e = new ArrayList(list.size());
        this.f6668f = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            ba.b1 b1Var = list.get(i10);
            if (b1Var.c().equals("firebase")) {
                this.f6664b = (e2) b1Var;
            } else {
                this.f6668f.add(b1Var.c());
            }
            this.f6667e.add((e2) b1Var);
        }
        if (this.f6664b == null) {
            this.f6664b = this.f6667e.get(0);
        }
        return this;
    }

    @Override // ba.a0
    public final x9.f T() {
        return x9.f.o(this.f6665c);
    }

    @Override // ba.a0
    public final void U(zzagl zzaglVar) {
        this.f6663a = (zzagl) w8.m.k(zzaglVar);
    }

    @Override // ba.a0
    public final /* synthetic */ ba.a0 V() {
        this.f6670h = Boolean.FALSE;
        return this;
    }

    @Override // ba.a0
    public final void W(List<ba.n1> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f6675m = list;
    }

    @Override // ba.a0
    public final zzagl X() {
        return this.f6663a;
    }

    @Override // ba.a0
    public final void Y(List<ba.j0> list) {
        this.f6674l = o0.u(list);
    }

    @Override // ba.a0
    public final List<ba.n1> Z() {
        return this.f6675m;
    }

    @Override // ba.a0
    public final List<String> a0() {
        return this.f6668f;
    }

    @Override // ba.a0, ba.b1
    public Uri b() {
        return this.f6664b.b();
    }

    public final g b0(String str) {
        this.f6669g = str;
        return this;
    }

    @Override // ba.b1
    public String c() {
        return this.f6664b.c();
    }

    public final void c0(ba.x1 x1Var) {
        this.f6673k = x1Var;
    }

    @Override // ba.a0, ba.b1
    public String d() {
        return this.f6664b.d();
    }

    public final void d0(i iVar) {
        this.f6671i = iVar;
    }

    @Override // ba.b1
    public boolean e() {
        return this.f6664b.e();
    }

    public final void e0(boolean z10) {
        this.f6672j = z10;
    }

    public final ba.x1 f0() {
        return this.f6673k;
    }

    @Override // ba.a0, ba.b1
    public String g() {
        return this.f6664b.g();
    }

    public final List<ba.j0> g0() {
        o0 o0Var = this.f6674l;
        return o0Var != null ? o0Var.x() : new ArrayList();
    }

    public final List<e2> h0() {
        return this.f6667e;
    }

    public final boolean i0() {
        return this.f6672j;
    }

    @Override // ba.a0, ba.b1
    public String k() {
        return this.f6664b.k();
    }

    @Override // ba.a0, ba.b1
    public String t() {
        return this.f6664b.t();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.A(parcel, 1, X(), i10, false);
        x8.c.A(parcel, 2, this.f6664b, i10, false);
        x8.c.C(parcel, 3, this.f6665c, false);
        x8.c.C(parcel, 4, this.f6666d, false);
        x8.c.G(parcel, 5, this.f6667e, false);
        x8.c.E(parcel, 6, a0(), false);
        x8.c.C(parcel, 7, this.f6669g, false);
        x8.c.i(parcel, 8, Boolean.valueOf(D()), false);
        x8.c.A(parcel, 9, z(), i10, false);
        x8.c.g(parcel, 10, this.f6672j);
        x8.c.A(parcel, 11, this.f6673k, i10, false);
        x8.c.A(parcel, 12, this.f6674l, i10, false);
        x8.c.G(parcel, 13, Z(), false);
        x8.c.b(parcel, iA);
    }

    @Override // ba.a0
    public ba.b0 z() {
        return this.f6671i;
    }

    @Override // ba.a0
    public final String zzd() {
        return X().zzc();
    }

    @Override // ba.a0
    public final String zze() {
        return this.f6663a.zzf();
    }
}
