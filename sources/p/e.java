package p;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p.b;
import z.c0;

/* JADX INFO: loaded from: classes.dex */
public class e extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f17711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f17712b;

    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f17713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f17714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList<e> f17715c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final c0<Menu, Menu> f17716d = new c0<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f17714b = context;
            this.f17713a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f17716d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            q.d dVar = new q.d(this.f17714b, (i3.a) menu);
            this.f17716d.put(menu, dVar);
            return dVar;
        }

        @Override // p.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f17713a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // p.b.a
        public boolean b(b bVar, MenuItem menuItem) {
            return this.f17713a.onActionItemClicked(e(bVar), new q.c(this.f17714b, (i3.b) menuItem));
        }

        @Override // p.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f17713a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // p.b.a
        public void d(b bVar) {
            this.f17713a.onDestroyActionMode(e(bVar));
        }

        public ActionMode e(b bVar) {
            int size = this.f17715c.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f17715c.get(i10);
                if (eVar != null && eVar.f17712b == bVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f17714b, bVar);
            this.f17715c.add(eVar2);
            return eVar2;
        }
    }

    public e(Context context, b bVar) {
        this.f17711a = context;
        this.f17712b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f17712b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f17712b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new q.d(this.f17711a, (i3.a) this.f17712b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f17712b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f17712b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f17712b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f17712b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f17712b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f17712b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f17712b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f17712b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f17712b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f17712b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f17712b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f17712b.q(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f17712b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f17712b.s(z10);
    }
}
