package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.f;
import rc.e;

/* JADX INFO: loaded from: classes2.dex */
public class c implements f.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rc.e f12797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f.b f12798b = new f.b();

    public c(rc.e eVar) {
        this.f12797a = eVar;
    }

    @Override // io.flutter.embedding.android.f.d
    public void a(KeyEvent keyEvent, final f.d.a aVar) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            this.f12797a.e(new e.b(keyEvent, this.f12798b.a(keyEvent.getUnicodeChar())), action != 0, new e.a() { // from class: dc.q
                @Override // rc.e.a
                public final void a(boolean z10) {
                    aVar.a(z10);
                }
            });
        } else {
            aVar.a(false);
        }
    }
}
