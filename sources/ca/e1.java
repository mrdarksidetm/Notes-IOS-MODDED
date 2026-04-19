package ca;

import com.google.android.gms.common.api.internal.a;

/* JADX INFO: loaded from: classes2.dex */
final class e1 implements a.InterfaceC0177a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a1 f6650a;

    e1(a1 a1Var) {
        this.f6650a = a1Var;
    }

    @Override // com.google.android.gms.common.api.internal.a.InterfaceC0177a
    public final void a(boolean z10) {
        if (z10) {
            this.f6650a.f6604c = true;
            this.f6650a.b();
        } else {
            this.f6650a.f6604c = false;
            if (this.f6650a.e()) {
                this.f6650a.f6603b.c();
            }
        }
    }
}
