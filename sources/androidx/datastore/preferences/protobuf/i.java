package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.k1;
import androidx.datastore.preferences.protobuf.z;
import com.google.android.gms.common.api.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class i implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f3611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3614d = 0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3615a;

        static {
            int[] iArr = new int[k1.b.values().length];
            f3615a = iArr;
            try {
                iArr[k1.b.f3670j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3615a[k1.b.f3674n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3615a[k1.b.f3663c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3615a[k1.b.f3676p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3615a[k1.b.f3669i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3615a[k1.b.f3668h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3615a[k1.b.f3664d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3615a[k1.b.f3667g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3615a[k1.b.f3665e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3615a[k1.b.f3673m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3615a[k1.b.f3677q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3615a[k1.b.f3678r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3615a[k1.b.f3679s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3615a[k1.b.f3680t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3615a[k1.b.f3671k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3615a[k1.b.f3675o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3615a[k1.b.f3666f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private i(h hVar) {
        h hVar2 = (h) y.b(hVar, "input");
        this.f3611a = hVar2;
        hVar2.f3589d = this;
    }

    public static i Q(h hVar) {
        i iVar = hVar.f3589d;
        return iVar != null ? iVar : new i(hVar);
    }

    private Object R(k1.b bVar, Class<?> cls, o oVar) {
        switch (a.f3615a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(j());
            case 2:
                return D();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(t());
            case 5:
                return Integer.valueOf(i());
            case 6:
                return Long.valueOf(d());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(F());
            case 9:
                return Long.valueOf(M());
            case 10:
                return e(cls, oVar);
            case 11:
                return Integer.valueOf(I());
            case 12:
                return Long.valueOf(k());
            case 13:
                return Integer.valueOf(w());
            case 14:
                return Long.valueOf(x());
            case 15:
                return N();
            case 16:
                return Integer.valueOf(n());
            case 17:
                return Long.valueOf(c());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <T> T S(z0<T> z0Var, o oVar) {
        int i10 = this.f3613c;
        this.f3613c = k1.c(k1.a(this.f3612b), 4);
        try {
            T tH = z0Var.h();
            z0Var.b(tH, this, oVar);
            z0Var.c(tH);
            if (this.f3612b == this.f3613c) {
                return tH;
            }
            throw z.g();
        } finally {
            this.f3613c = i10;
        }
    }

    private <T> T T(z0<T> z0Var, o oVar) throws z {
        int iC = this.f3611a.C();
        h hVar = this.f3611a;
        if (hVar.f3586a >= hVar.f3587b) {
            throw z.h();
        }
        int iL = hVar.l(iC);
        T tH = z0Var.h();
        this.f3611a.f3586a++;
        z0Var.b(tH, this, oVar);
        z0Var.c(tH);
        this.f3611a.a(0);
        r5.f3586a--;
        this.f3611a.k(iL);
        return tH;
    }

    private void V(int i10) throws z {
        if (this.f3611a.d() != i10) {
            throw z.k();
        }
    }

    private void W(int i10) throws z.a {
        if (k1.b(this.f3612b) != i10) {
            throw z.d();
        }
    }

    private void X(int i10) throws z {
        if ((i10 & 3) != 0) {
            throw z.g();
        }
    }

    private void Y(int i10) throws z {
        if ((i10 & 7) != 0) {
            throw z.g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public int A() {
        int i10 = this.f3614d;
        if (i10 != 0) {
            this.f3612b = i10;
            this.f3614d = 0;
        } else {
            this.f3612b = this.f3611a.B();
        }
        int i11 = this.f3612b;
        return (i11 == 0 || i11 == this.f3613c) ? a.e.API_PRIORITY_OTHER : k1.a(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public void B(List<String> list) throws z.a {
        U(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public void C(List<String> list) throws z.a {
        U(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public g D() throws z.a {
        W(2);
        return this.f3611a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public void E(List<Float> list) throws z {
        int iB;
        int iB2;
        if (!(list instanceof u)) {
            int iB3 = k1.b(this.f3612b);
            if (iB3 == 2) {
                int iC = this.f3611a.C();
                X(iC);
                int iD = this.f3611a.d() + iC;
                do {
                    list.add(Float.valueOf(this.f3611a.s()));
                } while (this.f3611a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw z.d();
            }
            do {
                list.add(Float.valueOf(this.f3611a.s()));
                if (this.f3611a.e()) {
                    return;
                } else {
                    iB = this.f3611a.B();
                }
            } while (iB == this.f3612b);
            this.f3614d = iB;
            return;
        }
        u uVar = (u) list;
        int iB4 = k1.b(this.f3612b);
        if (iB4 == 2) {
            int iC2 = this.f3611a.C();
            X(iC2);
            int iD2 = this.f3611a.d() + iC2;
            do {
                uVar.f(this.f3611a.s());
            } while (this.f3611a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw z.d();
        }
        do {
            uVar.f(this.f3611a.s());
            if (this.f3611a.e()) {
                return;
            } else {
                iB2 = this.f3611a.B();
            }
        } while (iB2 == this.f3612b);
        this.f3614d = iB2;
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public int F() throws z.a {
        W(0);
        return this.f3611a.t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.y0
    public <T> void G(List<T> list, z0<T> z0Var, o oVar) throws z.a {
        int iB;
        if (k1.b(this.f3612b) != 3) {
            throw z.d();
        }
        int i10 = this.f3612b;
        do {
            list.add(S(z0Var, oVar));
            if (this.f3611a.e() || this.f3614d != 0) {
                return;
            } else {
                iB = this.f3611a.B();
            }
        } while (iB == i10);
        this.f3614d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public boolean H() {
        int i10;
        if (this.f3611a.e() || (i10 = this.f3612b) == this.f3613c) {
            return false;
        }
        return this.f3611a.E(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public int I() throws z.a {
        W(5);
        return this.f3611a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public void J(List<g> list) throws z.a {
        int iB;
        if (k1.b(this.f3612b) != 2) {
            throw z.d();
        }
        do {
            list.add(D());
            if (this.f3611a.e()) {
                return;
            } else {
                iB = this.f3611a.B();
            }
        } while (iB == this.f3612b);
        this.f3614d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public void K(List<Double> list) throws z {
        int iB;
        int iB2;
        if (!(list instanceof l)) {
            int iB3 = k1.b(this.f3612b);
            if (iB3 == 1) {
                do {
                    list.add(Double.valueOf(this.f3611a.o()));
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB = this.f3611a.B();
                    }
                } while (iB == this.f3612b);
                this.f3614d = iB;
                return;
            }
            if (iB3 != 2) {
                throw z.d();
            }
            int iC = this.f3611a.C();
            Y(iC);
            int iD = this.f3611a.d() + iC;
            do {
                list.add(Double.valueOf(this.f3611a.o()));
            } while (this.f3611a.d() < iD);
            return;
        }
        l lVar = (l) list;
        int iB4 = k1.b(this.f3612b);
        if (iB4 == 1) {
            do {
                lVar.f(this.f3611a.o());
                if (this.f3611a.e()) {
                    return;
                } else {
                    iB2 = this.f3611a.B();
                }
            } while (iB2 == this.f3612b);
            this.f3614d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw z.d();
        }
        int iC2 = this.f3611a.C();
        Y(iC2);
        int iD2 = this.f3611a.d() + iC2;
        do {
            lVar.f(this.f3611a.o());
        } while (this.f3611a.d() < iD2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.y0
    public <T> void L(List<T> list, z0<T> z0Var, o oVar) throws z.a {
        int iB;
        if (k1.b(this.f3612b) != 2) {
            throw z.d();
        }
        int i10 = this.f3612b;
        do {
            list.add(T(z0Var, oVar));
            if (this.f3611a.e() || this.f3614d != 0) {
                return;
            } else {
                iB = this.f3611a.B();
            }
        } while (iB == i10);
        this.f3614d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public long M() throws z.a {
        W(0);
        return this.f3611a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public String N() throws z.a {
        W(2);
        return this.f3611a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public void O(List<Long> list) throws z {
        int iB;
        int iB2;
        if (!(list instanceof e0)) {
            int iB3 = k1.b(this.f3612b);
            if (iB3 == 1) {
                do {
                    list.add(Long.valueOf(this.f3611a.r()));
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB = this.f3611a.B();
                    }
                } while (iB == this.f3612b);
                this.f3614d = iB;
                return;
            }
            if (iB3 != 2) {
                throw z.d();
            }
            int iC = this.f3611a.C();
            Y(iC);
            int iD = this.f3611a.d() + iC;
            do {
                list.add(Long.valueOf(this.f3611a.r()));
            } while (this.f3611a.d() < iD);
            return;
        }
        e0 e0Var = (e0) list;
        int iB4 = k1.b(this.f3612b);
        if (iB4 == 1) {
            do {
                e0Var.k(this.f3611a.r());
                if (this.f3611a.e()) {
                    return;
                } else {
                    iB2 = this.f3611a.B();
                }
            } while (iB2 == this.f3612b);
            this.f3614d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw z.d();
        }
        int iC2 = this.f3611a.C();
        Y(iC2);
        int iD2 = this.f3611a.d() + iC2;
        do {
            e0Var.k(this.f3611a.r());
        } while (this.f3611a.d() < iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public <T> T P(z0<T> z0Var, o oVar) throws z.a {
        W(3);
        return (T) S(z0Var, oVar);
    }

    public void U(List<String> list, boolean z10) throws z.a {
        int iB;
        int iB2;
        if (k1.b(this.f3612b) != 2) {
            throw z.d();
        }
        if (!(list instanceof e4.d) || z10) {
            do {
                list.add(z10 ? N() : z());
                if (this.f3611a.e()) {
                    return;
                } else {
                    iB = this.f3611a.B();
                }
            } while (iB == this.f3612b);
            this.f3614d = iB;
            return;
        }
        e4.d dVar = (e4.d) list;
        do {
            dVar.c(D());
            if (this.f3611a.e()) {
                return;
            } else {
                iB2 = this.f3611a.B();
            }
        } while (iB2 == this.f3612b);
        this.f3614d = iB2;
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public <T> T a(z0<T> z0Var, o oVar) throws z.a {
        W(2);
        return (T) T(z0Var, oVar);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public void b(List<Integer> list) throws z {
        int iB;
        int iD;
        int iB2;
        if (list instanceof x) {
            x xVar = (x) list;
            int iB3 = k1.b(this.f3612b);
            if (iB3 == 0) {
                do {
                    xVar.f(this.f3611a.x());
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB2 = this.f3611a.B();
                    }
                } while (iB2 == this.f3612b);
                this.f3614d = iB2;
                return;
            }
            if (iB3 != 2) {
                throw z.d();
            }
            iD = this.f3611a.d() + this.f3611a.C();
            do {
                xVar.f(this.f3611a.x());
            } while (this.f3611a.d() < iD);
        } else {
            int iB4 = k1.b(this.f3612b);
            if (iB4 == 0) {
                do {
                    list.add(Integer.valueOf(this.f3611a.x()));
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB = this.f3611a.B();
                    }
                } while (iB == this.f3612b);
                this.f3614d = iB;
                return;
            }
            if (iB4 != 2) {
                throw z.d();
            }
            iD = this.f3611a.d() + this.f3611a.C();
            do {
                list.add(Integer.valueOf(this.f3611a.x()));
            } while (this.f3611a.d() < iD);
        }
        V(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public long c() throws z.a {
        W(0);
        return this.f3611a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public long d() throws z.a {
        W(1);
        return this.f3611a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public <T> T e(Class<T> cls, o oVar) throws z.a {
        W(2);
        return (T) T(v0.a().d(cls), oVar);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public void f(List<Integer> list) throws z {
        int iB;
        int iB2;
        if (!(list instanceof x)) {
            int iB3 = k1.b(this.f3612b);
            if (iB3 == 2) {
                int iC = this.f3611a.C();
                X(iC);
                int iD = this.f3611a.d() + iC;
                do {
                    list.add(Integer.valueOf(this.f3611a.v()));
                } while (this.f3611a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw z.d();
            }
            do {
                list.add(Integer.valueOf(this.f3611a.v()));
                if (this.f3611a.e()) {
                    return;
                } else {
                    iB = this.f3611a.B();
                }
            } while (iB == this.f3612b);
            this.f3614d = iB;
            return;
        }
        x xVar = (x) list;
        int iB4 = k1.b(this.f3612b);
        if (iB4 == 2) {
            int iC2 = this.f3611a.C();
            X(iC2);
            int iD2 = this.f3611a.d() + iC2;
            do {
                xVar.f(this.f3611a.v());
            } while (this.f3611a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw z.d();
        }
        do {
            xVar.f(this.f3611a.v());
            if (this.f3611a.e()) {
                return;
            } else {
                iB2 = this.f3611a.B();
            }
        } while (iB2 == this.f3612b);
        this.f3614d = iB2;
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public void g(List<Long> list) throws z {
        int iB;
        int iD;
        int iB2;
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            int iB3 = k1.b(this.f3612b);
            if (iB3 == 0) {
                do {
                    e0Var.k(this.f3611a.y());
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB2 = this.f3611a.B();
                    }
                } while (iB2 == this.f3612b);
                this.f3614d = iB2;
                return;
            }
            if (iB3 != 2) {
                throw z.d();
            }
            iD = this.f3611a.d() + this.f3611a.C();
            do {
                e0Var.k(this.f3611a.y());
            } while (this.f3611a.d() < iD);
        } else {
            int iB4 = k1.b(this.f3612b);
            if (iB4 == 0) {
                do {
                    list.add(Long.valueOf(this.f3611a.y()));
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB = this.f3611a.B();
                    }
                } while (iB == this.f3612b);
                this.f3614d = iB;
                return;
            }
            if (iB4 != 2) {
                throw z.d();
            }
            iD = this.f3611a.d() + this.f3611a.C();
            do {
                list.add(Long.valueOf(this.f3611a.y()));
            } while (this.f3611a.d() < iD);
        }
        V(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public void h(List<Integer> list) throws z {
        int iB;
        int iD;
        int iB2;
        if (list instanceof x) {
            x xVar = (x) list;
            int iB3 = k1.b(this.f3612b);
            if (iB3 == 0) {
                do {
                    xVar.f(this.f3611a.C());
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB2 = this.f3611a.B();
                    }
                } while (iB2 == this.f3612b);
                this.f3614d = iB2;
                return;
            }
            if (iB3 != 2) {
                throw z.d();
            }
            iD = this.f3611a.d() + this.f3611a.C();
            do {
                xVar.f(this.f3611a.C());
            } while (this.f3611a.d() < iD);
        } else {
            int iB4 = k1.b(this.f3612b);
            if (iB4 == 0) {
                do {
                    list.add(Integer.valueOf(this.f3611a.C()));
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB = this.f3611a.B();
                    }
                } while (iB == this.f3612b);
                this.f3614d = iB;
                return;
            }
            if (iB4 != 2) {
                throw z.d();
            }
            iD = this.f3611a.d() + this.f3611a.C();
            do {
                list.add(Integer.valueOf(this.f3611a.C()));
            } while (this.f3611a.d() < iD);
        }
        V(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public int i() throws z.a {
        W(5);
        return this.f3611a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public boolean j() throws z.a {
        W(0);
        return this.f3611a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public long k() throws z.a {
        W(1);
        return this.f3611a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public void l(List<Long> list) throws z {
        int iB;
        int iD;
        int iB2;
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            int iB3 = k1.b(this.f3612b);
            if (iB3 == 0) {
                do {
                    e0Var.k(this.f3611a.D());
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB2 = this.f3611a.B();
                    }
                } while (iB2 == this.f3612b);
                this.f3614d = iB2;
                return;
            }
            if (iB3 != 2) {
                throw z.d();
            }
            iD = this.f3611a.d() + this.f3611a.C();
            do {
                e0Var.k(this.f3611a.D());
            } while (this.f3611a.d() < iD);
        } else {
            int iB4 = k1.b(this.f3612b);
            if (iB4 == 0) {
                do {
                    list.add(Long.valueOf(this.f3611a.D()));
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB = this.f3611a.B();
                    }
                } while (iB == this.f3612b);
                this.f3614d = iB;
                return;
            }
            if (iB4 != 2) {
                throw z.d();
            }
            iD = this.f3611a.d() + this.f3611a.C();
            do {
                list.add(Long.valueOf(this.f3611a.D()));
            } while (this.f3611a.d() < iD);
        }
        V(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public <T> T m(Class<T> cls, o oVar) throws z.a {
        W(3);
        return (T) S(v0.a().d(cls), oVar);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public int n() throws z.a {
        W(0);
        return this.f3611a.C();
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public void o(List<Long> list) throws z {
        int iB;
        int iD;
        int iB2;
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            int iB3 = k1.b(this.f3612b);
            if (iB3 == 0) {
                do {
                    e0Var.k(this.f3611a.u());
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB2 = this.f3611a.B();
                    }
                } while (iB2 == this.f3612b);
                this.f3614d = iB2;
                return;
            }
            if (iB3 != 2) {
                throw z.d();
            }
            iD = this.f3611a.d() + this.f3611a.C();
            do {
                e0Var.k(this.f3611a.u());
            } while (this.f3611a.d() < iD);
        } else {
            int iB4 = k1.b(this.f3612b);
            if (iB4 == 0) {
                do {
                    list.add(Long.valueOf(this.f3611a.u()));
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB = this.f3611a.B();
                    }
                } while (iB == this.f3612b);
                this.f3614d = iB;
                return;
            }
            if (iB4 != 2) {
                throw z.d();
            }
            iD = this.f3611a.d() + this.f3611a.C();
            do {
                list.add(Long.valueOf(this.f3611a.u()));
            } while (this.f3611a.d() < iD);
        }
        V(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public void p(List<Long> list) throws z {
        int iB;
        int iB2;
        if (!(list instanceof e0)) {
            int iB3 = k1.b(this.f3612b);
            if (iB3 == 1) {
                do {
                    list.add(Long.valueOf(this.f3611a.w()));
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB = this.f3611a.B();
                    }
                } while (iB == this.f3612b);
                this.f3614d = iB;
                return;
            }
            if (iB3 != 2) {
                throw z.d();
            }
            int iC = this.f3611a.C();
            Y(iC);
            int iD = this.f3611a.d() + iC;
            do {
                list.add(Long.valueOf(this.f3611a.w()));
            } while (this.f3611a.d() < iD);
            return;
        }
        e0 e0Var = (e0) list;
        int iB4 = k1.b(this.f3612b);
        if (iB4 == 1) {
            do {
                e0Var.k(this.f3611a.w());
                if (this.f3611a.e()) {
                    return;
                } else {
                    iB2 = this.f3611a.B();
                }
            } while (iB2 == this.f3612b);
            this.f3614d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw z.d();
        }
        int iC2 = this.f3611a.C();
        Y(iC2);
        int iD2 = this.f3611a.d() + iC2;
        do {
            e0Var.k(this.f3611a.w());
        } while (this.f3611a.d() < iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public void q(List<Integer> list) throws z {
        int iB;
        int iD;
        int iB2;
        if (list instanceof x) {
            x xVar = (x) list;
            int iB3 = k1.b(this.f3612b);
            if (iB3 == 0) {
                do {
                    xVar.f(this.f3611a.t());
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB2 = this.f3611a.B();
                    }
                } while (iB2 == this.f3612b);
                this.f3614d = iB2;
                return;
            }
            if (iB3 != 2) {
                throw z.d();
            }
            iD = this.f3611a.d() + this.f3611a.C();
            do {
                xVar.f(this.f3611a.t());
            } while (this.f3611a.d() < iD);
        } else {
            int iB4 = k1.b(this.f3612b);
            if (iB4 == 0) {
                do {
                    list.add(Integer.valueOf(this.f3611a.t()));
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB = this.f3611a.B();
                    }
                } while (iB == this.f3612b);
                this.f3614d = iB;
                return;
            }
            if (iB4 != 2) {
                throw z.d();
            }
            iD = this.f3611a.d() + this.f3611a.C();
            do {
                list.add(Integer.valueOf(this.f3611a.t()));
            } while (this.f3611a.d() < iD);
        }
        V(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public void r(List<Integer> list) throws z {
        int iB;
        int iD;
        int iB2;
        if (list instanceof x) {
            x xVar = (x) list;
            int iB3 = k1.b(this.f3612b);
            if (iB3 == 0) {
                do {
                    xVar.f(this.f3611a.p());
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB2 = this.f3611a.B();
                    }
                } while (iB2 == this.f3612b);
                this.f3614d = iB2;
                return;
            }
            if (iB3 != 2) {
                throw z.d();
            }
            iD = this.f3611a.d() + this.f3611a.C();
            do {
                xVar.f(this.f3611a.p());
            } while (this.f3611a.d() < iD);
        } else {
            int iB4 = k1.b(this.f3612b);
            if (iB4 == 0) {
                do {
                    list.add(Integer.valueOf(this.f3611a.p()));
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB = this.f3611a.B();
                    }
                } while (iB == this.f3612b);
                this.f3614d = iB;
                return;
            }
            if (iB4 != 2) {
                throw z.d();
            }
            iD = this.f3611a.d() + this.f3611a.C();
            do {
                list.add(Integer.valueOf(this.f3611a.p()));
            } while (this.f3611a.d() < iD);
        }
        V(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public double readDouble() throws z.a {
        W(1);
        return this.f3611a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public float readFloat() throws z.a {
        W(5);
        return this.f3611a.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void s(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.g0.a<K, V> r9, androidx.datastore.preferences.protobuf.o r10) throws androidx.datastore.preferences.protobuf.z.a {
        /*
            r7 = this;
            r0 = 2
            r7.W(r0)
            androidx.datastore.preferences.protobuf.h r1 = r7.f3611a
            int r1 = r1.C()
            androidx.datastore.preferences.protobuf.h r2 = r7.f3611a
            int r1 = r2.l(r1)
            K r2 = r9.f3577b
            V r3 = r9.f3579d
        L14:
            int r4 = r7.A()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            androidx.datastore.preferences.protobuf.h r5 = r7.f3611a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.H()     // Catch: androidx.datastore.preferences.protobuf.z.a -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.z r4 = new androidx.datastore.preferences.protobuf.z     // Catch: androidx.datastore.preferences.protobuf.z.a -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: androidx.datastore.preferences.protobuf.z.a -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: androidx.datastore.preferences.protobuf.z.a -> L4f java.lang.Throwable -> L65
        L3a:
            androidx.datastore.preferences.protobuf.k1$b r4 = r9.f3578c     // Catch: androidx.datastore.preferences.protobuf.z.a -> L4f java.lang.Throwable -> L65
            V r5 = r9.f3579d     // Catch: androidx.datastore.preferences.protobuf.z.a -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: androidx.datastore.preferences.protobuf.z.a -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch: androidx.datastore.preferences.protobuf.z.a -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            androidx.datastore.preferences.protobuf.k1$b r4 = r9.f3576a     // Catch: androidx.datastore.preferences.protobuf.z.a -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch: androidx.datastore.preferences.protobuf.z.a -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.H()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            androidx.datastore.preferences.protobuf.z r8 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            androidx.datastore.preferences.protobuf.h r8 = r7.f3611a
            r8.k(r1)
            return
        L65:
            r8 = move-exception
            androidx.datastore.preferences.protobuf.h r9 = r7.f3611a
            r9.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i.s(java.util.Map, androidx.datastore.preferences.protobuf.g0$a, androidx.datastore.preferences.protobuf.o):void");
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public int t() throws z.a {
        W(0);
        return this.f3611a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public int u() {
        return this.f3612b;
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public void v(List<Integer> list) throws z {
        int iB;
        int iB2;
        if (!(list instanceof x)) {
            int iB3 = k1.b(this.f3612b);
            if (iB3 == 2) {
                int iC = this.f3611a.C();
                X(iC);
                int iD = this.f3611a.d() + iC;
                do {
                    list.add(Integer.valueOf(this.f3611a.q()));
                } while (this.f3611a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw z.d();
            }
            do {
                list.add(Integer.valueOf(this.f3611a.q()));
                if (this.f3611a.e()) {
                    return;
                } else {
                    iB = this.f3611a.B();
                }
            } while (iB == this.f3612b);
            this.f3614d = iB;
            return;
        }
        x xVar = (x) list;
        int iB4 = k1.b(this.f3612b);
        if (iB4 == 2) {
            int iC2 = this.f3611a.C();
            X(iC2);
            int iD2 = this.f3611a.d() + iC2;
            do {
                xVar.f(this.f3611a.q());
            } while (this.f3611a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw z.d();
        }
        do {
            xVar.f(this.f3611a.q());
            if (this.f3611a.e()) {
                return;
            } else {
                iB2 = this.f3611a.B();
            }
        } while (iB2 == this.f3612b);
        this.f3614d = iB2;
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public int w() throws z.a {
        W(0);
        return this.f3611a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public long x() throws z.a {
        W(0);
        return this.f3611a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public void y(List<Boolean> list) throws z {
        int iB;
        int iD;
        int iB2;
        if (list instanceof f) {
            f fVar = (f) list;
            int iB3 = k1.b(this.f3612b);
            if (iB3 == 0) {
                do {
                    fVar.k(this.f3611a.m());
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB2 = this.f3611a.B();
                    }
                } while (iB2 == this.f3612b);
                this.f3614d = iB2;
                return;
            }
            if (iB3 != 2) {
                throw z.d();
            }
            iD = this.f3611a.d() + this.f3611a.C();
            do {
                fVar.k(this.f3611a.m());
            } while (this.f3611a.d() < iD);
        } else {
            int iB4 = k1.b(this.f3612b);
            if (iB4 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f3611a.m()));
                    if (this.f3611a.e()) {
                        return;
                    } else {
                        iB = this.f3611a.B();
                    }
                } while (iB == this.f3612b);
                this.f3614d = iB;
                return;
            }
            if (iB4 != 2) {
                throw z.d();
            }
            iD = this.f3611a.d() + this.f3611a.C();
            do {
                list.add(Boolean.valueOf(this.f3611a.m()));
            } while (this.f3611a.d() < iD);
        }
        V(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public String z() throws z.a {
        W(2);
        return this.f3611a.z();
    }
}
