package u2;

import ae.r;
import ae.s;
import l1.j0;
import l1.q1;
import l1.u1;
import l1.z;

/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21582a = a.f21583a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f21583a = new a();

        private a() {
        }

        public final m a(z zVar, float f10) {
            if (zVar == null) {
                return b.f21584b;
            }
            if (zVar instanceof u1) {
                return b(l.b(((u1) zVar).a(), f10));
            }
            if (zVar instanceof q1) {
                return new u2.b((q1) zVar, f10);
            }
            throw new md.q();
        }

        public final m b(long j10) {
            return (j10 > j0.f14524b.j() ? 1 : (j10 == j0.f14524b.j() ? 0 : -1)) != 0 ? new u2.c(j10, null) : b.f21584b;
        }
    }

    public static final class b implements m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21584b = new b();

        private b() {
        }

        @Override // u2.m
        public float a() {
            return Float.NaN;
        }

        @Override // u2.m
        public long c() {
            return j0.f14524b.j();
        }

        @Override // u2.m
        public z e() {
            return null;
        }
    }

    static final class c extends s implements zd.a<Float> {
        c() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(m.this.a());
        }
    }

    static final class d extends s implements zd.a<m> {
        d() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m invoke() {
            return m.this;
        }
    }

    float a();

    default m b(zd.a<? extends m> aVar) {
        return !r.b(this, b.f21584b) ? this : aVar.invoke();
    }

    long c();

    default m d(m mVar) {
        boolean z10 = mVar instanceof u2.b;
        return (z10 && (this instanceof u2.b)) ? new u2.b(((u2.b) mVar).f(), l.c(mVar.a(), new c())) : (!z10 || (this instanceof u2.b)) ? (z10 || !(this instanceof u2.b)) ? mVar.b(new d()) : this : mVar;
    }

    z e();
}
