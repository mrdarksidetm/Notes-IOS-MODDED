package w8;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class b0 extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f22597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ v8.f f22598b;

    b0(Intent intent, v8.f fVar, int i10) {
        this.f22597a = intent;
        this.f22598b = fVar;
    }

    @Override // w8.c0
    public final void a() {
        Intent intent = this.f22597a;
        if (intent != null) {
            this.f22598b.startActivityForResult(intent, 2);
        }
    }
}
