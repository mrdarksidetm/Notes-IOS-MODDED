package n1;

import k1.l;
import k1.m;
import l1.b0;
import l1.f1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f15731a;

        a(d dVar) {
            this.f15731a = dVar;
        }

        @Override // n1.h
        public void a(f1 f1Var, int i10) {
            this.f15731a.d().a(f1Var, i10);
        }

        @Override // n1.h
        public void b(float f10, float f11, float f12, float f13, int i10) {
            this.f15731a.d().b(f10, f11, f12, f13, i10);
        }

        @Override // n1.h
        public void c(float f10, float f11) {
            this.f15731a.d().c(f10, f11);
        }

        @Override // n1.h
        public void d(float[] fArr) {
            this.f15731a.d().l(fArr);
        }

        @Override // n1.h
        public void f(float f10, float f11, long j10) {
            b0 b0VarD = this.f15731a.d();
            b0VarD.c(k1.f.o(j10), k1.f.p(j10));
            b0VarD.d(f10, f11);
            b0VarD.c(-k1.f.o(j10), -k1.f.p(j10));
        }

        @Override // n1.h
        public void g(float f10, float f11, float f12, float f13) {
            b0 b0VarD = this.f15731a.d();
            d dVar = this.f15731a;
            long jA = m.a(l.i(h()) - (f12 + f10), l.g(h()) - (f13 + f11));
            if (!(l.i(jA) >= 0.0f && l.g(jA) >= 0.0f)) {
                throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
            }
            dVar.b(jA);
            b0VarD.c(f10, f11);
        }

        public long h() {
            return this.f15731a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h b(d dVar) {
        return new a(dVar);
    }
}
