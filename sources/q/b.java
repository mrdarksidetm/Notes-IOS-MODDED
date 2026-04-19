package q;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import z.c0;

/* JADX INFO: loaded from: classes.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f18399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c0<i3.b, MenuItem> f18400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c0<i3.c, SubMenu> f18401c;

    b(Context context) {
        this.f18399a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof i3.b)) {
            return menuItem;
        }
        i3.b bVar = (i3.b) menuItem;
        if (this.f18400b == null) {
            this.f18400b = new c0<>();
        }
        MenuItem menuItem2 = this.f18400b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f18399a, bVar);
        this.f18400b.put(bVar, cVar);
        return cVar;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof i3.c)) {
            return subMenu;
        }
        i3.c cVar = (i3.c) subMenu;
        if (this.f18401c == null) {
            this.f18401c = new c0<>();
        }
        SubMenu subMenu2 = this.f18401c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        f fVar = new f(this.f18399a, cVar);
        this.f18401c.put(cVar, fVar);
        return fVar;
    }

    final void e() {
        c0<i3.b, MenuItem> c0Var = this.f18400b;
        if (c0Var != null) {
            c0Var.clear();
        }
        c0<i3.c, SubMenu> c0Var2 = this.f18401c;
        if (c0Var2 != null) {
            c0Var2.clear();
        }
    }

    final void f(int i10) {
        if (this.f18400b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f18400b.size()) {
            if (this.f18400b.g(i11).getGroupId() == i10) {
                this.f18400b.i(i11);
                i11--;
            }
            i11++;
        }
    }

    final void g(int i10) {
        if (this.f18400b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f18400b.size(); i11++) {
            if (this.f18400b.g(i11).getItemId() == i10) {
                this.f18400b.i(i11);
                return;
            }
        }
    }
}
