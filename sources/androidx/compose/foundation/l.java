package androidx.compose.foundation;

import a2.a1;
import a2.z0;
import ae.h0;
import ae.s;
import androidx.compose.ui.e;
import md.i0;
import y1.r0;
import y1.s0;

/* JADX INFO: loaded from: classes.dex */
final class l extends e.c implements a2.h, z0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private r0.a f2423n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2424o;

    static final class a extends s implements zd.a<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0<r0> f2425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f2426b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h0<r0> h0Var, l lVar) {
            super(0);
            this.f2425a = h0Var;
            this.f2426b = lVar;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f2425a.f712a = a2.i.a(this.f2426b, s0.a());
        }
    }

    private final r0 a2() {
        h0 h0Var = new h0();
        a1.a(this, new a(h0Var, this));
        return (r0) h0Var.f712a;
    }

    @Override // androidx.compose.ui.e.c
    public void M1() {
        r0.a aVar = this.f2423n;
        if (aVar != null) {
            aVar.release();
        }
        this.f2423n = null;
    }

    @Override // a2.z0
    public void R0() {
        r0 r0VarA2 = a2();
        if (this.f2424o) {
            r0.a aVar = this.f2423n;
            if (aVar != null) {
                aVar.release();
            }
            this.f2423n = r0VarA2 != null ? r0VarA2.a() : null;
        }
    }

    public final void b2(boolean z10) {
        r0.a aVarA = null;
        if (z10) {
            r0 r0VarA2 = a2();
            if (r0VarA2 != null) {
                aVarA = r0VarA2.a();
            }
        } else {
            r0.a aVar = this.f2423n;
            if (aVar != null) {
                aVar.release();
            }
        }
        this.f2423n = aVarA;
        this.f2424o = z10;
    }
}
