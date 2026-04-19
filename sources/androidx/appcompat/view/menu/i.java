package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f1292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f1293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f1296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j.a f1299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f1300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f1301k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f1302l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    static class b {
        static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public i(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    public i(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f1297g = 8388611;
        this.f1302l = new a();
        this.f1291a = context;
        this.f1292b = eVar;
        this.f1296f = view;
        this.f1293c = z10;
        this.f1294d = i10;
        this.f1295e = i11;
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f1291a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        h bVar = Math.min(point.x, point.y) >= this.f1291a.getResources().getDimensionPixelSize(j.d.f13368c) ? new androidx.appcompat.view.menu.b(this.f1291a, this.f1296f, this.f1294d, this.f1295e, this.f1293c) : new l(this.f1291a, this.f1292b, this.f1296f, this.f1294d, this.f1295e, this.f1293c);
        bVar.l(this.f1292b);
        bVar.u(this.f1302l);
        bVar.p(this.f1296f);
        bVar.h(this.f1299i);
        bVar.r(this.f1298h);
        bVar.s(this.f1297g);
        return bVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        h hVarC = c();
        hVarC.v(z11);
        if (z10) {
            if ((o3.h.a(this.f1297g, androidx.core.view.h.t(this.f1296f)) & 7) == 5) {
                i10 -= this.f1296f.getWidth();
            }
            hVarC.t(i10);
            hVarC.w(i11);
            int i12 = (int) ((this.f1291a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            hVarC.q(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        hVarC.b();
    }

    public void b() {
        if (d()) {
            this.f1300j.dismiss();
        }
    }

    public h c() {
        if (this.f1300j == null) {
            this.f1300j = a();
        }
        return this.f1300j;
    }

    public boolean d() {
        h hVar = this.f1300j;
        return hVar != null && hVar.a();
    }

    protected void e() {
        this.f1300j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1301k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f1296f = view;
    }

    public void g(boolean z10) {
        this.f1298h = z10;
        h hVar = this.f1300j;
        if (hVar != null) {
            hVar.r(z10);
        }
    }

    public void h(int i10) {
        this.f1297g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1301k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f1299i = aVar;
        h hVar = this.f1300j;
        if (hVar != null) {
            hVar.h(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f1296f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f1296f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }
}
