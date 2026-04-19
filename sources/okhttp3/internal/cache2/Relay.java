package okhttp3.internal.cache2;

import ae.j;
import ae.r;
import hf.c;
import hf.f;
import hf.i0;
import hf.j0;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class Relay {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Companion f17113k = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f f17114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f17115m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RandomAccessFile f17116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i0 f17117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f17118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f17119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f17120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Thread f17121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f17122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f17124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17125j;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public final class RelaySource implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j0 f17126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private FileOperator f17127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f17128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Relay f17129d;

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
        
            if (r4 != 2) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
        
            r8 = java.lang.Math.min(r21, r19.f17129d.i() - r19.f17128c);
            r2 = r19.f17127b;
            ae.r.c(r2);
            r2.a(r19.f17128c + 32, r20, r8);
            r19.f17128c += r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
        
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
        
            r0 = r19.f17129d.g();
            ae.r.c(r0);
            r14 = r0.X(r19.f17129d.h(), r19.f17129d.c());
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
        
            if (r14 != (-1)) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00ba, code lost:
        
            r0 = r19.f17129d;
            r0.a(r0.i());
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
        
            r2 = r19.f17129d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
        
            r2.o(null);
            r2.notifyAll();
            r0 = md.i0.f15558a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
        
            r9 = java.lang.Math.min(r14, r21);
            r19.f17129d.h().G(r20, 0, r9);
            r19.f17128c += r9;
            r13 = r19.f17127b;
            ae.r.c(r13);
            r13.b(r19.f17129d.i() + 32, r19.f17129d.h().clone(), r14);
            r2 = r19.f17129d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x010a, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x010b, code lost:
        
            r2.b().v(r2.h(), r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0124, code lost:
        
            if (r2.b().size() <= r2.c()) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0126, code lost:
        
            r2.b().skip(r2.b().size() - r2.c());
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x013a, code lost:
        
            r2.n(r2.i() + r14);
            r0 = md.i0.f15558a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0144, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0145, code lost:
        
            r2 = r19.f17129d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0147, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0148, code lost:
        
            r2.o(null);
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x014e, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x014f, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0156, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
        
            r2 = r19.f17129d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x015a, code lost:
        
            r2.o(null);
            r2.notifyAll();
            r3 = md.i0.f15558a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0163, code lost:
        
            throw r0;
         */
        @Override // hf.i0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long X(hf.c r20, long r21) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 374
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.X(hf.c, long):long");
        }

        @Override // hf.i0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f17127b == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.f17127b = null;
            Relay relay = this.f17129d;
            synchronized (relay) {
                relay.m(relay.f() - 1);
                if (relay.f() == 0) {
                    RandomAccessFile randomAccessFileE = relay.e();
                    relay.l(null);
                    randomAccessFile = randomAccessFileE;
                }
                md.i0 i0Var = md.i0.f15558a;
            }
            if (randomAccessFile == null) {
                return;
            }
            Util.l(randomAccessFile);
        }

        @Override // hf.i0
        public j0 e() {
            return this.f17126a;
        }
    }

    static {
        f.a aVar = f.f11960d;
        f17114l = aVar.d("OkHttp cache v1\n");
        f17115m = aVar.d("OkHttp DIRTY :(\n");
    }

    private final void p(f fVar, long j10, long j11) throws IOException {
        c cVar = new c();
        cVar.g(fVar);
        cVar.y0(j10);
        cVar.y0(j11);
        if (!(cVar.size() == 32)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        RandomAccessFile randomAccessFile = this.f17116a;
        r.c(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        r.e(channel, "file!!.channel");
        new FileOperator(channel).b(0L, cVar, 32L);
    }

    private final void q(long j10) throws IOException {
        c cVar = new c();
        cVar.g(this.f17119d);
        RandomAccessFile randomAccessFile = this.f17116a;
        r.c(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        r.e(channel, "file!!.channel");
        new FileOperator(channel).b(32 + j10, cVar, this.f17119d.F());
    }

    public final void a(long j10) throws IOException {
        q(j10);
        RandomAccessFile randomAccessFile = this.f17116a;
        r.c(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        p(f17114l, j10, this.f17119d.F());
        RandomAccessFile randomAccessFile2 = this.f17116a;
        r.c(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            k(true);
            md.i0 i0Var = md.i0.f15558a;
        }
        i0 i0Var2 = this.f17117b;
        if (i0Var2 != null) {
            Util.l(i0Var2);
        }
        this.f17117b = null;
    }

    public final c b() {
        return this.f17124i;
    }

    public final long c() {
        return this.f17120e;
    }

    public final boolean d() {
        return this.f17123h;
    }

    public final RandomAccessFile e() {
        return this.f17116a;
    }

    public final int f() {
        return this.f17125j;
    }

    public final i0 g() {
        return this.f17117b;
    }

    public final c h() {
        return this.f17122g;
    }

    public final long i() {
        return this.f17118c;
    }

    public final Thread j() {
        return this.f17121f;
    }

    public final void k(boolean z10) {
        this.f17123h = z10;
    }

    public final void l(RandomAccessFile randomAccessFile) {
        this.f17116a = randomAccessFile;
    }

    public final void m(int i10) {
        this.f17125j = i10;
    }

    public final void n(long j10) {
        this.f17118c = j10;
    }

    public final void o(Thread thread) {
        this.f17121f = thread;
    }
}
