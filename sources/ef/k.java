package ef;

import android.app.Activity;
import android.content.Context;
import jc.a;

/* JADX INFO: loaded from: classes2.dex */
public class k implements jc.a, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f11002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private sc.j f11003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f11004c;

    private void a(Context context) {
        if (context == null || this.f11003b == null) {
            return;
        }
        a aVar = new a(context, this.f11003b);
        this.f11004c = aVar;
        this.f11003b.e(aVar);
    }

    private void b(sc.b bVar) {
        this.f11003b = new sc.j(bVar, "net.nfet.printing");
        if (this.f11002a != null) {
            a aVar = new a(this.f11002a, this.f11003b);
            this.f11004c = aVar;
            this.f11003b.e(aVar);
        }
    }

    @Override // kc.a
    public void onAttachedToActivity(kc.c cVar) {
        if (this.f11002a != null) {
            this.f11002a = null;
        }
        Activity activity = cVar.getActivity();
        this.f11002a = activity;
        a(activity);
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        this.f11002a = bVar.a();
        b(bVar.b());
    }

    @Override // kc.a
    public void onDetachedFromActivity() {
        this.f11003b.e(null);
        this.f11002a = null;
        this.f11004c = null;
    }

    @Override // kc.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f11003b.e(null);
        this.f11003b = null;
        this.f11004c = null;
    }

    @Override // kc.a
    public void onReattachedToActivityForConfigChanges(kc.c cVar) {
        this.f11002a = null;
        Activity activity = cVar.getActivity();
        this.f11002a = activity;
        a(activity);
    }
}
