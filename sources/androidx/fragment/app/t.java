package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class t<H> extends k4.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f4229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f4230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f4231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f4233e;

    public t(Activity activity, Context context, Handler handler, int i10) {
        ae.r.f(context, "context");
        ae.r.f(handler, "handler");
        this.f4229a = activity;
        this.f4230b = context;
        this.f4231c = handler;
        this.f4232d = i10;
        this.f4233e = new x();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(o oVar) {
        this(oVar, oVar, new Handler(), 0);
        ae.r.f(oVar, "activity");
    }

    @Override // k4.i
    public View c(int i10) {
        return null;
    }

    @Override // k4.i
    public boolean d() {
        return true;
    }

    public final Activity e() {
        return this.f4229a;
    }

    public final Context f() {
        return this.f4230b;
    }

    public final w g() {
        return this.f4233e;
    }

    public final Handler h() {
        return this.f4231c;
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        ae.r.f(str, "prefix");
        ae.r.f(printWriter, "writer");
    }

    public abstract H j();

    public LayoutInflater k() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f4230b);
        ae.r.e(layoutInflaterFrom, "from(context)");
        return layoutInflaterFrom;
    }

    public void l(n nVar, String[] strArr, int i10) {
        ae.r.f(nVar, "fragment");
        ae.r.f(strArr, "permissions");
    }

    public boolean m(String str) {
        ae.r.f(str, "permission");
        return false;
    }

    public void n(n nVar, Intent intent, int i10, Bundle bundle) {
        ae.r.f(nVar, "fragment");
        ae.r.f(intent, "intent");
        if (!(i10 == -1)) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host".toString());
        }
        androidx.core.content.a.startActivity(this.f4230b, intent, bundle);
    }

    public void o(n nVar, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        ae.r.f(nVar, "fragment");
        ae.r.f(intentSender, "intent");
        if (!(i10 == -1)) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
        }
        Activity activity = this.f4229a;
        if (activity == null) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
        }
        androidx.core.app.a.l(activity, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public void p() {
    }
}
