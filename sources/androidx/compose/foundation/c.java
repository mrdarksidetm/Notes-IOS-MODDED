package androidx.compose.foundation;

import ae.s;
import b2.u0;
import b2.w0;
import l1.j0;
import l1.m1;
import l1.t1;
import l1.z;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    public static final class a extends s implements zd.l<w0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f2232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f2233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t1 f2234c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, z zVar, t1 t1Var) {
            super(1);
            this.f2232a = f10;
            this.f2233b = zVar;
            this.f2234c = t1Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("background");
            w0Var.a().c("alpha", Float.valueOf(this.f2232a));
            w0Var.a().c("brush", this.f2233b);
            w0Var.a().c("shape", this.f2234c);
        }
    }

    public static final class b extends s implements zd.l<w0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f2235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t1 f2236b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, t1 t1Var) {
            super(1);
            this.f2235a = j10;
            this.f2236b = t1Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("background");
            w0Var.c(j0.m(this.f2235a));
            w0Var.a().c("color", j0.m(this.f2235a));
            w0Var.a().c("shape", this.f2236b);
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, z zVar, t1 t1Var, float f10) {
        return eVar.h(new BackgroundElement(0L, zVar, f10, t1Var, u0.c() ? new a(f10, zVar, t1Var) : u0.a(), 1, null));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, z zVar, t1 t1Var, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            t1Var = m1.a();
        }
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        return a(eVar, zVar, t1Var, f10);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, long j10, t1 t1Var) {
        return eVar.h(new BackgroundElement(j10, null, 1.0f, t1Var, u0.c() ? new b(j10, t1Var) : u0.a(), 2, null));
    }

    public static /* synthetic */ androidx.compose.ui.e d(androidx.compose.ui.e eVar, long j10, t1 t1Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            t1Var = m1.a();
        }
        return c(eVar, j10, t1Var);
    }
}
