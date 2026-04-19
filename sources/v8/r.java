package v8;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public final class r extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.api.d f22273c;

    public r(com.google.android.gms.common.api.d dVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f22273c = dVar;
    }

    @Override // com.google.android.gms.common.api.e
    public final <A extends a.b, R extends u8.h, T extends com.google.android.gms.common.api.internal.b<R, A>> T a(T t10) {
        return (T) this.f22273c.doRead(t10);
    }

    @Override // com.google.android.gms.common.api.e
    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.b<? extends u8.h, A>> T b(T t10) {
        return (T) this.f22273c.doWrite(t10);
    }

    @Override // com.google.android.gms.common.api.e
    public final Context e() {
        return this.f22273c.getApplicationContext();
    }

    @Override // com.google.android.gms.common.api.e
    public final Looper f() {
        return this.f22273c.getLooper();
    }

    @Override // com.google.android.gms.common.api.e
    public final void i(com.google.android.gms.common.api.internal.k0 k0Var) {
    }

    @Override // com.google.android.gms.common.api.e
    public final void j(com.google.android.gms.common.api.internal.k0 k0Var) {
    }
}
