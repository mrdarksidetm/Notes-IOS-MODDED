package w6;

import android.app.Activity;
import android.content.Context;
import jc.a;

/* JADX INFO: loaded from: classes.dex */
public final class m implements jc.a, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q f22495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private sc.j f22496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kc.c f22497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l f22498d;

    private void a() {
        kc.c cVar = this.f22497c;
        if (cVar != null) {
            cVar.d(this.f22495a);
            this.f22497c.c(this.f22495a);
        }
    }

    private void b() {
        kc.c cVar = this.f22497c;
        if (cVar != null) {
            cVar.b(this.f22495a);
            this.f22497c.a(this.f22495a);
        }
    }

    private void c(Context context, sc.b bVar) {
        this.f22496b = new sc.j(bVar, "flutter.baseflow.com/permissions/methods");
        l lVar = new l(context, new a(), this.f22495a, new u());
        this.f22498d = lVar;
        this.f22496b.e(lVar);
    }

    private void d(Activity activity) {
        q qVar = this.f22495a;
        if (qVar != null) {
            qVar.i(activity);
        }
    }

    private void e() {
        this.f22496b.e(null);
        this.f22496b = null;
        this.f22498d = null;
    }

    private void f() {
        q qVar = this.f22495a;
        if (qVar != null) {
            qVar.i(null);
        }
    }

    @Override // kc.a
    public void onAttachedToActivity(kc.c cVar) {
        d(cVar.getActivity());
        this.f22497c = cVar;
        b();
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        this.f22495a = new q(bVar.a());
        c(bVar.a(), bVar.b());
    }

    @Override // kc.a
    public void onDetachedFromActivity() {
        f();
        a();
        this.f22497c = null;
    }

    @Override // kc.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        e();
    }

    @Override // kc.a
    public void onReattachedToActivityForConfigChanges(kc.c cVar) {
        onAttachedToActivity(cVar);
    }
}
