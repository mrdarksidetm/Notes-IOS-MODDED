package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.k1;
import androidx.datastore.preferences.protobuf.n0;
import androidx.datastore.preferences.protobuf.t.b;
import androidx.datastore.preferences.protobuf.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class t<T extends b<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final t f3735d = new t(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c1<T, Object> f3736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3738c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f3740b;

        static {
            int[] iArr = new int[k1.b.values().length];
            f3740b = iArr;
            try {
                iArr[k1.b.f3663c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3740b[k1.b.f3664d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3740b[k1.b.f3665e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3740b[k1.b.f3666f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3740b[k1.b.f3667g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3740b[k1.b.f3668h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3740b[k1.b.f3669i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3740b[k1.b.f3670j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3740b[k1.b.f3672l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3740b[k1.b.f3673m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3740b[k1.b.f3671k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3740b[k1.b.f3674n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3740b[k1.b.f3675o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3740b[k1.b.f3677q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3740b[k1.b.f3678r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3740b[k1.b.f3679s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3740b[k1.b.f3680t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f3740b[k1.b.f3676p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[k1.c.values().length];
            f3739a = iArr2;
            try {
                iArr2[k1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f3739a[k1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f3739a[k1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f3739a[k1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f3739a[k1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f3739a[k1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f3739a[k1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f3739a[k1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f3739a[k1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        int d();

        boolean e();

        k1.b f();

        k1.c g();

        boolean h();

        n0.a k(n0.a aVar, n0 n0Var);
    }

    private t() {
        this.f3736a = c1.s(16);
    }

    private t(c1<T, Object> c1Var) {
        this.f3736a = c1Var;
        t();
    }

    private t(boolean z10) {
        this(c1.s(0));
        t();
    }

    static void A(j jVar, k1.b bVar, Object obj) {
        switch (a.f3740b[bVar.ordinal()]) {
            case 1:
                jVar.r0(((Double) obj).doubleValue());
                return;
            case 2:
                jVar.z0(((Float) obj).floatValue());
                return;
            case 3:
                jVar.H0(((Long) obj).longValue());
                return;
            case 4:
                jVar.a1(((Long) obj).longValue());
                return;
            case 5:
                jVar.F0(((Integer) obj).intValue());
                return;
            case 6:
                jVar.x0(((Long) obj).longValue());
                return;
            case 7:
                jVar.v0(((Integer) obj).intValue());
                return;
            case 8:
                jVar.l0(((Boolean) obj).booleanValue());
                return;
            case 9:
                jVar.C0((n0) obj);
                return;
            case 10:
                jVar.J0((n0) obj);
                return;
            case 11:
                if (!(obj instanceof g)) {
                    jVar.V0((String) obj);
                    return;
                }
                break;
            case 12:
                if (!(obj instanceof g)) {
                    jVar.m0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                jVar.Y0(((Integer) obj).intValue());
                return;
            case 14:
                jVar.N0(((Integer) obj).intValue());
                return;
            case 15:
                jVar.P0(((Long) obj).longValue());
                return;
            case 16:
                jVar.R0(((Integer) obj).intValue());
                return;
            case 17:
                jVar.T0(((Long) obj).longValue());
                return;
            case 18:
                jVar.t0(obj instanceof y.c ? ((y.c) obj).d() : ((Integer) obj).intValue());
                return;
            default:
                return;
        }
        jVar.p0((g) obj);
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int d(k1.b bVar, int i10, Object obj) {
        int iV = j.V(i10);
        if (bVar == k1.b.f3672l) {
            iV *= 2;
        }
        return iV + e(bVar, obj);
    }

    static int e(k1.b bVar, Object obj) {
        switch (a.f3740b[bVar.ordinal()]) {
            case 1:
                return j.j(((Double) obj).doubleValue());
            case 2:
                return j.r(((Float) obj).floatValue());
            case 3:
                return j.y(((Long) obj).longValue());
            case 4:
                return j.Z(((Long) obj).longValue());
            case 5:
                return j.w(((Integer) obj).intValue());
            case 6:
                return j.p(((Long) obj).longValue());
            case 7:
                return j.n(((Integer) obj).intValue());
            case 8:
                return j.e(((Boolean) obj).booleanValue());
            case 9:
                return j.t((n0) obj);
            case 10:
                return obj instanceof a0 ? j.B((a0) obj) : j.G((n0) obj);
            case 11:
                return obj instanceof g ? j.h((g) obj) : j.U((String) obj);
            case 12:
                return obj instanceof g ? j.h((g) obj) : j.f((byte[]) obj);
            case 13:
                return j.X(((Integer) obj).intValue());
            case 14:
                return j.M(((Integer) obj).intValue());
            case 15:
                return j.O(((Long) obj).longValue());
            case 16:
                return j.Q(((Integer) obj).intValue());
            case 17:
                return j.S(((Long) obj).longValue());
            case 18:
                return obj instanceof y.c ? j.l(((y.c) obj).d()) : j.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        k1.b bVarF = bVar.f();
        int iD = bVar.d();
        if (!bVar.e()) {
            return d(bVarF, iD, obj);
        }
        int iD2 = 0;
        List list = (List) obj;
        if (bVar.h()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iD2 += e(bVarF, it.next());
            }
            return j.V(iD) + iD2 + j.K(iD2);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iD2 += d(bVarF, iD, it2.next());
        }
        return iD2;
    }

    public static <T extends b<T>> t<T> h() {
        return f3735d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.g() != k1.c.MESSAGE || key.e() || key.h()) {
            return f(key, value);
        }
        boolean z10 = value instanceof a0;
        int iD = entry.getKey().d();
        return z10 ? j.z(iD, (a0) value) : j.D(iD, (n0) value);
    }

    static int m(k1.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.b();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.g() == k1.c.MESSAGE) {
            boolean zE = key.e();
            Object value = entry.getValue();
            if (zE) {
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    if (!((n0) it.next()).i()) {
                        return false;
                    }
                }
            } else {
                if (!(value instanceof n0)) {
                    if (value instanceof a0) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((n0) value).i()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean r(k1.b bVar, Object obj) {
        y.a(obj);
        switch (a.f3739a[bVar.a().ordinal()]) {
            case 7:
                if (!(obj instanceof g) && !(obj instanceof byte[])) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof y.c)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof n0) && !(obj instanceof a0)) {
                    break;
                }
                break;
        }
        return false;
    }

    private void v(Map.Entry<T, Object> entry) {
        c1<T, Object> c1Var;
        Object objC;
        Object objI;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof a0) {
            value = ((a0) value).f();
        }
        if (key.e()) {
            Object objI2 = i(key);
            if (objI2 == null) {
                objI2 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objI2).add(c(it.next()));
            }
            this.f3736a.put(key, objI2);
            return;
        }
        if (key.g() != k1.c.MESSAGE || (objI = i(key)) == null) {
            c1Var = this.f3736a;
            objC = c(value);
        } else {
            objC = key.k(((n0) objI).c(), (n0) value).build();
            c1Var = this.f3736a;
        }
        c1Var.put(key, objC);
    }

    public static <T extends b<T>> t<T> w() {
        return new t<>();
    }

    private void y(k1.b bVar, Object obj) {
        if (!r(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void z(j jVar, k1.b bVar, int i10, Object obj) {
        if (bVar == k1.b.f3672l) {
            jVar.A0(i10, (n0) obj);
        } else {
            jVar.W0(i10, m(bVar, false));
            A(jVar, bVar, obj);
        }
    }

    public void a(T t10, Object obj) {
        List arrayList;
        if (!t10.e()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        y(t10.f(), obj);
        Object objI = i(t10);
        if (objI == null) {
            arrayList = new ArrayList();
            this.f3736a.put(t10, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t<T> clone() {
        t<T> tVarW = w();
        for (int i10 = 0; i10 < this.f3736a.m(); i10++) {
            Map.Entry<K, Object> entryL = this.f3736a.l(i10);
            tVarW.x((b) entryL.getKey(), entryL.getValue());
        }
        Iterator it = this.f3736a.o().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            tVarW.x((b) entry.getKey(), entry.getValue());
        }
        tVarW.f3738c = this.f3738c;
        return tVarW;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.f3736a.equals(((t) obj).f3736a);
        }
        return false;
    }

    Iterator<Map.Entry<T, Object>> g() {
        return this.f3738c ? new a0.c(this.f3736a.i().iterator()) : this.f3736a.i().iterator();
    }

    public int hashCode() {
        return this.f3736a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f3736a.get(t10);
        return obj instanceof a0 ? ((a0) obj).f() : obj;
    }

    public int j() {
        int iK = 0;
        for (int i10 = 0; i10 < this.f3736a.m(); i10++) {
            iK += k(this.f3736a.l(i10));
        }
        Iterator it = this.f3736a.o().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public int l() {
        int iF = 0;
        for (int i10 = 0; i10 < this.f3736a.m(); i10++) {
            Map.Entry<K, Object> entryL = this.f3736a.l(i10);
            iF += f((b) entryL.getKey(), entryL.getValue());
        }
        Iterator it = this.f3736a.o().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    boolean n() {
        return this.f3736a.isEmpty();
    }

    public boolean o() {
        return this.f3737b;
    }

    public boolean p() {
        for (int i10 = 0; i10 < this.f3736a.m(); i10++) {
            if (!q(this.f3736a.l(i10))) {
                return false;
            }
        }
        Iterator it = this.f3736a.o().iterator();
        while (it.hasNext()) {
            if (!q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        return this.f3738c ? new a0.c(this.f3736a.entrySet().iterator()) : this.f3736a.entrySet().iterator();
    }

    public void t() {
        if (this.f3737b) {
            return;
        }
        this.f3736a.r();
        this.f3737b = true;
    }

    public void u(t<T> tVar) {
        for (int i10 = 0; i10 < tVar.f3736a.m(); i10++) {
            v(tVar.f3736a.l(i10));
        }
        Iterator it = tVar.f3736a.o().iterator();
        while (it.hasNext()) {
            v((Map.Entry) it.next());
        }
    }

    public void x(T t10, Object obj) {
        if (!t10.e()) {
            y(t10.f(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                y(t10.f(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof a0) {
            this.f3738c = true;
        }
        this.f3736a.put(t10, obj);
    }
}
