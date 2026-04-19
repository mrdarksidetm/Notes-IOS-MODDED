package fd;

import android.util.Log;
import fd.a;
import jc.a;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements jc.a, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f11230a;

    @Override // kc.a
    public void onAttachedToActivity(kc.c cVar) {
        h hVar = this.f11230a;
        if (hVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            hVar.y(cVar.getActivity());
        }
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        this.f11230a = new h(bVar.a());
        a.d.l(bVar.b(), this.f11230a);
    }

    @Override // kc.a
    public void onDetachedFromActivity() {
        h hVar = this.f11230a;
        if (hVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            hVar.y(null);
        }
    }

    @Override // kc.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        if (this.f11230a == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
        } else {
            a.d.l(bVar.b(), null);
            this.f11230a = null;
        }
    }

    @Override // kc.a
    public void onReattachedToActivityForConfigChanges(kc.c cVar) {
        onAttachedToActivity(cVar);
    }
}
