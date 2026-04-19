package x6;

import android.content.Context;
import android.os.Vibrator;
import jc.a;
import sc.j;

/* JADX INFO: loaded from: classes.dex */
public class e implements jc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f23050a;

    private void a(sc.b bVar, Context context) {
        d dVar = new d(new c((Vibrator) context.getSystemService("vibrator")));
        j jVar = new j(bVar, "vibration");
        this.f23050a = jVar;
        jVar.e(dVar);
    }

    private void b() {
        this.f23050a.e(null);
        this.f23050a = null;
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        a(bVar.b(), bVar.a());
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        b();
    }
}
