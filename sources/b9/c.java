package b9;

import com.google.android.gms.common.api.internal.e;

/* JADX INFO: loaded from: classes.dex */
final class c implements e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a9.h f5528a;

    c(d dVar, a9.h hVar) {
        this.f5528a = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.e.b
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((a9.a) obj).a(this.f5528a);
    }

    @Override // com.google.android.gms.common.api.internal.e.b
    public final void onNotifyListenerFailed() {
    }
}
