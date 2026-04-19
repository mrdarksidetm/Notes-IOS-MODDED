package id;

import id.b;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f12659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f12660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, Integer> f12661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<String, Integer> f12662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f12663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Comparator<b> f12665g;

    class a implements Comparator<b> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            byte b10;
            byte b11;
            int i10 = bVar.f12671e;
            int i11 = bVar2.f12671e;
            do {
                b10 = c.this.f12659a.get(i10);
                b11 = c.this.f12659a.get(i11);
                if (b10 == 0) {
                    return b10 - b11;
                }
                i10++;
                i11++;
            } while (b10 == b11);
            return b10 - b11;
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f12667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f12668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final double f12669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f12670d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f12671e;

        b(int i10, int i11, int i12, double d10) {
            this.f12671e = i10;
            this.f12667a = i11;
            this.f12668b = i12;
            this.f12669c = d10;
            this.f12670d = Long.MIN_VALUE;
        }

        b(int i10, int i11, int i12, long j10) {
            this.f12671e = i10;
            this.f12667a = i11;
            this.f12668b = i12;
            this.f12670d = j10;
            this.f12669c = Double.MIN_VALUE;
        }

        static b f(int i10, int i11, int i12, int i13) {
            return new b(i10, i12, i13, i11);
        }

        static b g(int i10, boolean z10) {
            return new b(i10, 26, 0, z10 ? 1L : 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h(int i10, int i11) {
            return i(this.f12667a, this.f12668b, this.f12670d, i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int i(int i10, int i11, long j10, int i12, int i13) {
            if (id.b.i(i10)) {
                return i11;
            }
            for (int i14 = 1; i14 <= 32; i14 *= 2) {
                int iZ = c.z(((long) ((q(i12, i14) + i12) + (i13 * i14))) - j10);
                if ((1 << iZ) == i14) {
                    return iZ;
                }
            }
            return 3;
        }

        static b j(int i10, float f10) {
            return new b(i10, 3, 2, f10);
        }

        static b k(int i10, double d10) {
            return new b(i10, 3, 3, d10);
        }

        static b l(int i10, int i11) {
            return new b(i10, 1, 1, i11);
        }

        static b m(int i10, int i11) {
            return new b(i10, 1, 2, i11);
        }

        static b n(int i10, long j10) {
            return new b(i10, 1, 3, j10);
        }

        static b o(int i10, int i11) {
            return new b(i10, 1, 0, i11);
        }

        private static byte p(int i10, int i11) {
            return (byte) (i10 | (i11 << 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int q(int i10, int i11) {
            return ((~i10) + 1) & (i11 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte r() {
            return s(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte s(int i10) {
            return p(t(i10), this.f12667a);
        }

        private int t(int i10) {
            return id.b.i(this.f12667a) ? Math.max(this.f12668b, i10) : this.f12668b;
        }
    }

    public c() {
        this(256);
    }

    public c(int i10) {
        this(new id.a(i10), 1);
    }

    public c(e eVar, int i10) {
        this.f12660b = new ArrayList<>();
        this.f12661c = new HashMap<>();
        this.f12662d = new HashMap<>();
        this.f12664f = false;
        this.f12665g = new a();
        this.f12659a = eVar;
        this.f12663e = i10;
    }

    private void A(b bVar, int i10) {
        int i11 = bVar.f12667a;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                C(bVar.f12669c, i10);
                return;
            } else if (i11 != 26) {
                E(bVar.f12670d, i10);
                return;
            }
        }
        D(bVar.f12670d, i10);
    }

    private b B(int i10, byte[] bArr, int i11, boolean z10) {
        int iZ = z(bArr.length);
        D(bArr.length, b(iZ));
        int iF = this.f12659a.f();
        this.f12659a.i(bArr, 0, bArr.length);
        if (z10) {
            this.f12659a.j((byte) 0);
        }
        return b.f(i10, iF, i11, iZ);
    }

    private void C(double d10, int i10) {
        if (i10 == 4) {
            this.f12659a.g((float) d10);
        } else if (i10 == 8) {
            this.f12659a.b(d10);
        }
    }

    private void D(long j10, int i10) {
        if (i10 == 1) {
            this.f12659a.j((byte) j10);
            return;
        }
        if (i10 == 2) {
            this.f12659a.c((short) j10);
        } else if (i10 == 4) {
            this.f12659a.h((int) j10);
        } else {
            if (i10 != 8) {
                return;
            }
            this.f12659a.k(j10);
        }
    }

    private void E(long j10, int i10) {
        D((int) (((long) this.f12659a.f()) - j10), i10);
    }

    private b F(int i10, String str) {
        return B(i10, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    private int b(int i10) {
        int i11 = 1 << i10;
        int iQ = b.q(this.f12659a.f(), i11);
        while (true) {
            int i12 = iQ - 1;
            if (iQ == 0) {
                return i11;
            }
            this.f12659a.j((byte) 0);
            iQ = i12;
        }
    }

    private b d(int i10, int i11) {
        long j10 = i11;
        int iMax = Math.max(0, z(j10));
        int i12 = i10;
        while (i12 < this.f12660b.size()) {
            i12++;
            iMax = Math.max(iMax, b.i(4, 0, this.f12660b.get(i12).f12671e, this.f12659a.f(), i12));
        }
        int iB = b(iMax);
        D(j10, iB);
        int iF = this.f12659a.f();
        while (i10 < this.f12660b.size()) {
            int i13 = this.f12660b.get(i10).f12671e;
            E(this.f12660b.get(i10).f12671e, iB);
            i10++;
        }
        return new b(-1, id.b.p(4, 0), iMax, iF);
    }

    private b e(int i10, int i11, int i12, boolean z10, boolean z11, b bVar) {
        int i13;
        int iP;
        if (z11 && (!z10)) {
            throw new UnsupportedOperationException("Untyped fixed vector is not supported");
        }
        int i14 = i12;
        long j10 = i14;
        int iMax = Math.max(0, z(j10));
        if (bVar != null) {
            iMax = Math.max(iMax, bVar.h(this.f12659a.f(), 0));
            i13 = 3;
        } else {
            i13 = 1;
        }
        int i15 = 4;
        int iMax2 = iMax;
        for (int i16 = i11; i16 < this.f12660b.size(); i16++) {
            iMax2 = Math.max(iMax2, this.f12660b.get(i16).h(this.f12659a.f(), i16 + i13));
            if (z10 && i16 == i11) {
                i15 = this.f12660b.get(i16).f12667a;
                if (!id.b.k(i15)) {
                    throw new b.C0305b("TypedVector does not support this element type");
                }
            }
        }
        int i17 = i11;
        int iB = b(iMax2);
        if (bVar != null) {
            E(bVar.f12670d, iB);
            D(1 << bVar.f12668b, iB);
        }
        if (!z11) {
            D(j10, iB);
        }
        int iF = this.f12659a.f();
        for (int i18 = i17; i18 < this.f12660b.size(); i18++) {
            A(this.f12660b.get(i18), iB);
        }
        if (!z10) {
            while (i17 < this.f12660b.size()) {
                this.f12659a.j(this.f12660b.get(i17).s(iMax2));
                i17++;
            }
        }
        if (bVar != null) {
            iP = 9;
        } else if (z10) {
            if (!z11) {
                i14 = 0;
            }
            iP = id.b.p(i15, i14);
        } else {
            iP = 10;
        }
        return new b(i10, iP, iMax2, iF);
    }

    private int u(String str) {
        if (str == null) {
            return -1;
        }
        int iF = this.f12659a.f();
        if ((this.f12663e & 1) != 0) {
            Integer num = this.f12661c.get(str);
            if (num != null) {
                return num.intValue();
            }
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f12659a.i(bytes, 0, bytes.length);
        } else {
            byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
            this.f12659a.i(bytes2, 0, bytes2.length);
        }
        this.f12659a.j((byte) 0);
        this.f12661c.put(str, Integer.valueOf(iF));
        return iF;
    }

    static int z(long j10) {
        if (j10 <= b.j.a((byte) -1)) {
            return 0;
        }
        if (j10 <= b.j.c((short) -1)) {
            return 1;
        }
        return j10 <= b.j.b(-1) ? 2 : 3;
    }

    public void c() {
        this.f12659a.clear();
        this.f12660b.clear();
        this.f12661c.clear();
        this.f12662d.clear();
        this.f12664f = false;
    }

    public int f(String str, int i10) {
        int iU = u(str);
        ArrayList<b> arrayList = this.f12660b;
        Collections.sort(arrayList.subList(i10, arrayList.size()), this.f12665g);
        b bVarE = e(iU, i10, this.f12660b.size() - i10, false, false, d(i10, this.f12660b.size() - i10));
        while (this.f12660b.size() > i10) {
            this.f12660b.remove(r0.size() - 1);
        }
        this.f12660b.add(bVarE);
        return (int) bVarE.f12670d;
    }

    public int g(String str, int i10, boolean z10, boolean z11) {
        b bVarE = e(u(str), i10, this.f12660b.size() - i10, z10, z11, null);
        while (this.f12660b.size() > i10) {
            this.f12660b.remove(r10.size() - 1);
        }
        this.f12660b.add(bVarE);
        return (int) bVarE.f12670d;
    }

    public ByteBuffer h() {
        int iB = b(this.f12660b.get(0).h(this.f12659a.f(), 0));
        A(this.f12660b.get(0), iB);
        this.f12659a.j(this.f12660b.get(0).r());
        this.f12659a.j((byte) iB);
        this.f12664f = true;
        return ByteBuffer.wrap(this.f12659a.d(), 0, this.f12659a.f());
    }

    public int i(String str, byte[] bArr) {
        b bVarB = B(u(str), bArr, 25, false);
        this.f12660b.add(bVarB);
        return (int) bVarB.f12670d;
    }

    public int j(byte[] bArr) {
        return i(null, bArr);
    }

    public void k(String str, boolean z10) {
        this.f12660b.add(b.g(u(str), z10));
    }

    public void l(boolean z10) {
        k(null, z10);
    }

    public void m(double d10) {
        o(null, d10);
    }

    public void n(float f10) {
        p(null, f10);
    }

    public void o(String str, double d10) {
        this.f12660b.add(b.k(u(str), d10));
    }

    public void p(String str, float f10) {
        this.f12660b.add(b.j(u(str), f10));
    }

    public void q(int i10) {
        s(null, i10);
    }

    public void r(long j10) {
        t(null, j10);
    }

    public void s(String str, int i10) {
        t(str, i10);
    }

    public void t(String str, long j10) {
        ArrayList<b> arrayList;
        b bVarN;
        int iU = u(str);
        if (-128 <= j10 && j10 <= 127) {
            arrayList = this.f12660b;
            bVarN = b.o(iU, (int) j10);
        } else if (-32768 <= j10 && j10 <= 32767) {
            arrayList = this.f12660b;
            bVarN = b.l(iU, (int) j10);
        } else if (-2147483648L > j10 || j10 > 2147483647L) {
            arrayList = this.f12660b;
            bVarN = b.n(iU, j10);
        } else {
            arrayList = this.f12660b;
            bVarN = b.m(iU, (int) j10);
        }
        arrayList.add(bVarN);
    }

    public int v(String str) {
        return w(null, str);
    }

    public int w(String str, String str2) {
        int iU = u(str);
        if ((this.f12663e & 2) == 0) {
            b bVarF = F(iU, str2);
            this.f12660b.add(bVarF);
            return (int) bVarF.f12670d;
        }
        Integer num = this.f12662d.get(str2);
        if (num != null) {
            this.f12660b.add(b.f(iU, num.intValue(), 5, z(str2.length())));
            return num.intValue();
        }
        b bVarF2 = F(iU, str2);
        this.f12662d.put(str2, Integer.valueOf((int) bVarF2.f12670d));
        this.f12660b.add(bVarF2);
        return (int) bVarF2.f12670d;
    }

    public int x() {
        return this.f12660b.size();
    }

    public int y() {
        return this.f12660b.size();
    }
}
