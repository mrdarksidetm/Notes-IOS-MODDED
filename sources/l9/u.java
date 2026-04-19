package l9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import l9.c;

/* JADX INFO: loaded from: classes.dex */
public class u extends c0 {
    public static final Parcelable.Creator<u> CREATOR = new t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f14927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f14928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f14929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f14930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Double f14931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f14932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k f14933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Integer f14934h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e0 f14935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c f14936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f14937k;

    u(y yVar, a0 a0Var, byte[] bArr, List list, Double d10, List list2, k kVar, Integer num, e0 e0Var, String str, d dVar) {
        this.f14927a = (y) w8.m.k(yVar);
        this.f14928b = (a0) w8.m.k(a0Var);
        this.f14929c = (byte[]) w8.m.k(bArr);
        this.f14930d = (List) w8.m.k(list);
        this.f14931e = d10;
        this.f14932f = list2;
        this.f14933g = kVar;
        this.f14934h = num;
        this.f14935i = e0Var;
        if (str != null) {
            try {
                this.f14936j = c.a(str);
            } catch (c.a e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f14936j = null;
        }
        this.f14937k = dVar;
    }

    public byte[] A() {
        return this.f14929c;
    }

    public List<v> B() {
        return this.f14932f;
    }

    public List<w> C() {
        return this.f14930d;
    }

    public Integer D() {
        return this.f14934h;
    }

    public y E() {
        return this.f14927a;
    }

    public Double F() {
        return this.f14931e;
    }

    public e0 G() {
        return this.f14935i;
    }

    public a0 H() {
        return this.f14928b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return w8.k.b(this.f14927a, uVar.f14927a) && w8.k.b(this.f14928b, uVar.f14928b) && Arrays.equals(this.f14929c, uVar.f14929c) && w8.k.b(this.f14931e, uVar.f14931e) && this.f14930d.containsAll(uVar.f14930d) && uVar.f14930d.containsAll(this.f14930d) && (((list = this.f14932f) == null && uVar.f14932f == null) || (list != null && (list2 = uVar.f14932f) != null && list.containsAll(list2) && uVar.f14932f.containsAll(this.f14932f))) && w8.k.b(this.f14933g, uVar.f14933g) && w8.k.b(this.f14934h, uVar.f14934h) && w8.k.b(this.f14935i, uVar.f14935i) && w8.k.b(this.f14936j, uVar.f14936j) && w8.k.b(this.f14937k, uVar.f14937k);
    }

    public int hashCode() {
        return w8.k.c(this.f14927a, this.f14928b, Integer.valueOf(Arrays.hashCode(this.f14929c)), this.f14930d, this.f14931e, this.f14932f, this.f14933g, this.f14934h, this.f14935i, this.f14936j, this.f14937k);
    }

    public String u() {
        c cVar = this.f14936j;
        if (cVar == null) {
            return null;
        }
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.A(parcel, 2, E(), i10, false);
        x8.c.A(parcel, 3, H(), i10, false);
        x8.c.k(parcel, 4, A(), false);
        x8.c.G(parcel, 5, C(), false);
        x8.c.o(parcel, 6, F(), false);
        x8.c.G(parcel, 7, B(), false);
        x8.c.A(parcel, 8, z(), i10, false);
        x8.c.u(parcel, 9, D(), false);
        x8.c.A(parcel, 10, G(), i10, false);
        x8.c.C(parcel, 11, u(), false);
        x8.c.A(parcel, 12, x(), i10, false);
        x8.c.b(parcel, iA);
    }

    public d x() {
        return this.f14937k;
    }

    public k z() {
        return this.f14933g;
    }
}
