package n0;

import k1.f;
import y1.r;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    public static final class a implements m0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f15664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f15665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.a<r> f15666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ o0.i f15667d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f15668e;

        /* JADX WARN: Multi-variable type inference failed */
        a(zd.a<? extends r> aVar, o0.i iVar, long j10) {
            this.f15666c = aVar;
            this.f15667d = iVar;
            this.f15668e = j10;
            f.a aVar2 = k1.f.f14338b;
            this.f15664a = aVar2.c();
            this.f15665b = aVar2.c();
        }

        @Override // m0.h
        public void a(long j10) {
            r rVarInvoke = this.f15666c.invoke();
            if (rVarInvoke != null) {
                o0.i iVar = this.f15667d;
                if (!rVarInvoke.v()) {
                    return;
                }
                iVar.h(rVarInvoke, j10, o0.g.f16218a.d(), true);
                this.f15664a = j10;
            }
            if (o0.j.b(this.f15667d, this.f15668e)) {
                this.f15665b = k1.f.f14338b.c();
            }
        }

        @Override // m0.h
        public void b() {
            if (o0.j.b(this.f15667d, this.f15668e)) {
                this.f15667d.e();
            }
        }

        @Override // m0.h
        public void c(long j10) {
            r rVarInvoke = this.f15666c.invoke();
            if (rVarInvoke != null) {
                o0.i iVar = this.f15667d;
                long j11 = this.f15668e;
                if (rVarInvoke.v() && o0.j.b(iVar, j11)) {
                    long jT = k1.f.t(this.f15665b, j10);
                    this.f15665b = jT;
                    long jT2 = k1.f.t(this.f15664a, jT);
                    if (iVar.c(rVarInvoke, jT2, this.f15664a, false, o0.g.f16218a.a(), true)) {
                        this.f15664a = jT2;
                        this.f15665b = k1.f.f14338b.c();
                    }
                }
            }
        }

        @Override // m0.h
        public void onCancel() {
            if (o0.j.b(this.f15667d, this.f15668e)) {
                this.f15667d.e();
            }
        }
    }

    public static final class b implements o0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f15669a = k1.f.f14338b.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.a<r> f15670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o0.i f15671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15672d;

        /* JADX WARN: Multi-variable type inference failed */
        b(zd.a<? extends r> aVar, o0.i iVar, long j10) {
            this.f15670b = aVar;
            this.f15671c = iVar;
            this.f15672d = j10;
        }

        @Override // o0.b
        public boolean a(long j10) {
            r rVarInvoke = this.f15670b.invoke();
            if (rVarInvoke == null) {
                return true;
            }
            o0.i iVar = this.f15671c;
            long j11 = this.f15672d;
            if (!rVarInvoke.v() || !o0.j.b(iVar, j11)) {
                return false;
            }
            if (!iVar.c(rVarInvoke, j10, this.f15669a, false, o0.g.f16218a.b(), false)) {
                return true;
            }
            this.f15669a = j10;
            return true;
        }

        @Override // o0.b
        public boolean b(long j10, o0.g gVar) {
            r rVarInvoke = this.f15670b.invoke();
            if (rVarInvoke == null) {
                return false;
            }
            o0.i iVar = this.f15671c;
            long j11 = this.f15672d;
            if (!rVarInvoke.v()) {
                return false;
            }
            iVar.h(rVarInvoke, j10, gVar, false);
            this.f15669a = j10;
            return o0.j.b(iVar, j11);
        }

        @Override // o0.b
        public void c() {
            this.f15671c.e();
        }

        @Override // o0.b
        public boolean d(long j10, o0.g gVar) {
            r rVarInvoke = this.f15670b.invoke();
            if (rVarInvoke == null) {
                return true;
            }
            o0.i iVar = this.f15671c;
            long j11 = this.f15672d;
            if (!rVarInvoke.v() || !o0.j.b(iVar, j11)) {
                return false;
            }
            if (!iVar.c(rVarInvoke, j10, this.f15669a, false, gVar, false)) {
                return true;
            }
            this.f15669a = j10;
            return true;
        }

        @Override // o0.b
        public boolean e(long j10) {
            r rVarInvoke = this.f15670b.invoke();
            if (rVarInvoke == null) {
                return false;
            }
            o0.i iVar = this.f15671c;
            long j11 = this.f15672d;
            if (!rVarInvoke.v()) {
                return false;
            }
            if (iVar.c(rVarInvoke, j10, this.f15669a, false, o0.g.f16218a.b(), false)) {
                this.f15669a = j10;
            }
            return o0.j.b(iVar, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.e b(o0.i iVar, long j10, zd.a<? extends r> aVar) {
        a aVar2 = new a(aVar, iVar, j10);
        return o0.h.h(androidx.compose.ui.e.f2662a, new b(aVar, iVar, j10), aVar2);
    }
}
