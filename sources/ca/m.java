package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzzl;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends ba.k0 {
    public static final Parcelable.Creator<m> CREATOR = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ba.r0> f6712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f6713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ba.x1 f6715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f6716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<ba.x0> f6717f;

    public m(List<ba.r0> list, r rVar, String str, ba.x1 x1Var, g gVar, List<ba.x0> list2) {
        this.f6712a = (List) w8.m.k(list);
        this.f6713b = (r) w8.m.k(rVar);
        this.f6714c = w8.m.e(str);
        this.f6715d = x1Var;
        this.f6716e = gVar;
        this.f6717f = (List) w8.m.k(list2);
    }

    public static m C(zzzl zzzlVar, FirebaseAuth firebaseAuth, ba.a0 a0Var) {
        List<ba.j0> listZzc = zzzlVar.zzc();
        ArrayList arrayList = new ArrayList();
        for (ba.j0 j0Var : listZzc) {
            if (j0Var instanceof ba.r0) {
                arrayList.add((ba.r0) j0Var);
            }
        }
        List<ba.j0> listZzc2 = zzzlVar.zzc();
        ArrayList arrayList2 = new ArrayList();
        for (ba.j0 j0Var2 : listZzc2) {
            if (j0Var2 instanceof ba.x0) {
                arrayList2.add((ba.x0) j0Var2);
            }
        }
        return new m(arrayList, r.z(zzzlVar.zzc(), zzzlVar.zzb()), firebaseAuth.i().p(), zzzlVar.zza(), (g) a0Var, arrayList2);
    }

    @Override // ba.k0
    public final Task<ba.i> A(ba.i0 i0Var) {
        return u().U(i0Var, this.f6713b, this.f6716e).continueWithTask(new p(this));
    }

    @Override // ba.k0
    public final FirebaseAuth u() {
        return FirebaseAuth.getInstance(x9.f.o(this.f6714c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.G(parcel, 1, this.f6712a, false);
        x8.c.A(parcel, 2, z(), i10, false);
        x8.c.C(parcel, 3, this.f6714c, false);
        x8.c.A(parcel, 4, this.f6715d, i10, false);
        x8.c.A(parcel, 5, this.f6716e, i10, false);
        x8.c.G(parcel, 6, this.f6717f, false);
        x8.c.b(parcel, iA);
    }

    @Override // ba.k0
    public final List<ba.j0> x() {
        ArrayList arrayList = new ArrayList();
        Iterator<ba.r0> it = this.f6712a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        Iterator<ba.x0> it2 = this.f6717f.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    @Override // ba.k0
    public final ba.l0 z() {
        return this.f6713b;
    }
}
