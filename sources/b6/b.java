package b6;

import ae.r;
import ae.s;
import hf.g0;
import hf.k;
import hf.z;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import je.j;
import je.v;
import je.w;
import le.j0;
import le.n0;
import le.o0;
import le.w2;
import md.i0;
import md.u;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Closeable, Flushable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f5469s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final j f5470t = new j("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f5471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f5472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z f5475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z f5476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final z f5477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final LinkedHashMap<String, c> f5478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n0 f5479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f5480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private hf.d f5482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f5484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f5485o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f5486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f5487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final e f5488r;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: b6.b$b, reason: collision with other inner class name */
    public final class C0130b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f5489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f5490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean[] f5491c;

        public C0130b(c cVar) {
            this.f5489a = cVar;
            this.f5491c = new boolean[b.this.f5474d];
        }

        private final void d(boolean z10) {
            b bVar = b.this;
            synchronized (bVar) {
                if (!(!this.f5490b)) {
                    throw new IllegalStateException("editor is closed".toString());
                }
                if (r.b(this.f5489a.b(), this)) {
                    bVar.Q(this, z10);
                }
                this.f5490b = true;
                i0 i0Var = i0.f15558a;
            }
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        public final d c() {
            d dVarZ;
            b bVar = b.this;
            synchronized (bVar) {
                b();
                dVarZ = bVar.Z(this.f5489a.d());
            }
            return dVarZ;
        }

        public final void e() {
            if (r.b(this.f5489a.b(), this)) {
                this.f5489a.m(true);
            }
        }

        public final z f(int i10) {
            z zVar;
            b bVar = b.this;
            synchronized (bVar) {
                if (!(!this.f5490b)) {
                    throw new IllegalStateException("editor is closed".toString());
                }
                this.f5491c[i10] = true;
                z zVar2 = this.f5489a.c().get(i10);
                o6.e.a(bVar.f5488r, zVar2);
                zVar = zVar2;
            }
            return zVar;
        }

        public final c g() {
            return this.f5489a;
        }

        public final boolean[] h() {
            return this.f5491c;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f5493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f5494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList<z> f5495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ArrayList<z> f5496d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f5497e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f5498f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private C0130b f5499g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f5500h;

        public c(String str) {
            this.f5493a = str;
            this.f5494b = new long[b.this.f5474d];
            this.f5495c = new ArrayList<>(b.this.f5474d);
            this.f5496d = new ArrayList<>(b.this.f5474d);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(com.amazon.a.a.o.c.a.b.f7490a);
            int length = sb2.length();
            int i10 = b.this.f5474d;
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(i11);
                this.f5495c.add(b.this.f5471a.p(sb2.toString()));
                sb2.append(".tmp");
                this.f5496d.add(b.this.f5471a.p(sb2.toString()));
                sb2.setLength(length);
            }
        }

        public final ArrayList<z> a() {
            return this.f5495c;
        }

        public final C0130b b() {
            return this.f5499g;
        }

        public final ArrayList<z> c() {
            return this.f5496d;
        }

        public final String d() {
            return this.f5493a;
        }

        public final long[] e() {
            return this.f5494b;
        }

        public final int f() {
            return this.f5500h;
        }

        public final boolean g() {
            return this.f5497e;
        }

        public final boolean h() {
            return this.f5498f;
        }

        public final void i(C0130b c0130b) {
            this.f5499g = c0130b;
        }

        public final void j(List<String> list) throws IOException {
            if (list.size() != b.this.f5474d) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f5494b[i10] = Long.parseLong(list.get(i10));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void k(int i10) {
            this.f5500h = i10;
        }

        public final void l(boolean z10) {
            this.f5497e = z10;
        }

        public final void m(boolean z10) {
            this.f5498f = z10;
        }

        public final d n() {
            if (!this.f5497e || this.f5499g != null || this.f5498f) {
                return null;
            }
            ArrayList<z> arrayList = this.f5495c;
            b bVar = b.this;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!bVar.f5488r.j(arrayList.get(i10))) {
                    try {
                        bVar.n0(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.f5500h++;
            return b.this.new d(this);
        }

        public final void o(hf.d dVar) {
            for (long j10 : this.f5494b) {
                dVar.writeByte(32).c0(j10);
            }
        }
    }

    public final class d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f5502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f5503b;

        public d(c cVar) {
            this.f5502a = cVar;
        }

        public final C0130b a() {
            C0130b c0130bY;
            b bVar = b.this;
            synchronized (bVar) {
                close();
                c0130bY = bVar.Y(this.f5502a.d());
            }
            return c0130bY;
        }

        public final z b(int i10) {
            if (!this.f5503b) {
                return this.f5502a.a().get(i10);
            }
            throw new IllegalStateException("snapshot is closed".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f5503b) {
                return;
            }
            this.f5503b = true;
            b bVar = b.this;
            synchronized (bVar) {
                this.f5502a.k(r1.f() - 1);
                if (this.f5502a.f() == 0 && this.f5502a.h()) {
                    bVar.n0(this.f5502a);
                }
                i0 i0Var = i0.f15558a;
            }
        }
    }

    public static final class e extends k {
        e(hf.j jVar) {
            super(jVar);
        }

        @Override // hf.k, hf.j
        public g0 p(z zVar, boolean z10) {
            z zVarM = zVar.m();
            if (zVarM != null) {
                d(zVarM);
            }
            return super.p(zVar, z10);
        }
    }

    @sd.d(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
    static final class f extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f5505a;

        f(qd.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return b.this.new f(dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((f) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f5505a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            b bVar = b.this;
            synchronized (bVar) {
                if (!bVar.f5484n || bVar.f5485o) {
                    return i0.f15558a;
                }
                try {
                    bVar.p0();
                } catch (IOException unused) {
                    bVar.f5486p = true;
                }
                try {
                    if (bVar.h0()) {
                        bVar.r0();
                    }
                } catch (IOException unused2) {
                    bVar.f5487q = true;
                    bVar.f5482l = hf.u.c(hf.u.b());
                }
                return i0.f15558a;
            }
        }
    }

    static final class g extends s implements l<IOException, i0> {
        g() {
            super(1);
        }

        public final void a(IOException iOException) {
            b.this.f5483m = true;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(IOException iOException) {
            a(iOException);
            return i0.f15558a;
        }
    }

    public b(hf.j jVar, z zVar, j0 j0Var, long j10, int i10, int i11) {
        this.f5471a = zVar;
        this.f5472b = j10;
        this.f5473c = i10;
        this.f5474d = i11;
        if (!(j10 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (!(i11 > 0)) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.f5475e = zVar.p("journal");
        this.f5476f = zVar.p("journal.tmp");
        this.f5477g = zVar.p("journal.bkp");
        this.f5478h = new LinkedHashMap<>(0, 0.75f, true);
        this.f5479i = o0.a(w2.b(null, 1, null).plus(j0Var.j0(1)));
        this.f5488r = new e(jVar);
    }

    private final void P() {
        if (!(!this.f5485o)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void Q(C0130b c0130b, boolean z10) {
        c cVarG = c0130b.g();
        if (!r.b(cVarG.b(), c0130b)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int i10 = 0;
        if (!z10 || cVarG.h()) {
            int i11 = this.f5474d;
            while (i10 < i11) {
                this.f5488r.h(cVarG.c().get(i10));
                i10++;
            }
        } else {
            int i12 = this.f5474d;
            for (int i13 = 0; i13 < i12; i13++) {
                if (c0130b.h()[i13] && !this.f5488r.j(cVarG.c().get(i13))) {
                    c0130b.a();
                    return;
                }
            }
            int i14 = this.f5474d;
            while (i10 < i14) {
                z zVar = cVarG.c().get(i10);
                z zVar2 = cVarG.a().get(i10);
                if (this.f5488r.j(zVar)) {
                    this.f5488r.c(zVar, zVar2);
                } else {
                    o6.e.a(this.f5488r, cVarG.a().get(i10));
                }
                long j10 = cVarG.e()[i10];
                Long lD = this.f5488r.l(zVar2).d();
                long jLongValue = lD != null ? lD.longValue() : 0L;
                cVarG.e()[i10] = jLongValue;
                this.f5480j = (this.f5480j - j10) + jLongValue;
                i10++;
            }
        }
        cVarG.i(null);
        if (cVarG.h()) {
            n0(cVarG);
            return;
        }
        this.f5481k++;
        hf.d dVar = this.f5482l;
        r.c(dVar);
        if (z10 || cVarG.g()) {
            cVarG.l(true);
            dVar.z("CLEAN");
            dVar.writeByte(32);
            dVar.z(cVarG.d());
            cVarG.o(dVar);
        } else {
            this.f5478h.remove(cVarG.d());
            dVar.z("REMOVE");
            dVar.writeByte(32);
            dVar.z(cVarG.d());
        }
        dVar.writeByte(10);
        dVar.flush();
        if (this.f5480j > this.f5472b || h0()) {
            i0();
        }
    }

    private final void U() throws IOException {
        close();
        o6.e.b(this.f5488r, this.f5471a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h0() {
        return this.f5481k >= 2000;
    }

    private final void i0() {
        le.k.d(this.f5479i, null, null, new f(null), 3, null);
    }

    private final hf.d j0() {
        return hf.u.c(new b6.c(this.f5488r.a(this.f5475e), new g()));
    }

    private final void k0() {
        Iterator<c> it = this.f5478h.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            c next = it.next();
            int i10 = 0;
            if (next.b() == null) {
                int i11 = this.f5474d;
                while (i10 < i11) {
                    j10 += next.e()[i10];
                    i10++;
                }
            } else {
                next.i(null);
                int i12 = this.f5474d;
                while (i10 < i12) {
                    this.f5488r.h(next.a().get(i10));
                    this.f5488r.h(next.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f5480j = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l0() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.b.l0():void");
    }

    private final void m0(String str) throws IOException {
        String strSubstring;
        int iX = w.X(str, ' ', 0, false, 6, null);
        if (iX == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iX + 1;
        int iX2 = w.X(str, ' ', i10, false, 4, null);
        if (iX2 == -1) {
            strSubstring = str.substring(i10);
            r.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (iX == 6 && v.G(str, "REMOVE", false, 2, null)) {
                this.f5478h.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iX2);
            r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        LinkedHashMap<String, c> linkedHashMap = this.f5478h;
        c cVar = linkedHashMap.get(strSubstring);
        if (cVar == null) {
            cVar = new c(strSubstring);
            linkedHashMap.put(strSubstring, cVar);
        }
        c cVar2 = cVar;
        if (iX2 != -1 && iX == 5 && v.G(str, "CLEAN", false, 2, null)) {
            String strSubstring2 = str.substring(iX2 + 1);
            r.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            List<String> listB0 = w.B0(strSubstring2, new char[]{' '}, false, 0, 6, null);
            cVar2.l(true);
            cVar2.i(null);
            cVar2.j(listB0);
            return;
        }
        if (iX2 == -1 && iX == 5 && v.G(str, "DIRTY", false, 2, null)) {
            cVar2.i(new C0130b(cVar2));
            return;
        }
        if (iX2 == -1 && iX == 4 && v.G(str, "READ", false, 2, null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n0(c cVar) {
        hf.d dVar;
        if (cVar.f() > 0 && (dVar = this.f5482l) != null) {
            dVar.z("DIRTY");
            dVar.writeByte(32);
            dVar.z(cVar.d());
            dVar.writeByte(10);
            dVar.flush();
        }
        if (cVar.f() > 0 || cVar.b() != null) {
            cVar.m(true);
            return true;
        }
        int i10 = this.f5474d;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f5488r.h(cVar.a().get(i11));
            this.f5480j -= cVar.e()[i11];
            cVar.e()[i11] = 0;
        }
        this.f5481k++;
        hf.d dVar2 = this.f5482l;
        if (dVar2 != null) {
            dVar2.z("REMOVE");
            dVar2.writeByte(32);
            dVar2.z(cVar.d());
            dVar2.writeByte(10);
        }
        this.f5478h.remove(cVar.d());
        if (h0()) {
            i0();
        }
        return true;
    }

    private final boolean o0() {
        for (c cVar : this.f5478h.values()) {
            if (!cVar.h()) {
                n0(cVar);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0() {
        while (this.f5480j > this.f5472b) {
            if (!o0()) {
                return;
            }
        }
        this.f5486p = false;
    }

    private final void q0(String str) {
        if (f5470t.e(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void r0() {
        i0 i0Var;
        hf.d dVar = this.f5482l;
        if (dVar != null) {
            dVar.close();
        }
        hf.d dVarC = hf.u.c(this.f5488r.p(this.f5476f, false));
        Throwable th = null;
        try {
            dVarC.z("libcore.io.DiskLruCache").writeByte(10);
            dVarC.z("1").writeByte(10);
            dVarC.c0(this.f5473c).writeByte(10);
            dVarC.c0(this.f5474d).writeByte(10);
            dVarC.writeByte(10);
            for (c cVar : this.f5478h.values()) {
                if (cVar.b() != null) {
                    dVarC.z("DIRTY");
                    dVarC.writeByte(32);
                    dVarC.z(cVar.d());
                } else {
                    dVarC.z("CLEAN");
                    dVarC.writeByte(32);
                    dVarC.z(cVar.d());
                    cVar.o(dVarC);
                }
                dVarC.writeByte(10);
            }
            i0Var = i0.f15558a;
            if (dVarC != null) {
                try {
                    dVarC.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (dVarC != null) {
                try {
                    dVarC.close();
                } catch (Throwable th4) {
                    md.f.a(th3, th4);
                }
            }
            i0Var = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        r.c(i0Var);
        if (this.f5488r.j(this.f5475e)) {
            this.f5488r.c(this.f5475e, this.f5477g);
            this.f5488r.c(this.f5476f, this.f5475e);
            this.f5488r.h(this.f5477g);
        } else {
            this.f5488r.c(this.f5476f, this.f5475e);
        }
        this.f5482l = j0();
        this.f5481k = 0;
        this.f5483m = false;
        this.f5487q = false;
    }

    public final synchronized C0130b Y(String str) {
        P();
        q0(str);
        g0();
        c cVar = this.f5478h.get(str);
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.f5486p && !this.f5487q) {
            hf.d dVar = this.f5482l;
            r.c(dVar);
            dVar.z("DIRTY");
            dVar.writeByte(32);
            dVar.z(str);
            dVar.writeByte(10);
            dVar.flush();
            if (this.f5483m) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(str);
                this.f5478h.put(str, cVar);
            }
            C0130b c0130b = new C0130b(cVar);
            cVar.i(c0130b);
            return c0130b;
        }
        i0();
        return null;
    }

    public final synchronized d Z(String str) {
        d dVarN;
        P();
        q0(str);
        g0();
        c cVar = this.f5478h.get(str);
        if (cVar != null && (dVarN = cVar.n()) != null) {
            this.f5481k++;
            hf.d dVar = this.f5482l;
            r.c(dVar);
            dVar.z("READ");
            dVar.writeByte(32);
            dVar.z(str);
            dVar.writeByte(10);
            if (h0()) {
                i0();
            }
            return dVarN;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f5484n && !this.f5485o) {
            for (c cVar : (c[]) this.f5478h.values().toArray(new c[0])) {
                C0130b c0130bB = cVar.b();
                if (c0130bB != null) {
                    c0130bB.e();
                }
            }
            p0();
            o0.d(this.f5479i, null, 1, null);
            hf.d dVar = this.f5482l;
            r.c(dVar);
            dVar.close();
            this.f5482l = null;
            this.f5485o = true;
            return;
        }
        this.f5485o = true;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f5484n) {
            P();
            p0();
            hf.d dVar = this.f5482l;
            r.c(dVar);
            dVar.flush();
        }
    }

    public final synchronized void g0() {
        if (this.f5484n) {
            return;
        }
        this.f5488r.h(this.f5476f);
        if (this.f5488r.j(this.f5477g)) {
            if (this.f5488r.j(this.f5475e)) {
                this.f5488r.h(this.f5477g);
            } else {
                this.f5488r.c(this.f5477g, this.f5475e);
            }
        }
        if (this.f5488r.j(this.f5475e)) {
            try {
                l0();
                k0();
                this.f5484n = true;
                return;
            } catch (IOException unused) {
                try {
                    U();
                    this.f5485o = false;
                    r0();
                    this.f5484n = true;
                } catch (Throwable th) {
                    this.f5485o = false;
                    throw th;
                }
            }
        }
        r0();
        this.f5484n = true;
    }
}
