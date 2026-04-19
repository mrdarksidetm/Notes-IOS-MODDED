package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;

/* JADX INFO: loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f1259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.b f1260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f1261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j.a f1262d;

    public f(e eVar) {
        this.f1259a = eVar;
    }

    public void a() {
        androidx.appcompat.app.b bVar = this.f1260b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        e eVar = this.f1259a;
        b.a aVar = new b.a(eVar.u());
        c cVar = new c(aVar.b(), j.g.f13442j);
        this.f1261c = cVar;
        cVar.h(this);
        this.f1259a.b(this.f1261c);
        aVar.c(this.f1261c.a(), this);
        View viewY = eVar.y();
        if (viewY != null) {
            aVar.d(viewY);
        } else {
            aVar.e(eVar.w()).n(eVar.x());
        }
        aVar.j(this);
        androidx.appcompat.app.b bVarA = aVar.a();
        this.f1260b = bVarA;
        bVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1260b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1260b.show();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(e eVar, boolean z10) {
        if (z10 || eVar == this.f1259a) {
            a();
        }
        j.a aVar = this.f1262d;
        if (aVar != null) {
            aVar.c(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d(e eVar) {
        j.a aVar = this.f1262d;
        if (aVar != null) {
            return aVar.d(eVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f1259a.L((g) this.f1261c.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1261c.c(this.f1259a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1260b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1260b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1259a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1259a.performShortcut(i10, keyEvent, 0);
    }
}
