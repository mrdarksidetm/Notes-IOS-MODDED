package androidx.compose.foundation.layout;

import b2.u0;
import b2.w0;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements h0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f2502a = new f();

    public static final class a extends ae.s implements zd.l<w0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1.b f2503a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f1.b bVar) {
            super(1);
            this.f2503a = bVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("align");
            w0Var.c(this.f2503a);
        }
    }

    public static final class b extends ae.s implements zd.l<w0, i0> {
        public b() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("matchParentSize");
        }
    }

    private f() {
    }

    @Override // h0.c
    public androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return eVar.h(new BoxChildDataElement(f1.b.f11020a.e(), true, u0.c() ? new b() : u0.a()));
    }

    @Override // h0.c
    public androidx.compose.ui.e c(androidx.compose.ui.e eVar, f1.b bVar) {
        return eVar.h(new BoxChildDataElement(bVar, false, u0.c() ? new a(bVar) : u0.a()));
    }
}
