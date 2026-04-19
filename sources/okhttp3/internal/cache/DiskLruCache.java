package okhttp3.internal.cache;

import ae.r;
import com.amazon.a.a.o.c.a.b;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import hf.d;
import hf.e;
import hf.g0;
import hf.m;
import hf.u;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import je.j;
import je.v;
import je.w;
import md.i;
import md.i0;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
public final class DiskLruCache implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileSystem f17058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f17059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f17061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f17062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final File f17063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f17064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final File f17065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f17066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f17067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final LinkedHashMap<String, Entry> f17068k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f17069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f17070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f17071n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f17072o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f17073p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f17074q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f17075r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f17076s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TaskQueue f17077t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final DiskLruCache$cleanupTask$1 f17078u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Companion f17053v = new Companion(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f17054w = "journal";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f17055x = "journal.tmp";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f17056y = "journal.bkp";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f17057z = "libcore.io.DiskLruCache";
    public static final String A = "1";
    public static final long B = -1;
    public static final j C = new j("[a-z0-9_-]{1,120}");
    public static final String D = "CLEAN";
    public static final String E = "DIRTY";
    public static final String F = "REMOVE";
    public static final String G = "READ";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ae.j jVar) {
            this();
        }
    }

    public final class Editor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Entry f17079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f17080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f17081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ DiskLruCache f17082d;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            r.f(diskLruCache, "this$0");
            r.f(entry, "entry");
            this.f17082d = diskLruCache;
            this.f17079a = entry;
            this.f17080b = entry.g() ? null : new boolean[diskLruCache.Z()];
        }

        public final void a() {
            DiskLruCache diskLruCache = this.f17082d;
            synchronized (diskLruCache) {
                if (!(!this.f17081c)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (r.b(d().b(), this)) {
                    diskLruCache.G(this, false);
                }
                this.f17081c = true;
                i0 i0Var = i0.f15558a;
            }
        }

        public final void b() {
            DiskLruCache diskLruCache = this.f17082d;
            synchronized (diskLruCache) {
                if (!(!this.f17081c)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (r.b(d().b(), this)) {
                    diskLruCache.G(this, true);
                }
                this.f17081c = true;
                i0 i0Var = i0.f15558a;
            }
        }

        public final void c() {
            if (r.b(this.f17079a.b(), this)) {
                if (this.f17082d.f17071n) {
                    this.f17082d.G(this, false);
                } else {
                    this.f17079a.q(true);
                }
            }
        }

        public final Entry d() {
            return this.f17079a;
        }

        public final boolean[] e() {
            return this.f17080b;
        }

        public final g0 f(int i10) {
            DiskLruCache diskLruCache = this.f17082d;
            synchronized (diskLruCache) {
                if (!(!this.f17081c)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!r.b(d().b(), this)) {
                    return u.b();
                }
                if (!d().g()) {
                    boolean[] zArrE = e();
                    r.c(zArrE);
                    zArrE[i10] = true;
                }
                try {
                    return new FaultHidingSink(diskLruCache.U().b(d().c().get(i10)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                } catch (FileNotFoundException unused) {
                    return u.b();
                }
            }
        }
    }

    public final class Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f17086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<File> f17087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<File> f17088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f17089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f17090f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Editor f17091g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f17092h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f17093i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ DiskLruCache f17094j;

        public Entry(DiskLruCache diskLruCache, String str) {
            r.f(diskLruCache, "this$0");
            r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
            this.f17094j = diskLruCache;
            this.f17085a = str;
            this.f17086b = new long[diskLruCache.Z()];
            this.f17087c = new ArrayList();
            this.f17088d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(b.f7490a);
            int length = sb2.length();
            int iZ = diskLruCache.Z();
            for (int i10 = 0; i10 < iZ; i10++) {
                sb2.append(i10);
                this.f17087c.add(new File(this.f17094j.Q(), sb2.toString()));
                sb2.append(".tmp");
                this.f17088d.add(new File(this.f17094j.Q(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        private final Void j(List<String> list) throws IOException {
            throw new IOException(r.m("unexpected journal line: ", list));
        }

        private final hf.i0 k(int i10) {
            final hf.i0 i0VarA = this.f17094j.U().a(this.f17087c.get(i10));
            if (this.f17094j.f17071n) {
                return i0VarA;
            }
            this.f17092h++;
            final DiskLruCache diskLruCache = this.f17094j;
            return new m(diskLruCache, this) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private boolean f17095b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ DiskLruCache f17097d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ DiskLruCache.Entry f17098e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(this.f17096c);
                    this.f17097d = diskLruCache;
                    this.f17098e = this;
                }

                @Override // hf.m, hf.i0, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    if (this.f17095b) {
                        return;
                    }
                    this.f17095b = true;
                    DiskLruCache diskLruCache2 = this.f17097d;
                    DiskLruCache.Entry entry = this.f17098e;
                    synchronized (diskLruCache2) {
                        entry.n(entry.f() - 1);
                        if (entry.f() == 0 && entry.i()) {
                            diskLruCache2.o0(entry);
                        }
                        i0 i0Var = i0.f15558a;
                    }
                }
            };
        }

        public final List<File> a() {
            return this.f17087c;
        }

        public final Editor b() {
            return this.f17091g;
        }

        public final List<File> c() {
            return this.f17088d;
        }

        public final String d() {
            return this.f17085a;
        }

        public final long[] e() {
            return this.f17086b;
        }

        public final int f() {
            return this.f17092h;
        }

        public final boolean g() {
            return this.f17089e;
        }

        public final long h() {
            return this.f17093i;
        }

        public final boolean i() {
            return this.f17090f;
        }

        public final void l(Editor editor) {
            this.f17091g = editor;
        }

        public final void m(List<String> list) throws IOException {
            r.f(list, "strings");
            if (list.size() != this.f17094j.Z()) {
                j(list);
                throw new i();
            }
            int i10 = 0;
            try {
                int size = list.size();
                while (i10 < size) {
                    int i11 = i10 + 1;
                    this.f17086b[i10] = Long.parseLong(list.get(i10));
                    i10 = i11;
                }
            } catch (NumberFormatException unused) {
                j(list);
                throw new i();
            }
        }

        public final void n(int i10) {
            this.f17092h = i10;
        }

        public final void o(boolean z10) {
            this.f17089e = z10;
        }

        public final void p(long j10) {
            this.f17093i = j10;
        }

        public final void q(boolean z10) {
            this.f17090f = z10;
        }

        public final Snapshot r() {
            DiskLruCache diskLruCache = this.f17094j;
            if (Util.f17028h && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + diskLruCache);
            }
            if (!this.f17089e) {
                return null;
            }
            if (!this.f17094j.f17071n && (this.f17091g != null || this.f17090f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f17086b.clone();
            try {
                int iZ = this.f17094j.Z();
                for (int i10 = 0; i10 < iZ; i10++) {
                    arrayList.add(k(i10));
                }
                return new Snapshot(this.f17094j, this.f17085a, this.f17093i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Util.l((hf.i0) it.next());
                }
                try {
                    this.f17094j.o0(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(d dVar) {
            r.f(dVar, "writer");
            long[] jArr = this.f17086b;
            int length = jArr.length;
            int i10 = 0;
            while (i10 < length) {
                long j10 = jArr[i10];
                i10++;
                dVar.writeByte(32).c0(j10);
            }
        }
    }

    public final class Snapshot implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f17100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<hf.i0> f17101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long[] f17102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ DiskLruCache f17103e;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(DiskLruCache diskLruCache, String str, long j10, List<? extends hf.i0> list, long[] jArr) {
            r.f(diskLruCache, "this$0");
            r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
            r.f(list, "sources");
            r.f(jArr, "lengths");
            this.f17103e = diskLruCache;
            this.f17099a = str;
            this.f17100b = j10;
            this.f17101c = list;
            this.f17102d = jArr;
        }

        public final Editor a() {
            return this.f17103e.I(this.f17099a, this.f17100b);
        }

        public final hf.i0 b(int i10) {
            return this.f17101c.get(i10);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<hf.i0> it = this.f17101c.iterator();
            while (it.hasNext()) {
                Util.l(it.next());
            }
        }

        public final String l() {
            return this.f17099a;
        }
    }

    private final synchronized void E() {
        if (!(!this.f17073p)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ Editor L(DiskLruCache diskLruCache, String str, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = B;
        }
        return diskLruCache.I(str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h0() {
        int i10 = this.f17069l;
        return i10 >= 2000 && i10 >= this.f17068k.size();
    }

    private final d i0() {
        return u.c(new FaultHidingSink(this.f17058a.g(this.f17063f), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void j0() {
        this.f17058a.f(this.f17064g);
        Iterator<Entry> it = this.f17068k.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            r.e(next, "i.next()");
            Entry entry = next;
            int i10 = 0;
            if (entry.b() == null) {
                int i11 = this.f17061d;
                while (i10 < i11) {
                    this.f17066i += entry.e()[i10];
                    i10++;
                }
            } else {
                entry.l(null);
                int i12 = this.f17061d;
                while (i10 < i12) {
                    this.f17058a.f(entry.a().get(i10));
                    this.f17058a.f(entry.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private final void k0() throws IOException {
        e eVarD = u.d(this.f17058a.a(this.f17063f));
        try {
            String strJ = eVarD.J();
            String strJ2 = eVarD.J();
            String strJ3 = eVarD.J();
            String strJ4 = eVarD.J();
            String strJ5 = eVarD.J();
            if (r.b(f17057z, strJ) && r.b(A, strJ2) && r.b(String.valueOf(this.f17060c), strJ3) && r.b(String.valueOf(Z()), strJ4)) {
                int i10 = 0;
                if (!(strJ5.length() > 0)) {
                    while (true) {
                        try {
                            l0(eVarD.J());
                            i10++;
                        } catch (EOFException unused) {
                            this.f17069l = i10 - Y().size();
                            if (eVarD.q()) {
                                this.f17067j = i0();
                            } else {
                                m0();
                            }
                            i0 i0Var = i0.f15558a;
                            xd.b.a(eVarD, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + strJ + ", " + strJ2 + ", " + strJ4 + ", " + strJ5 + ']');
        } finally {
        }
    }

    private final void l0(String str) throws IOException {
        String strSubstring;
        int iX = w.X(str, ' ', 0, false, 6, null);
        if (iX == -1) {
            throw new IOException(r.m("unexpected journal line: ", str));
        }
        int i10 = iX + 1;
        int iX2 = w.X(str, ' ', i10, false, 4, null);
        if (iX2 == -1) {
            strSubstring = str.substring(i10);
            r.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = F;
            if (iX == str2.length() && v.G(str, str2, false, 2, null)) {
                this.f17068k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iX2);
            r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Entry entry = this.f17068k.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            this.f17068k.put(strSubstring, entry);
        }
        if (iX2 != -1) {
            String str3 = D;
            if (iX == str3.length() && v.G(str, str3, false, 2, null)) {
                String strSubstring2 = str.substring(iX2 + 1);
                r.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List<String> listB0 = w.B0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                entry.o(true);
                entry.l(null);
                entry.m(listB0);
                return;
            }
        }
        if (iX2 == -1) {
            String str4 = E;
            if (iX == str4.length() && v.G(str, str4, false, 2, null)) {
                entry.l(new Editor(this, entry));
                return;
            }
        }
        if (iX2 == -1) {
            String str5 = G;
            if (iX == str5.length() && v.G(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException(r.m("unexpected journal line: ", str));
    }

    private final boolean p0() {
        for (Entry entry : this.f17068k.values()) {
            if (!entry.i()) {
                r.e(entry, "toEvict");
                o0(entry);
                return true;
            }
        }
        return false;
    }

    private final void r0(String str) {
        if (C.e(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final synchronized void G(Editor editor, boolean z10) {
        r.f(editor, "editor");
        Entry entryD = editor.d();
        if (!r.b(entryD.b(), editor)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int i10 = 0;
        if (z10 && !entryD.g()) {
            int i11 = this.f17061d;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12 + 1;
                boolean[] zArrE = editor.e();
                r.c(zArrE);
                if (!zArrE[i12]) {
                    editor.a();
                    throw new IllegalStateException(r.m("Newly created entry didn't create value for index ", Integer.valueOf(i12)));
                }
                if (!this.f17058a.d(entryD.c().get(i12))) {
                    editor.a();
                    return;
                }
                i12 = i13;
            }
        }
        int i14 = this.f17061d;
        while (i10 < i14) {
            int i15 = i10 + 1;
            File file = entryD.c().get(i10);
            if (!z10 || entryD.i()) {
                this.f17058a.f(file);
            } else if (this.f17058a.d(file)) {
                File file2 = entryD.a().get(i10);
                this.f17058a.e(file, file2);
                long j10 = entryD.e()[i10];
                long jH = this.f17058a.h(file2);
                entryD.e()[i10] = jH;
                this.f17066i = (this.f17066i - j10) + jH;
            }
            i10 = i15;
        }
        entryD.l(null);
        if (entryD.i()) {
            o0(entryD);
            return;
        }
        this.f17069l++;
        d dVar = this.f17067j;
        r.c(dVar);
        if (entryD.g() || z10) {
            entryD.o(true);
            dVar.z(D).writeByte(32);
            dVar.z(entryD.d());
            entryD.s(dVar);
            dVar.writeByte(10);
            if (z10) {
                long j11 = this.f17076s;
                this.f17076s = 1 + j11;
                entryD.p(j11);
            }
        } else {
            Y().remove(entryD.d());
            dVar.z(F).writeByte(32);
            dVar.z(entryD.d());
            dVar.writeByte(10);
        }
        dVar.flush();
        if (this.f17066i > this.f17062e || h0()) {
            TaskQueue.j(this.f17077t, this.f17078u, 0L, 2, null);
        }
    }

    public final void H() {
        close();
        this.f17058a.c(this.f17059b);
    }

    public final synchronized Editor I(String str, long j10) {
        r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        g0();
        E();
        r0(str);
        Entry entry = this.f17068k.get(str);
        if (j10 != B && (entry == null || entry.h() != j10)) {
            return null;
        }
        if ((entry == null ? null : entry.b()) != null) {
            return null;
        }
        if (entry != null && entry.f() != 0) {
            return null;
        }
        if (!this.f17074q && !this.f17075r) {
            d dVar = this.f17067j;
            r.c(dVar);
            dVar.z(E).writeByte(32).z(str).writeByte(10);
            dVar.flush();
            if (this.f17070m) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, str);
                this.f17068k.put(str, entry);
            }
            Editor editor = new Editor(this, entry);
            entry.l(editor);
            return editor;
        }
        TaskQueue.j(this.f17077t, this.f17078u, 0L, 2, null);
        return null;
    }

    public final synchronized Snapshot M(String str) {
        r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        g0();
        E();
        r0(str);
        Entry entry = this.f17068k.get(str);
        if (entry == null) {
            return null;
        }
        Snapshot snapshotR = entry.r();
        if (snapshotR == null) {
            return null;
        }
        this.f17069l++;
        d dVar = this.f17067j;
        r.c(dVar);
        dVar.z(G).writeByte(32).z(str).writeByte(10);
        if (h0()) {
            TaskQueue.j(this.f17077t, this.f17078u, 0L, 2, null);
        }
        return snapshotR;
    }

    public final boolean P() {
        return this.f17073p;
    }

    public final File Q() {
        return this.f17059b;
    }

    public final FileSystem U() {
        return this.f17058a;
    }

    public final LinkedHashMap<String, Entry> Y() {
        return this.f17068k;
    }

    public final int Z() {
        return this.f17061d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        Editor editorB;
        if (this.f17072o && !this.f17073p) {
            Collection<Entry> collectionValues = this.f17068k.values();
            r.e(collectionValues, "lruEntries.values");
            int i10 = 0;
            Object[] array = collectionValues.toArray(new Entry[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Entry[] entryArr = (Entry[]) array;
            int length = entryArr.length;
            while (i10 < length) {
                Entry entry = entryArr[i10];
                i10++;
                if (entry.b() != null && (editorB = entry.b()) != null) {
                    editorB.c();
                }
            }
            q0();
            d dVar = this.f17067j;
            r.c(dVar);
            dVar.close();
            this.f17067j = null;
            this.f17073p = true;
            return;
        }
        this.f17073p = true;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f17072o) {
            E();
            q0();
            d dVar = this.f17067j;
            r.c(dVar);
            dVar.flush();
        }
    }

    public final synchronized void g0() {
        if (Util.f17028h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (this.f17072o) {
            return;
        }
        if (this.f17058a.d(this.f17065h)) {
            if (this.f17058a.d(this.f17063f)) {
                this.f17058a.f(this.f17065h);
            } else {
                this.f17058a.e(this.f17065h, this.f17063f);
            }
        }
        this.f17071n = Util.E(this.f17058a, this.f17065h);
        if (this.f17058a.d(this.f17063f)) {
            try {
                k0();
                j0();
                this.f17072o = true;
                return;
            } catch (IOException e10) {
                Platform.f17567a.g().k("DiskLruCache " + this.f17059b + " is corrupt: " + ((Object) e10.getMessage()) + ", removing", 5, e10);
                try {
                    H();
                    this.f17073p = false;
                    m0();
                    this.f17072o = true;
                } catch (Throwable th) {
                    this.f17073p = false;
                    throw th;
                }
            }
        }
        m0();
        this.f17072o = true;
    }

    public final synchronized void m0() {
        d dVar = this.f17067j;
        if (dVar != null) {
            dVar.close();
        }
        d dVarC = u.c(this.f17058a.b(this.f17064g));
        try {
            dVarC.z(f17057z).writeByte(10);
            dVarC.z(A).writeByte(10);
            dVarC.c0(this.f17060c).writeByte(10);
            dVarC.c0(Z()).writeByte(10);
            dVarC.writeByte(10);
            for (Entry entry : Y().values()) {
                if (entry.b() != null) {
                    dVarC.z(E).writeByte(32);
                    dVarC.z(entry.d());
                } else {
                    dVarC.z(D).writeByte(32);
                    dVarC.z(entry.d());
                    entry.s(dVarC);
                }
                dVarC.writeByte(10);
            }
            i0 i0Var = i0.f15558a;
            xd.b.a(dVarC, null);
            if (this.f17058a.d(this.f17063f)) {
                this.f17058a.e(this.f17063f, this.f17065h);
            }
            this.f17058a.e(this.f17064g, this.f17063f);
            this.f17058a.f(this.f17065h);
            this.f17067j = i0();
            this.f17070m = false;
            this.f17075r = false;
        } finally {
        }
    }

    public final synchronized boolean n0(String str) {
        r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        g0();
        E();
        r0(str);
        Entry entry = this.f17068k.get(str);
        if (entry == null) {
            return false;
        }
        boolean zO0 = o0(entry);
        if (zO0 && this.f17066i <= this.f17062e) {
            this.f17074q = false;
        }
        return zO0;
    }

    public final boolean o0(Entry entry) {
        d dVar;
        r.f(entry, "entry");
        if (!this.f17071n) {
            if (entry.f() > 0 && (dVar = this.f17067j) != null) {
                dVar.z(E);
                dVar.writeByte(32);
                dVar.z(entry.d());
                dVar.writeByte(10);
                dVar.flush();
            }
            if (entry.f() > 0 || entry.b() != null) {
                entry.q(true);
                return true;
            }
        }
        Editor editorB = entry.b();
        if (editorB != null) {
            editorB.c();
        }
        int i10 = this.f17061d;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f17058a.f(entry.a().get(i11));
            this.f17066i -= entry.e()[i11];
            entry.e()[i11] = 0;
        }
        this.f17069l++;
        d dVar2 = this.f17067j;
        if (dVar2 != null) {
            dVar2.z(F);
            dVar2.writeByte(32);
            dVar2.z(entry.d());
            dVar2.writeByte(10);
        }
        this.f17068k.remove(entry.d());
        if (h0()) {
            TaskQueue.j(this.f17077t, this.f17078u, 0L, 2, null);
        }
        return true;
    }

    public final void q0() {
        while (this.f17066i > this.f17062e) {
            if (!p0()) {
                return;
            }
        }
        this.f17074q = false;
    }
}
